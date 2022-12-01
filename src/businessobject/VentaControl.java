package businessobject;

import dataaccessobject.ProductoDAO;
import dataaccessobject.VentaDAO;
import datatransferobject.VentaDTO;
import datatransferobject.VentaDetalleDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class VentaControl {

    private final VentaDAO DATOS;
    private final ProductoDAO DATOS_PRO;
    private VentaDTO obj;
    private DefaultTableModel modeloTabla;

    public VentaControl () {
        this.DATOS = new VentaDAO();
        this.DATOS_PRO = new ProductoDAO();
        this.obj = new VentaDTO();
    }

    public DefaultTableModel listar (String numeroComprobante) {
        List<VentaDTO> lista = new ArrayList();
        lista.addAll(DATOS.listar(numeroComprobante));

        String[] titulos = {"Id Venta", "Id Usuario", "Nombre usuario", "Número comprobante", "Fecha", "Total"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[titulos.length];

        for (VentaDTO item : lista) {
            registro[0] = Integer.toString(item.getIdVenta());
            registro[1] = Integer.toString(item.getIdUsuario());
            registro[2] = item.getNombreUsuario();
            registro[3] = item.getNumeroComprobante();
            registro[4] = item.getFecha();
            registro[5] = Double.toString(item.getTotal());

            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;

    }

    public DefaultComboBoxModel seleccionar () {
        return new DefaultComboBoxModel(DATOS_PRO.seleccionar().toArray());
    }

    public DefaultTableModel listarDetalle (int id) {
        List<VentaDetalleDTO> lista = new ArrayList();
        lista.addAll(DATOS.listarDetalle(id));

        String[] titulos = {"ID Producto", "Nombre Producto", "Stock de Producto", "Cantidad", "Precio"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[titulos.length];

        for (VentaDetalleDTO item : lista) {
            registro[0] = Integer.toString(item.getIdProducto());
            registro[1] = item.getNombreProducto();
            registro[2] = Integer.toString(item.getStockProducto());
            registro[3] = Integer.toString(item.getCantidad());
            registro[4] = Double.toString(item.getPrecio());
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }

    public String insertar (int idUsuario, String nombreUsuario, String numeroComprobante, double total, DefaultTableModel modeloDetalles) {
        if (DATOS.existe(numeroComprobante)) {
            return "El registro ya existe.";
        } else {
            obj.setNombreUsuario(nombreUsuario);
            obj.setIdUsuario(idUsuario);
            obj.setNumeroComprobante(numeroComprobante);
            obj.setTotal(total);

            List<VentaDetalleDTO> detalles = new ArrayList();
            int idProducto;
            double cantidad;
            double precio;
            String nombre;

            for (int i = 0; i < modeloDetalles.getRowCount(); i++) {
                idProducto = Integer.parseInt(String.valueOf(modeloDetalles.getValueAt(i, 0)));
                nombre = String.valueOf(modeloDetalles.getValueAt(i, 1));
                cantidad = Double.parseDouble(String.valueOf(modeloDetalles.getValueAt(i, 2)));
                precio = Double.parseDouble(String.valueOf(modeloDetalles.getValueAt(i, 3)));
                detalles.add(new VentaDetalleDTO(idProducto, nombre, (int) cantidad, precio));
            }

            obj.setDetalles(detalles);

            if (DATOS.insertarNOTRAN(obj)) {
                return "OK";
            } else {
                return "Error en el registro.";
            }
        }
    }

}
