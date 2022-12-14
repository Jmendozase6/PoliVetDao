package dataaccessobject;

import java.util.List;

public interface IProducto<T> {

    public List<T> listar (String nombre, byte estado);

    public boolean agregar (T objeto);

    public boolean actualizar (T objeto);

    public boolean desactivar (int id);

    public boolean activar (int idProducto);

    public boolean existe (String nombre, int idProveedor);

    public List<String> listarParaGenerarQR ();

}
