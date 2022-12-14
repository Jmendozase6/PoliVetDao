package businessobject;

import dataaccessobject.ProductoQrDAO;
import presentacion.producto.FrmProducto;

public class ProductoQrControl {

    private final ProductoQrDAO DATOS;

    public ProductoQrControl () {
        this.DATOS = new ProductoQrDAO();
    }

    public String generarQR (FrmProducto frm) {

        if (DATOS.generarQr()) {
            return "OK";
        }
        return "Ocurrió un error";
    }

}
