package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.RolDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RolDAO {

    private final Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public RolDAO () {
        conn = ConexionSQL.getConnection();
    }

    public List<RolDTO> listar () {
        List<RolDTO> roles = new ArrayList();
        try {
            ps = conn.prepareStatement("SELECT * FROM Rol");
            rs = ps.executeQuery();
            while (rs.next()) {
                roles.add(new RolDTO(
                        rs.getInt(1), // idMascota
                        rs.getString(2)));  // peso
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            ps = null;
            rs = null;
            //ConexionSQL.cerrarConexion();
        }
        return roles;
    }
}
