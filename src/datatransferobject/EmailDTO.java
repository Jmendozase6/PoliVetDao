package datatransferobject;

public class EmailDTO {

    private final String emailOrigen = "polivetpiura@gmail.com";
    private final String passwordFOrigen = "ztngriztrdjhrzfj";
    private String destinatario;
    private String asunto;
    private String contenido;

    public EmailDTO () {
    }

    public String getEmailOrigen () {
        return emailOrigen;
    }

    public String getPasswordFOrigen () {
        return passwordFOrigen;
    }

    public String getDestinatario () {
        return destinatario;
    }

    public void setDestinatario (String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto () {
        return asunto;
    }

    public void setAsunto (String asunto) {
        this.asunto = asunto;
    }

    public String getContenido () {
        return contenido;
    }

    public void setContenido (String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString () {
        return "EmailDAO{" + "emailOrigen=" + emailOrigen + ", passwordFOrigen=" + passwordFOrigen + ", destinatario=" + destinatario + ", asunto=" + asunto + ", contenido=" + contenido + '}';
    }

}
