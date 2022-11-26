package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.UsuarioDTO;
import interfaces.IUsuario;
import java.sql.Date;
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

    public UsuarioDAO () {
        CON = ConexionSQL.getInstance();
    }

    @Override
    public List<UsuarioDTO> listar (String columna, String texto, byte idRol) {
        List<UsuarioDTO> usuarios = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM Usuario WHERE " + columna + " LIKE '%" + texto + "%' AND idRol = ?");
            ps.setByte(1, idRol);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuarios.add(new UsuarioDTO(
                        rs.getInt(1), // idUsuario
                        rs.getShort(2), // idRol
                        rs.getString(3), // nombre
                        rs.getString(4), // apellidos
                        rs.getByte(5), // idGenero
                        rs.getDate(6), // fechaNacimiento
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

    public UsuarioDTO login (String email, String password) {
        UsuarioDTO usuario = null;

        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM Usuario WHERE email = ? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new UsuarioDTO(
                        rs.getInt(1), // idUsuario
                        rs.getShort(2), // idRol
                        rs.getString(3), // nombre
                        rs.getString(4), // apellidos
                        rs.getByte(5), // idGenero
                        rs.getDate(6), // fechaNacimiento
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
        try {
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET password = ? WHERE email = ?");
            ps.setString(1, pass);
            ps.setString(2, email);

            if (ps.executeUpdate() > 0) {
                resp = true;
            } else {
                System.out.println("Filas afectadas menor k 0 k wea");
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
            ps.setString(11, objeto.getPassword());
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
    public boolean actualizar (UsuarioDTO objeto) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET idRol = ?, nombres = ?, apellidos = ?, idGenero = ?, fechaNacimiento = ?, idTipoDocumento = ?, documento = ?, direccion = ?, telefonoMovil = ?, email = ?, password = ? WHERE idUsuario = ?");
            ps.setShort(1, objeto.getIdRol());
            ps.setString(2, objeto.getNombre());
            ps.setString(3, objeto.getApellidos());
            ps.setByte(4, objeto.getIdGenero());
            Date fechaNacimiento = Date.valueOf(objeto.getFechaNacimiento());
            ps.setDate(5, fechaNacimiento);
            ps.setByte(6, objeto.getIdTipoDocumento());
            ps.setString(7, objeto.getDocumento());
            ps.setString(8, objeto.getDireccion());
            ps.setString(9, objeto.getTelefonoMovil());
            ps.setString(10, objeto.getEmail());
            ps.setString(11, objeto.getPassword());
            ps.setInt(12, objeto.getIdUsuario());

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
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET estado = 0 WHERE id = ?");
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
            ps = CON.conectar().prepareStatement("UPDATE Usuario SET estado = 1 WHERE id = ?");
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
