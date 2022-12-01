package datatransferobject;

import java.util.ArrayList;
import java.util.List;

public class VentaDTO {

    private int idVenta;
    private int idUsuario;
    private String nombreUsuario;
    private String numeroComprobante;
    private String fecha;
    private double total;
    private List<VentaDetalleDTO> detalles = new ArrayList<>();

    public VentaDTO () {
    }

    public VentaDTO (int idUsuario, String nombreUsuario, String numeroComprobante, String fecha, double total, List<VentaDetalleDTO> detalles) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.numeroComprobante = numeroComprobante;
        this.fecha = fecha;
        this.total = total;
        this.detalles = detalles;
    }

    public VentaDTO (int idVenta, int idUsuario, String nombreUsuario, String numeroComprobante, String fecha, double total) {
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.numeroComprobante = numeroComprobante;
        this.fecha = fecha;
        this.total = total;
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

    public String getNumeroComprobante () {
        return numeroComprobante;
    }

    public void setNumeroComprobante (String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNombreUsuario () {
        return nombreUsuario;
    }

    public void setNombreUsuario (String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFecha () {
        return fecha;
    }

    public void setFecha (String fecha) {
        this.fecha = fecha;
    }

    public double getTotal () {
        return total;
    }

    public void setTotal (double total) {
        this.total = total;
    }

    public List<VentaDetalleDTO> getDetalles () {
        return detalles;
    }

    public void setDetalles (List<VentaDetalleDTO> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString () {
        return "VentaDTO{" + "idVenta=" + idVenta + ", idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", numeroComprobante=" + numeroComprobante + ", fecha=" + fecha + ", total=" + total + ", detalles=" + detalles + '}';
    }

}
