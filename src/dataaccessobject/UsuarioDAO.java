package dataaccessobject;

import businessobject.EncriptacionAES;
import businessobject.UsuarioActivo;
import datasource.ConexionSQL;
import datatransferobject.UsuarioDTO;
import interfaces.IUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements IUsuario<UsuarioDTO> {

    private final ConexionSQL CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    EncriptacionAES aes = new EncriptacionAES();

    public UsuarioDAO () {
        CON = ConexionSQL.getInstance();
    }

    @Override
    public List<UsuarioDTO> listar (String columna, String texto, byte idRol, byte estado) {
        List<UsuarioDTO> usuarios = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM Usuario WHERE " + columna + " LIKE '%" + texto + "%' AND idRol = ? AND estado = ?");
            ps.setByte(1, idRol);
            ps.setByte(2, estado);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuarios.add(new UsuarioDTO(
                        rs.getInt(1), // idUsuario
                        rs.getShort(2), // idRol
                        rs.getString(3), // nombre
                        rs.getString(4), // apellidos
                        rs.getByte(5), // idGenero
                        rs.getString(6), // fechaNacimiento
                        rs.getByte(7), // idTipoDocumento
                        rs.getString(8), // documento
                        rs.getString(9), // direccion
                        rs.getString(10), // telefonoMovil
                        rs.getString(11), // email
                        rs.getString(12), // password
                        rs.getByte(13))); // estado
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            ps = null;
            rs = null;
            CON.cerrarConexion();
        }
        return usuarios;
    }

    public List<String> seleccionarCliente () {
        List<String> usuarios = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT idUsuario, nombres, apellidos FROM Usuario WHERE idUsuario = 2");
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioDTO usuario = new UsuarioDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
                usuarios.add(usuario.toString());
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            ps = null;
            rs = null;
            CON.cerrarConexion();
        }
        return usuarios;
    }

    public UsuarioDTO login (String email, String password) {
        UsuarioDTO usuario = null;

        String passwordEncriptada = aes.encriptar(password);

        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM Usuario WHERE email = ? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, passwordEncriptada);
            rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new UsuarioDTO(
                        rs.getInt(1), // idUsuario
                        rs.getShort(2), // idRol
                        rs.getString(3), // nombre
                        rs.getString(4), // apellidos
                        rs.getByte(5), // idGenero
                        rs.getString(6), // fechaNacimiento
                        rs.getByte(7), // idTipoDocumento
                        rs.getString(8), // documento
                        rs.getString(9), // direccion
                        rs.getString(10), // telefonoMovil
                        rs.getString(11), // email
                        rs.getString(12), // password
                        rs.getByte(13)); // estado
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.cerrarConexion();
        }
        return usuario;
    }

    public boolean actualizarPassword (String email, String pass) {
        resp = false;
        String passwordEncriptada = aes.encriptar(pass);
        try {
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET password = ? WHERE email = ?");
            ps.setString(1, passwordEncriptada);
            ps.setString(2, email);

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps = null;
            CON.cerrarConexion();
        }
        return resp;
    }

    @Override
    public boolean agregar (UsuarioDTO objeto) {
        resp = false;
        String passwordEncriptada = aes.encriptar(objeto.getPassword());
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO Usuario(idRol, nombres, apellidos, idGenero, fechaNacimiento, idTipoDocumento, documento, direccion, telefonoMovil, email, password, estado) VALUES (?,?,?,?,?,?,?,?,?,?,?,1)");
            ps.setShort(1, objeto.getIdRol());
            ps.setString(2, objeto.getNombre());
            ps.setString(3, objeto.getApellidos());
            ps.setByte(4, objeto.getIdGenero());
            ps.setString(5, objeto.getFechaNacimiento());
            ps.setByte(6, objeto.getIdTipoDocumento());
            ps.setString(7, objeto.getDocumento());
            ps.setString(8, objeto.getDireccion());
            ps.setString(9, objeto.getTelefonoMovil());
            ps.setString(10, objeto.getEmail());
            ps.setString(11, passwordEncriptada);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            ps = null;
            CON.cerrarConexion();
        }
        return resp;
    }

    @Override
    public boolean actualizar (UsuarioDTO objeto) {
        resp = false;

        try {
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET nombres = ?, apellidos = ?, idGenero = ?, fechaNacimiento = ?, documento = ?, direccion = ?, telefonoMovil = ?, email = ? WHERE idUsuario = ?");
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getApellidos());
            ps.setByte(3, objeto.getIdGenero());
            ps.setString(4, objeto.getFechaNacimiento());
            ps.setString(5, objeto.getDocumento());
            ps.setString(6, objeto.getDireccion());
            ps.setString(7, objeto.getTelefonoMovil());
            ps.setString(8, objeto.getEmail());
            ps.setInt(9, objeto.getIdUsuario());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps = null;
            CON.cerrarConexion();
        }
        return resp;
    }

    @Override
    public boolean desactivar (int id) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET estado = 0 WHERE idUsuario = ?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps = null;
            CON.cerrarConexion();
        }
        return resp;
    }

    @Override
    public boolean activar (int id) {

        resp = false;

        try {
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET estado = 1 WHERE idUsuario = ?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps = null;
            CON.cerrarConexion();
        }
        return resp;
    }

    public boolean actualizarRol (int idUsuario, int idRol) {

        resp = false;

        try {
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET idRol = ? WHERE idUsuario = ?");
            ps.setInt(1, idRol);
            ps.setInt(2, idUsuario);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps = null;
            CON.cerrarConexion();
        }
        return resp;
    }

    public UsuarioDTO traerUsuarioActualizar () {
        UsuarioDTO usuario = new UsuarioDTO();
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM Usuario WHERE idUsuario = " + UsuarioActivo.idUsuario + " AND estado = 1");
            rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new UsuarioDTO(
                        rs.getInt(1), // idUsuario
                        rs.getShort(2), // idRol
                        rs.getString(3), // nombre
                        rs.getString(4), // apellidos
                        rs.getByte(5), // idGenero
                        rs.getString(6), // fechaNacimiento
                        rs.getByte(7), // idTipoDocumento
                        rs.getString(8), // documento
                        rs.getString(9), // direccion
                        rs.getString(10), // telefonoMovil
                        rs.getString(11), // email
                        rs.getString(12), // password
                        rs.getByte(13)); // estado 
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            ps = null;
            rs = null;
            CON.cerrarConexion();
        }
        return usuario;
    }

    @Override
    public boolean existe (String email, String documento) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("SELECT email, documento FROM Usuario WHERE email = ? OR documento = ?");
            ps.setString(1, email);
            ps.setString(2, documento);
            rs = ps.executeQuery();
            rs.next();
            if (rs.getRow() > 0) {
                resp = true;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            ps = null;
            rs = null;
            CON.cerrarConexion();
        }
        return resp;
    }

    public boolean existeEmail (String email) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("SELECT email FROM Usuario WHERE email = ?");
            ps.setString(1, email);

            rs = ps.executeQuery();
            rs.next();
            if (rs.getRow() > 0) {
                resp = true;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            ps = null;
            rs = null;
            CON.cerrarConexion();
        }
        return resp;
    }

}
