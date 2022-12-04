package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.ReservaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO implements IReserva<ReservaDTO> {

    private final Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ReservaDAO () {
        conn = ConexionSQL.getConnection();
    }

    @Override
    public List<ReservaDTO> listar (String fecha, String rango, String fechaRangoMaximo) {
        List<ReservaDTO> reservas = new ArrayList();

        try {
            if (rango.equals("Especifica")) {
                ps = conn.prepareStatement("SELECT * FROM Reserva WHERE fecha = '" + fecha + "'");
            }
            if (rango.equals("Proximas")) {
                ps = conn.prepareStatement("SELECT * FROM Reserva WHERE fecha > '" + fecha + "'");
            }
            if (rango.equals("Pasadas")) {
                ps = conn.prepareStatement("SELECT * FROM Reserva WHERE fecha < '" + fecha + "'");
            }
            if (rango.equals("Entre dos")) {
                ps = conn.prepareStatement("SELECT * FROM Reserva WHERE fecha BETWEEN '" + fecha + "' AND '" + fechaRangoMaximo + "'");
            }

            rs = ps.executeQuery();
            while (rs.next()) {
                reservas.add(new ReservaDTO(
                        rs.getInt(1),
                        rs.getInt(2),
                        String.valueOf(rs.getDate(3)),
                        rs.getString(4)));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            ps = null;
            rs = null;
            //ConexionSQL.cerrarConexion();
        }
        return reservas;
    }

    @Override
    public boolean agregar (ReservaDTO objeto) {
        resp = false;

        try {

            ps = conn.prepareStatement("INSERT INTO Reserva (idMascota, fecha, descripcion) VALUES (?, ?, ?)");
            ps.setInt(1, objeto.getIdMascota());
            ps.setString(2, objeto.getFecha());
            ps.setString(3, objeto.getDescripcion());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            ps = null;
            //ConexionSQL.cerrarConexion();
        }
        return resp;
    }

    @Override
    public boolean actualizar (ReservaDTO objeto) {
        resp = false;
        try {

            ps = conn.prepareStatement("UPDATE Reserva SET fecha = ?, descripcion = ? WHERE idReserva = ?");
            ps.setString(1, objeto.getFecha());
            ps.setString(2, objeto.getDescripcion());
            ps.setInt(3, objeto.getIdReserva());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps = null;
            //ConexionSQL.cerrarConexion();
        }
        return resp;
    }

}
