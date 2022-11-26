package datatransferobject;

import java.sql.Date;

public class VentaDTO {

    private int idVenta;
    private int idUsuario;
    private Date fecha;

    public VentaDTO () {
    }

    public VentaDTO (int idVenta, int idUsuario, Date fecha) {
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
    }

    public int getIdVenta () {
        return idVenta;
    }

    public void setIdVenta (int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdUsuario () {
        return idUsuario;
    }

    public void setIdUsuario (int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha () {
        return fecha;
    }

    public void setFecha (Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString () {
        return "VentaDTO{" + "idVenta=" + idVenta + ", idUsuario=" + idUsuario + ", fecha=" + fecha + '}';
    }

}
