package businessobject;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.regex.Pattern;

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

    public static String obtenerFechaChooser (JDateChooser calendario) {

        int dia, mes, anio;
        dia = calendario.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes = calendario.getCalendar().get(Calendar.MONTH) + 1;
        anio = calendario.getCalendar().get(Calendar.YEAR);
        return anio + "/" + mes + "/" + dia;
    }

}
