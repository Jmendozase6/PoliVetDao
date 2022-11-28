package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.TipoMascotaDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoMascotaDAO {

    private final ConexionSQL CON;
    private PreparedStatement ps;
    private ResultSet rs;

    public TipoMascotaDAO () {
        CON = ConexionSQL.getInstance();
    }

    public List<TipoMascotaDTO> listar () {
        List<TipoMascotaDTO> mascotas = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM TipoMascota");
            rs = ps.executeQuery();
            while (rs.next()) {
                mascotas.add(new TipoMascotaDTO(
                        rs.getInt(1), // idMascota
                        rs.getString(2)));  // peso
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

}
