package datatransferobject;

public class TipoMascotaDTO {

    private int idTipoMascota;
    private String descripcion;

    public TipoMascotaDTO () {
    }

    public TipoMascotaDTO (int idTipoMascota, String descripcion) {
        this.idTipoMascota = idTipoMascota;
        this.descripcion = descripcion;
    }

    public int getIdTipoMascota () {
        return idTipoMascota;
    }

    public void setIdTipoMascota (int idTipoMascota) {
        this.idTipoMascota = idTipoMascota;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString () {
        return "TipoMascota{" + "idTipoMascota=" + idTipoMascota + ", descripcion=" + descripcion + '}';
    }

}
