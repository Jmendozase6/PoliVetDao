package dataaccessobject;

import datatransferobject.EmailDTO;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class EmailDAO {

    private final EmailDTO EMAIL;
    private final Properties PROPS;
    private Session session;
    private MimeMessage mCorreo;

    public EmailDAO () {
        EMAIL = new EmailDTO();
        PROPS = new Properties();
    }

    public void crearEmail (String emailDestino, String asunto, String contenido) {
        EMAIL.setDestinatario(emailDestino.trim());
        EMAIL.setAsunto(asunto.trim());
        EMAIL.setContenido(contenido.trim());

        // Protocolo para el envío de emails
        PROPS.put("mail.transport.protocol", "smtp");
        PROPS.put("mail.smtp.host", "smtp.gmail.com");
        PROPS.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        PROPS.setProperty("mail.smtp.starttls.enable", "true");
        PROPS.setProperty("mail.smtp.port", "587");
        PROPS.setProperty("mail.smtp.user", EMAIL.getEmailOrigen());
        PROPS.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        PROPS.setProperty("mail.smtp.auth", "true");

        session = Session.getDefaultInstance(PROPS);

        mCorreo = new MimeMessage(session);

        try {

            mCorreo.setFrom(new InternetAddress(EMAIL.getEmailOrigen()));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailDestino));
            mCorreo.setSubject(EMAIL.getAsunto());
            mCorreo.setText(EMAIL.getContenido(), "ISO-8859-1", "html");

        } catch (AddressException ex) {
            Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviarEmail () {

        try {

            Transport mTransport = session.getTransport();
            mTransport.connect(EMAIL.getEmailOrigen(), EMAIL.getPasswordFOrigen());
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            JOptionPane.showMessageDialog(null, "Correo enviado con éxito");

        } catch (NoSuchProviderException ex) {
            Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
