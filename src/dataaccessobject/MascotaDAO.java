package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.MascotaDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MascotaDAO implements IMascota<MascotaDTO> {

    private final ConexionSQL CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public MascotaDAO () {
        CON = ConexionSQL.getInstance();
    }

    @Override
    public List<MascotaDTO> listar (String columna, String texto, byte idRol, byte estado) {
        List<MascotaDTO> mascotas = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT m.* FROM Mascota as m INNER JOIN Usuario as u ON u.idUsuario = m.idUsuario WHERE nombre LIKE '%" + texto + "%' AND u.estado = ?");
            ps.setByte(1, estado);
            rs = ps.executeQuery();
            while (rs.next()) {
                mascotas.add(new MascotaDTO(
                        rs.getInt(1), // idMascota
                        rs.getInt(2), // idUsuario
                        rs.getInt(3), // idTipoMascota
                        rs.getString(4), // nombre
                        rs.getString(5), // raza
                        rs.getString(6), // genero
                        rs.getString(7)));  // peso
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            ps = null;
            rs = null;
            CON.cerrarConexion();
        }
        return mascotas;
    }

    @Override
    public boolean agregar (MascotaDTO objeto) {
        resp = false;

        try {
            ps = CON.conectar().prepareStatement("INSERT INTO Mascota (idUsuario, idTipoMascota, nombre, raza, genero, peso) VALUES (?,?,?,?,?,?)");
            ps.setInt(1, objeto.getIdUsuario());
            ps.setInt(2, objeto.getIdTipoMascota());
            ps.setString(3, objeto.getNombre());
            ps.setString(4, objeto.getRaza());
            ps.setString(5, objeto.getGenero());
            ps.setString(6, objeto.getPeso());
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
    public boolean actualizar (MascotaDTO objeto) {
        resp = false;

        try {

            ps = CON.conectar().prepareStatement("UPDATE Mascota SET nombre = ?, raza = ?, peso = ? WHERE idMascota = ?");
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getRaza());
            ps.setString(3, objeto.getPeso());
            ps.setInt(4, objeto.getIdMascota());

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

    public List<String> seleccionar () {
        List<String> mascotas = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT idMascota, CASE WHEN idTipoMascota = 1 THEN 'Can' WHEN idTipoMascota = 2 THEN 'Minino' END AS 'Tipo Mascota', nombre FROM Mascota");
            rs = ps.executeQuery();
            while (rs.next()) {
                MascotaDTO mascota = new MascotaDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
                mascotas.add(mascota.toString());
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
        return mascotas;
    }

}
