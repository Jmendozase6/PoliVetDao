package businessobject;

import java.util.regex.Pattern;

public class Validaciones {

    public static String validateEmail (String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches()
                ? ""
                : "Ingresa un correo electrónico válido";
    }

}
