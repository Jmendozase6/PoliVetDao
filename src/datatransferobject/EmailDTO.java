package datatransferobject;

public class EmailDTO {

    private final String emailOrigen = "polivetpiura@gmail.com";
    private final String passwordFOrigen = "ztngriztrdjhrzfj";
    private String destinatario;
    private String asunto;

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

    @Override
    public String toString () {
        return "EmailDTO{" + "emailOrigen=" + emailOrigen + ", passwordFOrigen=" + passwordFOrigen + ", destinatario=" + destinatario + ", asunto=" + asunto + '}';
    }

}
