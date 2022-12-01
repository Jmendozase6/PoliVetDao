package businessobject;

import dataaccessobject.UsuarioDAO;
import datatransferobject.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class UsuarioControl {

    private final UsuarioDAO DATOS;
    private final UsuarioDTO obj;
    private DefaultTableModel modeloTabla;

    public UsuarioControl () {
        this.DATOS = new UsuarioDAO();
        this.obj = new UsuarioDTO();
    }

    public DefaultTableModel listar (String columna, String texto, byte idRol, byte estadoRegistro) {
        List<UsuarioDTO> lista = new ArrayList();
        lista.addAll(DATOS.listar(columna, texto, idRol, estadoRegistro));

        String[] titulos = {"ID", "Id Rol", "Nombres", "Apellidos", "Id Genero", "Fecha nacimiento", "Tipo Documento", "Documento", "Dirección", "Teléfono", "Email", "Password", "Estado"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String estado;
        String[] registro = new String[titulos.length];
        for (UsuarioDTO item : lista) {
            if (item.getEstado() == 1) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            registro[0] = Integer.toString(item.getIdUsuario());
            registro[1] = Short.toString(item.getIdRol());
            registro[2] = item.getNombre();
            registro[3] = item.getApellidos();
            registro[4] = Byte.toString(item.getIdGenero());
            registro[5] = item.getFechaNacimiento();
            registro[6] = Byte.toString(item.getIdTipoDocumento());
            registro[7] = item.getDocumento();
            registro[8] = item.getDireccion();
            registro[9] = item.getTelefonoMovil();
            registro[10] = item.getEmail();
            registro[11] = item.getPassword();
            registro[12] = estado;
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }

    public String actualizarPassword (String email, String password) {
        if (DATOS.actualizarPassword(email, password)) {
            return "OK";
        } else {
            return "No se puede actualizar la contraseña.";
        }
    }

    public String existeEmail (String email) {
        if (DATOS.existeEmail(email)) {
            return "OK";
        } else {
            return "No existe el email";
        }
    }

    /**
     * 0 No existe el usuario, 1 Se logeo el usuario correctamente, 2 está
     * inactivo
     *
     * @param email
     * @param password
     * @return
     */
    public String login (String email, String password) {
        UsuarioDTO usuario = DATOS.login(email, password);
        if (usuario == null) {
            return "0";
        }
        if (usuario.getEstado() == 1) {
            UsuarioActivo.idUsuario = usuario.getIdUsuario();
            UsuarioActivo.idRol = usuario.getIdRol();
            UsuarioActivo.email = usuario.getEmail();
            UsuarioActivo.password = usuario.getPassword();
            return "1";
        } else {
            return "2";
        }
    }

    public String agregar (short idRol, String nombre, String apellidos, byte idGenero, String fechaNacimiento, byte idTipoDocumento, String documento, String direccion, String telefonoMovil, String email, String password) {
        if (DATOS.existe(email, documento)) {
            return "El registro ya existe.";
        } else {
            obj.setIdRol(idRol);
            obj.setNombre(nombre.trim());
            obj.setApellidos(apellidos.trim());
            obj.setIdGenero(idGenero);
            obj.setFechaNacimiento(fechaNacimiento.trim());
            obj.setIdTipoDocumento(idTipoDocumento);
            obj.setDocumento(documento.trim());
            obj.setDireccion(direccion.trim());
            obj.setTelefonoMovil(telefonoMovil.trim());
            obj.setEmail(email.trim());
            obj.setPassword(password.trim());

            if (DATOS.agregar(obj)) {
                return "OK";
            } else {
                return "Error en el registro.";
            }
        }
    }

    public UsuarioDTO traerUsuarioActualizar () {
        return DATOS.traerUsuarioActualizar();
    }

    public String actualizar (UsuarioDTO objeto) {
        if (DATOS.actualizar(objeto)) {
            return "OK";
        } else {
            return "No se puede actualizar el registro";
        }
    }

    public DefaultComboBoxModel seleccionarCliente () {
        return new DefaultComboBoxModel(DATOS.seleccionarCliente().toArray());
    }

    public String desactivar (int id) {
        if (DATOS.desactivar(id)) {
            return "OK";
        } else {
            return "No se puede desactivar el registro";
        }
    }

    public String activar (int id) {
        if (DATOS.activar(id)) {
            return "OK";
        } else {
            return "No se puede activar el registro";
        }
    }

    public String actualizarRol (int idUsuario, int idRol) {
        if (DATOS.actualizarRol(idUsuario, idRol)) {
            return "OK";
        } else {
            return "No se puede modificar el rol del registro";
        }
    }

}
