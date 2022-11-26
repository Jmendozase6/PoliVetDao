package datatransferobject;

public class MascotaDTO {

    private int idMascota;
    private int idUsuario;
    private int idTipoMascota;
    private String raza;
    private String genero;
    private String peso;

    public MascotaDTO () {
    }

    public MascotaDTO (int idMascota, int idUsuario, int idTipoMascota, String raza, String genero, String peso) {
        this.idMascota = idMascota;
        this.idUsuario = idUsuario;
        this.idTipoMascota = idTipoMascota;
        this.raza = raza;
        this.genero = genero;
        this.peso = peso;
    }

    public int getIdMascota () {
        return idMascota;
    }

    public void setIdMascota (int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdUsuario () {
        return idUsuario;
    }

    public void setIdUsuario (int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoMascota () {
        return idTipoMascota;
    }

    public void setIdTipoMascota (int idTipoMascota) {
        this.idTipoMascota = idTipoMascota;
    }

    public String getRaza () {
        return raza;
    }

    public void setRaza (String raza) {
        this.raza = raza;
    }

    public String getGenero () {
        return genero;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public String getPeso () {
        return peso;
    }

    public void setPeso (String peso) {
        this.peso = peso;
    }

    @Override
    public String toString () {
        return "MascotaDTO{" + "idMascota=" + idMascota + ", idUsuario=" + idUsuario + ", idTipoMascota=" + idTipoMascota + ", raza=" + raza + ", genero=" + genero + ", peso=" + peso + '}';
    }

}
