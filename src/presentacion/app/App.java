package presentacion.app;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import presentacion.login.FrmLogin;

public class App {

    public static void main (String[] args) {

        FlatArcOrangeIJTheme.setup();
        new FrmLogin().setVisible(true);

    }
}
