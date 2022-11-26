package datatransferobject;

import java.sql.Date;

public class TarjetaVacunaDTO {

    private int idTarjetaVacuna;
    private int idMascota;
    private Date fechaProgramada;
    private String observaciones;

    public TarjetaVacunaDTO () {
    }

    public TarjetaVacunaDTO (int idTarjetaVacuna, int idMascota, Date fechaProgramada, String observaciones) {
        this.idTarjetaVacuna = idTarjetaVacuna;
        this.idMascota = idMascota;
        this.fechaProgramada = fechaProgramada;
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

    public Date getFechaProgramada () {
        return fechaProgramada;
    }

    public void setFechaProgramada (Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getObservaciones () {
        return observaciones;
    }

    public void setObservaciones (String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString () {
        return "TarjetaVacunaDTO{" + "idTarjetaVacuna=" + idTarjetaVacuna + ", idMascota=" + idMascota + ", fechaProgramada=" + fechaProgramada + ", observaciones=" + observaciones + '}';
    }

}
