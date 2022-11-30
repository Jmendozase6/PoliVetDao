package businessobject;

import dataaccessobject.EmailDAO;
import java.time.LocalDate;

public class EmailControl {

    private final EmailDAO DATOS;

    public EmailControl () {
        this.DATOS = new EmailDAO();
    }

    public String generarCorreo (String emailDestino) {

        String fecha = String.valueOf(LocalDate.now());
        String clave = generarClave();
        DATOS.crearEmail(emailDestino, clave, fecha);
        DATOS.enviarEmail();
        return clave;
    }

    private String generarClave () {
        String clave = "";
        for (int i = 0; i < 4; i++) {
            clave += String.valueOf((int) (Math.random() * 9) + 1);
        }
        return clave;
    }

}
