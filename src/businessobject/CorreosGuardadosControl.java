package businessobject;

import datasource.ConexionArchivo;
import java.util.ArrayList;
import java.util.List;
import presentacion.files.componentes.TextFieldSuggestionCustom;

public class CorreosGuardadosControl {

    private final ConexionArchivo CON;

    public CorreosGuardadosControl () {
        this.CON = new ConexionArchivo();
    }

    public TextFieldSuggestionCustom listarCorreos (TextFieldSuggestionCustom txt) {
        List<String> correos = new ArrayList<>();
        correos = CON.obtenerCorreos();
        for (int i = 0; i < correos.size(); i++) {
            txt.addItemSuggestion(correos.get(i));
        }
        return txt;
    }

    public void guardarCorreo (String txt) {
        CON.guardarCorreo(txt.trim());
    }

}
