package datatransferobject;

public class VentaDetalleDTO {

    private int idVentaDetalle;
    private int idVenta;
    private int idProducto;
    private String descripcion;
    private float cantidad;
    private float costo;

    public VentaDetalleDTO () {
    }

    public VentaDetalleDTO (int idVentaDetalle, int idVenta, int idProducto, String descripcion, float cantidad, float costo) {
        this.idVentaDetalle = idVentaDetalle;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.costo = costo;
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

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCantidad () {
        return cantidad;
    }

    public void setCantidad (float cantidad) {
        this.cantidad = cantidad;
    }

    public float getCosto () {
        return costo;
    }

    public void setCosto (float costo) {
        this.costo = costo;
    }

    @Override
    public String toString () {
        return "VentaDetalleDTO{" + "idVentaDetalle=" + idVentaDetalle + ", idVenta=" + idVenta + ", idProducto=" + idProducto + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", costo=" + costo + '}';
    }

}
