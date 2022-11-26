package datatransferobject;

public class RolDTO {

    private int idRol;
    private String descripcion;
    private int idEmpresa;
    private String ruc;

    public RolDTO () {
    }

    public RolDTO (int idRol, String descripcion, int idEmpresa, String ruc) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.idEmpresa = idEmpresa;
        this.ruc = ruc;
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

    public int getIdEmpresa () {
        return idEmpresa;
    }

    public void setIdEmpresa (int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRuc () {
        return ruc;
    }

    public void setRuc (String ruc) {
        this.ruc = ruc;
    }

    @Override
    public String toString () {
        return "RolDTO{" + "idRol=" + idRol + ", descripcion=" + descripcion + ", idEmpresa=" + idEmpresa + ", ruc=" + ruc + '}';
    }

}
