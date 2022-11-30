package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.TipoProductoDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoProductoDAO {

    private final ConexionSQL CON;
    private PreparedStatement ps;
    private ResultSet rs;

    public TipoProductoDAO () {
        CON = ConexionSQL.getInstance();
    }

    public List<TipoProductoDTO> listar () {
        List<TipoProductoDTO> tiposProducto = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM TipoProducto");
            rs = ps.executeQuery();
            while (rs.next()) {
                tiposProducto.add(new TipoProductoDTO(
                        rs.getByte(1), // idTipoProducto
                        rs.getString(2)));  // descripción
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            ps = null;
            rs = null;
            CON.cerrarConexion();
        }
        return tiposProducto;
    }

}
