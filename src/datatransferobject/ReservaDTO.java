package datatransferobject;

import java.sql.Date;

public class ReservaDTO {

    private int idReserva;
    private int idMascota;
    private Date fecha;
    private String descripcion;

    public ReservaDTO() {
    }

    public ReservaDTO(int idReserva, int idMascota, Date fecha, String descripcion) {
        this.idReserva = idReserva;
        this.idMascota = idMascota;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idMascota=" + idMascota + ", fecha=" + fecha + ", descripcion=" + descripcion + '}';
    }

}
