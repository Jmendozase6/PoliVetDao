package datatransferobject;

public class TipoProductoDTO {

    private byte idTipoProducto;
    private String descripcion;

    public TipoProductoDTO () {
    }

    public TipoProductoDTO (byte idTipoProducto, String descripcion) {
        this.idTipoProducto = idTipoProducto;
        this.descripcion = descripcion;
    }

    public byte getIdTipoProducto () {
        return idTipoProducto;
    }

    public void setIdTipoProducto (byte idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString () {
        return "TipoProducto{" + "idTipoProducto=" + idTipoProducto + ", descripcion=" + descripcion + '}';
    }

}
