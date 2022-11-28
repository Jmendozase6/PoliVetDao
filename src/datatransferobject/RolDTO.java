package datatransferobject;

public class RolDTO {

    private int idRol;
    private String descripcion;

    public RolDTO () {
    }

    public RolDTO (int idRol, String descripcion) {
        this.idRol = idRol;
        this.descripcion = descripcion;
    }

    public int getIdRol () {
        return idRol;
    }

    public void setIdRol (int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString () {
        return idRol + " - " + descripcion;
    }

}
