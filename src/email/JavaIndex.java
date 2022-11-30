package email;

public class JavaIndex {

    public String emailDestino, clave;
    StringBuilder xd = new StringBuilder();

    public static void main (String[] args) {
        JavaIndex a = new JavaIndex();
        a.clave = "123456";
        a.emailDestino = "Jhair@gmail.com";
        System.out.println(a.obtenerEmail());
    }

    public JavaIndex () {

    }

    public String obtenerEmail () {
        if (emailDestino != null && clave != null) {
            return "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">\n"
                    + "\n"
                    + "    <head>\n"
                    + "\n"
                    + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n"
                    + "            <meta name=\"viewport\" content=\"width=device-width\">\n"
                    + "                <title>POLIVET PETCARE</title>\n"
                    + "                <style>\n"
                    + "                    body,\n"
                    + "                    html {\n"
                    + "                        background-color: #fff;\n"
                    + "                    }\n"
                    + "                    * {\n"
                    + "                        margin: 0;\n"
                    + "                        padding: 0;\n"
                    + "                    }\n"
                    + "                </style>\n"
                    + "                </head>\n"
                    + "\n"
                    + "                <body\n"
                    + "                    style=\"-moz-box-sizing: border-box; -ms-text-size-adjust: 100%; -webkit-box-sizing: border-box; -webkit-text-size-adjust: 100%; Margin: 0; box-sizing: border-box; color: #0a0a0a; font-family: Helvetica, Arial, sans-serif; font-size: 16px; font-weight: normal; line-height: 1.3; margin: 0; min-width: 100%; padding: 0; padding-bottom: 0; padding-left: 0; padding-right: 0; padding-top: 0; text-align: left; width: 100% !important;\">\n"
                    + "\n"
                    + "                    <div style=\"width: 532px; margin: 0 auto;\">\n"
                    + "                        <div style=\"background-color: #4184F3;\">\n"
                    + "                            <div style=\"height: 72px;\"></div>\n"
                    + "                            <h3\n"
                    + "                                style=\"margin-left: 32px; color: white; font-family: Roboto-Regular,Helvetica,Arial,sans-serif; line-height: 1.25;\">\n"
                    + "                                Código de\n"
                    + "                                recuperación de PoliVet</h3>\n"
                    + "                            <div style=\"height: 18px;\"></div>\n"
                    + "                        </div>\n"
                    + "\n"
                    + "                        <div style=\"padding: 0 32px; background-color: #FAFAFA; border: 1px solid transparent;\">\n"
                    + "                            <p style=\"margin-top: 32px;\">Estimado usuario de PoliVet</p>\n"
                    + "\n"
                    + "                            <p style=\"margin-top: 16px; margin-bottom: 16px;\">Recibimos una solicitud para el cambio de contraseña de tu cuenta <a\n"
                    + "                                    href=\"mailto:" + emailDestino + "\">" + emailDestino + "</a> con tu dirección de\n"
                    + "                                correo\n"
                    + "                                electrónico. El código de recuperación de PoliVet es:</p>\n"
                    + "\n"
                    + "                            <p style=\"text-align: center; margin-top: 16px;\">\n"
                    + "                                <b style=\"font-size: 24px;\">" + clave + "</b>\n"
                    + "                            </p>\n"
                    + "\n"
                    + "                            <p style=\"margin-top: 16px; margin-bottom: 16px;\">Si no solicitaste este código, es posible que otra persona esté\n"
                    + "                                intentando acceder a la cuenta de PoliVet\n"
                    + "                                <a href=\"mailto:" + emailDestino + "\">" + emailDestino + "</a> No reenvíes ni proporciones\n"
                    + "                                este código a otra persona.\n"
                    + "                            </p>\n"
                    + "\n"
                    + "                            <p style=\"margin-top: 16px; margin-bottom: 16px;\">Recibiste este mensaje porque este es el correo\n"
                    + "                                registrado para la cuenta de PoliVet\n"
                    + "                                <a href=\"mailto:" + emailDestino + "\">" + emailDestino + "</a>\n"
                    + "                            </p>\n"
                    + "\n"
                    + "                            <p style=\"margin-top: 16px; margin-bottom: 16px;\">Atentamente.</p>\n"
                    + "\n"
                    + "                            <p style=\"margin-top: 16px; margin-bottom: 16px;\">El equipo de cuentas de PoliVet PetCare.</p>\n"
                    + "\n"
                    + "                            <img style=\"display: block; width: 100%; margin: 72px auto;\" src=\"https://res.cloudinary.com/dgna2mogt/image/upload/v1669742337/sdcmniswnoaneytmwr8h.png\" alt=\"\">\n"
                    + "                        </div>\n"
                    + "\n"
                    + "                    <!-- prevent Gmail on iOS font size manipulation -->\n"
                    + "                    <div style=\"display:none; white-space:nowrap; font:15px courier; line-height:0;\"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n"
                    + "                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n"
                    + "                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </div>\n"
                    + "                </body>\n"
                    + "                </html>";
        }
        return "";
    }

}
