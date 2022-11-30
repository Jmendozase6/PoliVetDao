package businessobject;

import dataaccessobject.TipoProductoDAO;
import javax.swing.DefaultComboBoxModel;

public class TipoProductoControl {

    private final TipoProductoDAO DATOS;

    public TipoProductoControl () {
        DATOS = new TipoProductoDAO();
    }

    public DefaultComboBoxModel seleccionar () {
        return new DefaultComboBoxModel(DATOS.listar().toArray());
    }

}
