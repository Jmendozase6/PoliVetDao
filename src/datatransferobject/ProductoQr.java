package datatransferobject;

public class ProductoQr {

    public static final int qrTamAlto = 400;
    public static final int qrTamAncho = 400;
    public static final String formato = "png";
    public static String ruta;

    public ProductoQr (String ruta) {
        this.ruta = ruta;
    }

    public String getRuta () {
        return ruta;
    }

    public void setRuta (String ruta) {
        this.ruta = ruta;
    }

}
