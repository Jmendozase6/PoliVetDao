package interfaces;

import java.util.List;

public interface CrudVentaInterface<T, D> {

    public List<T> listar (String numeroComprobante);

    public List<D> listarDetalle (int id);

    public boolean insertar (T obj);

    public boolean existe (String numeroComprobante);

}
