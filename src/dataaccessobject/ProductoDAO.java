package dataaccessobject;

import datasource.ConexionSQL;
import datatransferobject.ProductoDTO;
import interfaces.IProducto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements IProducto<ProductoDTO> {

    private final ConexionSQL CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ProductoDAO () {
        this.CON = ConexionSQL.getInstance();
    }

    @Override
    public List<ProductoDTO> listar (String nombre, byte estado) {
        List<ProductoDTO> productos = new ArrayList();

        try {

            ps = CON.conectar().prepareStatement("SELECT * FROM Producto WHERE nombre LIKE '%" + nombre + "%' AND estado = ?");
            ps.setByte(1, estado);
            rs = ps.executeQuery();

            while (rs.next()) {
                productos.add(new ProductoDTO(
                        rs.getInt(1),
                        rs.getByte(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getFloat(7),
                        rs.getFloat(8),
                        rs.getByte(9)
                ));
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
        return productos;
    }

    public List<ProductoDTO> listarModoInvitado (String nombre) {
        List<ProductoDTO> productos = new ArrayList();

        try {

            ps = CON.conectar().prepareStatement("SELECT nombre, descripcion, marca, precio, cantidad FROM Producto WHERE nombre LIKE '%" + nombre + "%' AND estado = 1");
            rs = ps.executeQuery();

            while (rs.next()) {
                productos.add(new ProductoDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getFloat(5)
                ));
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
        return productos;
    }

    @Override
    public boolean agregar (ProductoDTO objeto) {
        resp = false;

        try {
            ps = CON.conectar().prepareStatement("INSERT INTO Producto (idTipoProducto, idProveedor, nombre, descripcion, marca, precio, cantidad, estado) VALUES (?,?,?,?,?,?,?,1)");
            ps.setByte(1, objeto.getIdTipoProducto());
            ps.setInt(2, objeto.getIdProveedor());
            ps.setString(3, objeto.getNombre());
            ps.setString(4, objeto.getDescripcion());
            ps.setString(5, objeto.getMarca());
            ps.setFloat(6, objeto.getPrecio());
            ps.setFloat(7, objeto.getCantidad());

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
    public boolean actualizar (ProductoDTO objeto) {
        resp = false;

        try {
            ps = CON.conectar().prepareStatement("UPDATE Producto SET idTipoProducto = ?, idProveedor = ?, nombre = ?, descripcion = ?, marca = ?, precio = ?, cantidad = ?, estado = ? WHERE idProducto = ?");

            ps.setByte(1, objeto.getIdTipoProducto());
            ps.setInt(2, objeto.getIdProveedor());
            ps.setString(3, objeto.getNombre());
            ps.setString(4, objeto.getDescripcion());
            ps.setString(5, objeto.getMarca());
            ps.setFloat(6, objeto.getPrecio());
            ps.setFloat(7, objeto.getCantidad());
            ps.setInt(8, objeto.getEstado());
            ps.setInt(9, objeto.getIdProducto());

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
    public boolean desactivar (int idProducto) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE Producto SET estado = 0 WHERE idProducto = ?");
            ps.setInt(1, idProducto);

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
    public boolean activar (int idProducto) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE Producto SET estado = 1 WHERE idProducto = ?");
            ps.setInt(1, idProducto);

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
    public boolean existe (String nombre, int idProveedor) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("SELECT nombre, idProveedor FROM Producto WHERE nombre = ? AND idProveedor = ?");
            ps.setString(1, nombre);
            ps.setInt(2, idProveedor);

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

    public List<String> seleccionar () {
        List<String> productos = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT idProducto, nombre, precio FROM Producto");
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductoDTO mascota = new ProductoDTO(rs.getInt(1), rs.getString(2), rs.getFloat(3));
                productos.add(mascota.toString());
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
        return productos;
    }

}
