package dataaccessobject;

import java.util.List;

public interface IReserva<T> {

    public List<T> listar (String fecha, String rango, String fechaRangoMaximo);

    public boolean agregar (T objeto);

    public boolean actualizar (T objeto);
}
