package dataaccessobject;

import java.util.List;

public interface IOperacionesCrud<T> {

    public List<T> listar (String columna, String texto, byte idRol, byte estado);

    public boolean agregar (T objeto);

    public boolean actualizar (T objeto);

}
