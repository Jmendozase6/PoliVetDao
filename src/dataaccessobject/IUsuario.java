package dataaccessobject;

import dataaccessobject.IOperacionesCrud;

public interface IUsuario<T> extends IOperacionesCrud<T> {

    public boolean desactivar (int id);

    public boolean activar (int id);

    public boolean existe (String email, String documento);

}
