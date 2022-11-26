package interfaces;

import java.util.List;

public interface IOperacionesCrud<T> {

    public List<T> listar (String columna, String texto, byte idRol);

    public boolean agregar (T objeto);

    public boolean actualizar (T objeto);

}
