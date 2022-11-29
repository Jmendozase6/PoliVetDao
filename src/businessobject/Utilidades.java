package businessobject;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class Utilidades {

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

}
