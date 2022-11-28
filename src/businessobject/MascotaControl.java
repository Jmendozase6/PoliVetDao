package businessobject;

import dataaccessobject.MascotaDAO;
import datatransferobject.MascotaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MascotaControl {

    private final MascotaDAO DATOS;
    private final MascotaDTO obj;
    private DefaultTableModel modeloTabla;

    public MascotaControl () {
        this.DATOS = new MascotaDAO();
        this.obj = new MascotaDTO();
    }

    public DefaultTableModel listar (String columna, String texto, byte idRol, byte estadoRegistro) {
        List<MascotaDTO> lista = new ArrayList();
        lista.addAll(DATOS.listar(columna, texto, idRol, estadoRegistro));

        String[] titulos = {"ID", "Id Usuario", "Id Tipo de Mascota", "Nombre", "Raza", "Genero", "Peso"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[7];
        for (MascotaDTO item : lista) {
            registro[0] = Integer.toString(item.getIdMascota());
            registro[1] = Integer.toString(item.getIdUsuario());
            registro[2] = Integer.toString(item.getIdTipoMascota());
            registro[3] = item.getNombre();
            registro[4] = item.getRaza();
            registro[5] = item.getGenero();
            registro[6] = item.getPeso();
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }

    public String agregar (int idUsuario, int idTipoMascota, String nombre, String raza, String genero, String peso) {
        obj.setIdUsuario(idUsuario);
        obj.setIdTipoMascota(idTipoMascota);
        obj.setNombre(nombre);
        obj.setRaza(raza);
        obj.setGenero(genero);
        obj.setPeso(peso);

        if (DATOS.agregar(obj)) {
            return "OK";
        } else {
            return "Error en el registro.";
        }
    }

    public String actualizar (MascotaDTO objeto) {
        if (DATOS.actualizar(objeto)) {
            return "OK";
        } else {
            return "No se puede actualizar el registro";
        }
    }

}
