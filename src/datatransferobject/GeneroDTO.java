package datatransferobject;

public class GeneroDTO {

    private int idGenero;
    private String descripcion;

    public GeneroDTO () {
    }

    public GeneroDTO (int idGenero, String descripcion) {
        this.idGenero = idGenero;
        this.descripcion = descripcion;
    }

    public int getIdGenero () {
        return idGenero;
    }

    public void setIdGenero (int idGenero) {
        this.idGenero = idGenero;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString () {
        return "GeneroDTO{" + "idGenero=" + idGenero + ", descripcion=" + descripcion + '}';
    }

}
