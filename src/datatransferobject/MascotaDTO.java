package datatransferobject;

public class MascotaDTO {

    private int idMascota;
    private int idUsuario;
    private int idTipoMascota;
    private String nombre;
    private String raza;
    private String genero;
    private String peso;
    private String tipoMascota;

    public MascotaDTO () {
    }

    public MascotaDTO (int idMascota, String tipoMascota, String nombre) {
        this.idMascota = idMascota;
        this.tipoMascota = tipoMascota;
        this.nombre = nombre;
    }

    public MascotaDTO (int idUsuario, int idTipoMascota, String nombre, String raza, String genero, String peso) {
        this.idUsuario = idUsuario;
        this.idTipoMascota = idTipoMascota;
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.peso = peso;
    }

    public MascotaDTO (int idMascota, int idUsuario, int idTipoMascota, String nombre, String raza, String genero, String peso) {
        this.idMascota = idMascota;
        this.idUsuario = idUsuario;
        this.idTipoMascota = idTipoMascota;
        this.nombre = nombre;
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

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
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

    public String getTipoMascota () {
        return tipoMascota;
    }

    public void setTipoMascota (String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    @Override
    public String toString () {
        return idMascota + " - " + tipoMascota + " - " + nombre;
    }

}
