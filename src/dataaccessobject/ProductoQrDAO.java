package dataaccessobject;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import datatransferobject.ProductoQr;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import presentacion.producto.FrmProducto;

public class ProductoQrDAO {

    private final ProductoDAO DATOS;

    public ProductoQrDAO () {
        this.DATOS = new ProductoDAO();
    }

    public boolean generarQr () {

        BitMatrix matrix = null;
        Writer writer = new QRCodeWriter();
        List<String> datos = DATOS.listarParaGenerarQR();

        for (int i = 0; i < datos.size(); i++) {

            try {
                matrix = writer.encode(datos.get(i), BarcodeFormat.QR_CODE, ProductoQr.qrTamAlto, ProductoQr.qrTamAncho);
            } catch (WriterException e) {
            }

            BufferedImage imagen = new BufferedImage(ProductoQr.qrTamAlto, ProductoQr.qrTamAncho, BufferedImage.TYPE_INT_RGB);
            for (int j = 0; j < ProductoQr.qrTamAlto; j++) {
                for (int k = 0; k < ProductoQr.qrTamAncho; k++) {
                    int valor = (matrix.get(j, k) ? 0 : 1) & 0xff;
                    imagen.setRGB(j, k, (valor == 0 ? 0 : 0xFFFFFF));
                }
            }

            try {

                try (FileOutputStream codigo = new FileOutputStream("D:/QR" + "\\" + datos.get(i) + ".png")) {
                    ImageIO.write(imagen, ProductoQr.formato, codigo);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ProductoQrDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ProductoQrDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return true;

    }
}
