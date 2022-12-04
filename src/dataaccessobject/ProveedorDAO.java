package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO {

    private final Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public ProveedorDAO () {
        conn = ConexionSQL.getConnection();
    }

    public List<String> seleccionar () {
        List<String> usuarios = new ArrayList();
        try {
            ps = conn.prepareStatement("SELECT idUsuario, nombres, apellidos FROM Usuario WHERE idRol = 3");
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
            //ConexionSQL.cerrarConexion();
        }
        return usuarios;
    }
}
