package businessobject;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Calendar;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class Utilidades {

    public static final Color PRIMARY_COLOR = new Color(232, 245, 254);

    public static void colorDateChooser (JDateChooser jdc) {
        for (Component c : jdc.getComponents()) {
            c.setBackground(Utilidades.PRIMARY_COLOR);
        }
    }

    public static String validarEmail (String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches()
                ? ""
                : "Ingresa un correo electrónico válido";
    }

    public static boolean sonTextfieldsVacios (JTextField... jtxt) {
        for (JTextField item : jtxt) {

            if (item.getText().isBlank()) {
                System.out.println(item.getText());
                return true;
            }
        }
        return false;
    }

    public static void limpiarTextfields (JTextField... jtxt) {
        for (JTextField item : jtxt) {
            item.setText("");
        }
    }

    public static String obtenerFechaChooser (JDateChooser calendario) {

        int dia, mes, anio;
        dia = calendario.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes = calendario.getCalendar().get(Calendar.MONTH) + 1;
        anio = calendario.getCalendar().get(Calendar.YEAR);
        return anio + "/" + mes + "/" + dia;
    }

    public static String obtenerFechaSqlFormat () {
        JCalendar c = new JCalendar();
        int dia = c.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = c.getCalendar().get(Calendar.MONTH) + 1;
        int anio = c.getCalendar().get(Calendar.YEAR);
        return anio + "" + mes + "" + dia;
    }

    public String obtenerCodigoPortaPapeles () {

        try {
            // Se obtiene el Clipboard y su contenido
            Clipboard cb = Toolkit.getDefaultToolkit()
                    .getSystemClipboard();
            Transferable t = cb.getContents(this);

            // Construimos el DataFlavor correspondiente a String.
            DataFlavor dataFlavorStringJava = new DataFlavor(
                    "application/x-java-serialized-object; class=java.lang.String");

            // Si el dato se puede obtener como String, lo obtenemos y
            // lo sacamos por la estándar out.
            String texto = "";
            if (t.isDataFlavorSupported(dataFlavorStringJava)) {
                texto = (String) t
                        .getTransferData(dataFlavorStringJava);
            }

            // 4 porque es el largo de la clave
            if (texto.length() == 4) {
                return texto;
            }
        } catch (HeadlessException | UnsupportedFlavorException | IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        }

        return null;

    }

}
