package businessobject;

import dataaccessobject.TipoMascotaDAO;
import javax.swing.DefaultComboBoxModel;

public class TipoMascotaControl {

    private final TipoMascotaDAO DATOS;

    public TipoMascotaControl () {
        DATOS = new TipoMascotaDAO();
    }

    public DefaultComboBoxModel seleccionar () {
        return new DefaultComboBoxModel(DATOS.listar().toArray());
    }

}
