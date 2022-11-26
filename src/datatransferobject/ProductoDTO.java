package datatransferobject;

public class ProductoDTO {

    private int idProducto;
    private byte idTipoProducto;
    private int idProveedor;
    private String nombre;
    private String descripcion;
    private String marca;
    private float precio;
    private float cantidad;

    public ProductoDTO () {
    }

    public ProductoDTO (int idProducto, byte idTipoProducto, int idProveedor, String nombre, String descripcion, String marca, float precio, float cantidad) {
        this.idProducto = idProducto;
        this.idTipoProducto = idTipoProducto;
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdProducto () {
        return idProducto;
    }

    public void setIdProducto (int idProducto) {
        this.idProducto = idProducto;
    }

    public byte getIdTipoProducto () {
        return idTipoProducto;
    }

    public void setIdTipoProducto (byte idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public int getIdProveedor () {
        return idProveedor;
    }

    public void setIdProveedor (int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public float getPrecio () {
        return precio;
    }

    public void setPrecio (float precio) {
        this.precio = precio;
    }

    public float getCantidad () {
        return cantidad;
    }

    public void setCantidad (float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString () {
        return "ProductoDTO{" + "idProducto=" + idProducto + ", idTipoProducto=" + idTipoProducto + ", idProveedor=" + idProveedor + ", nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

}
