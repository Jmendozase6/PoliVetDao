package businessobject;

import dataaccessobject.ReservaDAO;
import datatransferobject.ReservaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ReservaControl {

    private final ReservaDAO DATOS;
    private final ReservaDTO obj;
    private DefaultTableModel modeloTabla;

    public ReservaControl () {
        this.DATOS = new ReservaDAO();
        this.obj = new ReservaDTO();
    }

    public DefaultTableModel listar (String fecha, String rango, String fechaRangoMaximo) {
        List<ReservaDTO> lista = new ArrayList();
        lista.addAll(DATOS.listar(fecha, rango, fechaRangoMaximo));

        String[] titulos = {"ID", "Id Mascota", "Fecha", "Descripción"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[4];
        for (ReservaDTO item : lista) {
            registro[0] = Integer.toString(item.getIdReserva());
            registro[1] = Integer.toString(item.getIdMascota());
            registro[2] = item.getFecha();
            registro[3] = item.getDescripcion();
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }

    public String agregar (int idMascota, String fecha, String descripcion) {
        obj.setIdMascota(idMascota);
        obj.setFecha(fecha);
        obj.setDescripcion(descripcion);

        if (DATOS.agregar(obj)) {
            return "OK";
        } else {
            return "Error en el registro.";
        }
    }

    public String actualizar (ReservaDTO objeto) {
        if (DATOS.actualizar(objeto)) {
            return "OK";
        } else {
            return "No se puede actualizar el registro";
        }
    }

}
