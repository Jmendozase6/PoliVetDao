package businessobject;

import dataaccessobject.ProveedorDAO;
import javax.swing.DefaultComboBoxModel;

public class ProveedorControl {

    private final ProveedorDAO DATOS;

    public ProveedorControl () {
        DATOS = new ProveedorDAO();
    }

    public DefaultComboBoxModel seleccionar () {
        return new DefaultComboBoxModel(DATOS.seleccionar().toArray());
    }
}
