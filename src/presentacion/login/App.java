package presentacion.login;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;

public class App {

    public static void main (String[] args) {

        FlatArcOrangeIJTheme.setup();
        new FrmLogin().setVisible(true);

    }
}
