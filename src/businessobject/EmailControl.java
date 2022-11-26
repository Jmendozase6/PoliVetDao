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
        String asunto = "PoliVet Piura - Código de confirmación";
        String clave = generarClave();
        String contenido
                = "<h1>PoliVet Piura</h1><br><h2>Recibió una solicitud para el <i>cambio de la contraseña</i> asociada a este correo.</h2>"
                + "<br><h3>Su código de confirmación es " + clave + "</h3>"
                + "<br><h3>Fecha <b>" + fecha + "</h3></b>";
        DATOS.crearEmail(emailDestino, asunto, contenido);
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
