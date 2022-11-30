package datatransferobject;

public class TarjetaDTO {

    private int idTarjetaVacuna;
    private int idMascota;
    private String observaciones;

    public TarjetaDTO () {
    }

    public TarjetaDTO (int idTarjeta, int idMascota, String observaciones) {
        this.idTarjetaVacuna = idTarjeta;
        this.idMascota = idMascota;
        this.observaciones = observaciones;
    }

    public int getIdTarjetaVacuna () {
        return idTarjetaVacuna;
    }

    public void setIdTarjetaVacuna (int idTarjetaVacuna) {
        this.idTarjetaVacuna = idTarjetaVacuna;
    }

    public int getIdMascota () {
        return idMascota;
    }

    public void setIdMascota (int idMascota) {
        this.idMascota = idMascota;
    }

    public String getObservaciones () {
        return observaciones;
    }

    public void setObservaciones (String observaciones) {
        this.observaciones = observaciones;
    }

}
