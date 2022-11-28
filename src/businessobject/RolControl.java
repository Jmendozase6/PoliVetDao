package businessobject;

import dataaccessobject.RolDAO;
import javax.swing.DefaultComboBoxModel;

public class RolControl {

    private final RolDAO DATOS;

    public RolControl () {
        this.DATOS = new RolDAO();
    }

    public DefaultComboBoxModel seleccionar () {
        return new DefaultComboBoxModel(DATOS.listar().toArray());
    }

}
