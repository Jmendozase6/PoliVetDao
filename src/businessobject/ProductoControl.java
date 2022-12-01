package businessobject;

import dataaccessobject.ProductoDAO;
import datatransferobject.ProductoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ProductoControl {

    private final ProductoDAO DATOS;
    private final ProductoDTO obj;
    private DefaultTableModel modeloTabla;

    public ProductoControl () {
        this.DATOS = new ProductoDAO();
        this.obj = new ProductoDTO();
    }

    public DefaultTableModel listar (String nombre, byte estadoProducto) {
        List<ProductoDTO> productos = new ArrayList();
        productos.addAll(DATOS.listar(nombre, estadoProducto));

        String[] titulos = {"ID", "Id Tipo Producto", "Id Proveedor", "Nombre", "Descripción", "Marca", "Precio", "Cantidad", "Estado"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String estado;
        String[] registro = new String[titulos.length];
        for (ProductoDTO item : productos) {
            if (item.getEstado() == 1) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            registro[0] = Integer.toString(item.getIdProducto());
            registro[1] = Byte.toString(item.getIdTipoProducto());
            registro[2] = Integer.toString(item.getIdProveedor());
            registro[3] = item.getNombre();
            registro[4] = item.getDescripcion();
            registro[5] = item.getMarca();
            registro[6] = Float.toString(item.getPrecio());
            registro[7] = Float.toString(item.getCantidad());
            registro[8] = estado;
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }

    public DefaultTableModel listarModoInvitado (String nombre) {
        List<ProductoDTO> productos = new ArrayList();
        productos.addAll(DATOS.listarModoInvitado(nombre));

        String[] titulos = {"Nombre", "Descripción", "Marca", "Precio", "Cantidad"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[titulos.length];
        for (ProductoDTO item : productos) {
            registro[0] = item.getNombre();
            registro[1] = item.getDescripcion();
            registro[2] = item.getMarca();
            registro[3] = Float.toString(item.getPrecio());
            registro[4] = Float.toString(item.getCantidad());
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }

    public String existe (String nombre, int idProveedor) {
        if (DATOS.existe(nombre, idProveedor)) {
            return "OK";
        } else {
            return "No existe el producto";
        }
    }

    public String agregar (byte idTipoProducto, int idProveedor, String nombre, String descripcion, String marca, float precio, float cantidad) {
        if (DATOS.existe(nombre, idProveedor)) {
            return "El producto ya existe.";
        } else {
            obj.setIdTipoProducto(idTipoProducto);
            obj.setIdProveedor(idProveedor);
            obj.setNombre(nombre);
            obj.setDescripcion(descripcion);
            obj.setMarca(marca);
            obj.setPrecio(precio);
            obj.setCantidad(cantidad);

            if (DATOS.agregar(obj)) {
                return "OK";
            } else {
                return "Error en el registro.";
            }
        }
    }

    public String actualizar (ProductoDTO objeto) {
        if (DATOS.actualizar(objeto)) {
            return "OK";
        } else {
            return "No se puede actualizar el registro";
        }
    }

    public DefaultComboBoxModel seleccionar () {
        return new DefaultComboBoxModel(DATOS.seleccionar().toArray());
    }

    public String desactivar (int idProducto) {
        if (DATOS.desactivar(idProducto)) {
            return "OK";
        } else {
            return "No se puede desactivar el registro";
        }
    }

    public String activar (int idProducto) {
        if (DATOS.activar(idProducto)) {
            return "OK";
        } else {
            return "No se puede activar el registro";
        }
    }

}
