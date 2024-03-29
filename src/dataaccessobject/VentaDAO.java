package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.VentaDTO;
import datatransferobject.VentaDetalleDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentaDAO implements CrudVentaInterface<VentaDTO, VentaDetalleDTO> {

    private final Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public VentaDAO () {
        conn = ConexionSQL.getConnection();
    }

    @Override
    public List<VentaDTO> listar (String numeroComprobante) {
        List<VentaDTO> ventas = new ArrayList();
        try {
            ps = conn.prepareStatement("SELECT v.idVenta, v.idUsuario, (u.nombres + ' ' + u.apellidos ) as usuarioNombre, v.numeroComprobante , v.fechaVenta, v.total FROM Venta as v INNER JOIN Usuario u ON v.idUsuario = u.idUsuario WHERE v.numeroComprobante LIKE ? ORDER BY v.idVenta");
            ps.setString(1, "%" + numeroComprobante + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                ventas.add(new VentaDTO(
                        rs.getInt(1), // idVenta
                        rs.getInt(2), // idUsuario
                        rs.getString(3), // nombreUsuario
                        rs.getString(4), // numeroComprobante
                        rs.getString(5), // fecha
                        rs.getDouble(6) // total
                ));  // peso
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            ps = null;
            rs = null;
            //ConexionSQL.cerrarConexion();
        }
        return ventas;
    }

    @Override
    public List<VentaDetalleDTO> listarDetalle (int idVenta) {
        List<VentaDetalleDTO> registros = new ArrayList();
        try {
            ps = conn.prepareStatement("SELECT v.idProducto, p.nombre, p.cantidad, v.cantidad, v.precio FROM VentaDetalle as v INNER JOIN Producto as p ON v.idProducto = p.idProducto WHERE v.idVenta = ?");
            ps.setInt(1, idVenta);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new VentaDetalleDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            //ConexionSQL.cerrarConexion();
        }
        return registros;
    }

    @Override
    public boolean insertar (VentaDTO obj) {

        Connection conn = null;

        try {
            conn = ConexionSQL.getConnection();
            conn.setAutoCommit(false);

            String sqlInsertVenta = "INSERT INTO Venta (idUsuario, numeroComprobante, nombreUsuario, fechaVenta, total) VALUES (?, ?, ?, ?, ?)";

            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            ps = conn.prepareStatement(sqlInsertVenta, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, obj.getIdUsuario());
            ps.setString(2, obj.getNumeroComprobante());
            ps.setString(3, obj.getNombreUsuario());
            ps.setString(4, formatter.format(date));
            ps.setDouble(5, obj.getTotal());

            int filasAfectadas = ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            int idGenerado = 0;
            if (rs.next()) {
                idGenerado = rs.getInt(1);
            }

            if (filasAfectadas == 1) {
                String sqlInsertDetalle = "INSERT INTO VentaDetalle (idVenta, idProducto, nombreProducto, stockProducto, cantidad, precio) VALUES (?, ?, ?, ?, ?, ?)";
                ps = conn.prepareStatement(sqlInsertDetalle);
                for (VentaDetalleDTO item : obj.getDetalles()) {
                    ps.setInt(1, idGenerado);
                    ps.setInt(2, item.getIdProducto());
                    ps.setString(3, item.getNombreProducto());
                    ps.setInt(4, item.getStockProducto());
                    ps.setInt(5, item.getCantidad());
                    ps.setDouble(6, item.getPrecio());
                    resp = ps.executeUpdate() > 0;
                }
                conn.commit();
            } else {

                conn.rollback();
            }
        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(VentaDTO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentaDTO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resp;

    }

    @Override
    public boolean existe (String numeroComprobante) {
        resp = false;
        try {
            ps = conn.prepareStatement("SELECT idVenta FROM venta WHERE numeroComprobante = ?");
            ps.setString(1, numeroComprobante);

            rs = ps.executeQuery();
            rs.next();
            if (rs.getRow() > 0) {
                resp = true;
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            //ConexionSQL.cerrarConexion();
        }
        return resp;
    }

}
