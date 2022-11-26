package datatransferobject;

public class TipoDocumentoDTO {

    private int idTipoDocumento;
    private String descripcion;

    public TipoDocumentoDTO () {
    }

    public TipoDocumentoDTO (int idTipoDocumento, String descripcion) {
        this.idTipoDocumento = idTipoDocumento;
        this.descripcion = descripcion;
    }

    public int getIdTipoDocumento () {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento (int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString () {
        return "TipoDocumento{" + "idTipoDocumento=" + idTipoDocumento + ", descripcion=" + descripcion + '}';
    }

}
