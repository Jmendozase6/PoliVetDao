package datatransferobject;

public class VentaDetalleDTO {

    private int idVentaDetalle;
    private int idVenta;
    private int idProducto;
    private String nombreProducto;
    private int stockProducto;
    private int cantidad;
    private double precio;

    public VentaDetalleDTO () {
    }

    public VentaDetalleDTO (int idProducto, String nombreProducto, int cantidad, double precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public VentaDetalleDTO (int idProducto, int cantidad, double precio) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public VentaDetalleDTO (int idProducto, String nombreProducto, int stockProducto, int cantidad, double precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.stockProducto = stockProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public VentaDetalleDTO (int idVenta, int idProducto, String nombreProducto, int stockProducto, int cantidad, double precio) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.stockProducto = stockProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public VentaDetalleDTO (int idVentaDetalle, int idVenta, int idProducto, String nombreProducto, int stockProducto, int cantidad, double precio) {
        this.idVentaDetalle = idVentaDetalle;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.stockProducto = stockProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdVentaDetalle () {
        return idVentaDetalle;
    }

    public void setIdVentaDetalle (int idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }

    public int getIdVenta () {
        return idVenta;
    }

    public void setIdVenta (int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto () {
        return idProducto;
    }

    public void setIdProducto (int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto () {
        return nombreProducto;
    }

    public void setNombreProducto (String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStockProducto () {
        return stockProducto;
    }

    public void setStockProducto (int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public int getCantidad () {
        return cantidad;
    }

    public void setCantidad (int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio () {
        return precio;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }

    @Override
    public String toString () {
        return "VentaDetalleDTO{" + "idVentaDetalle=" + idVentaDetalle + ", idVenta=" + idVenta + ", idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", stockProducto=" + stockProducto + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}
