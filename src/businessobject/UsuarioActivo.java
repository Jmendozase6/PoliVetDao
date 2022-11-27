package businessobject;

public class UsuarioActivo {

    private UsuarioActivo instancia;
    public static int idUsuario;
    public static int idRol = 2;
    public static String rolNombre;
    public static String email;
    public static String password;

    private UsuarioActivo (int idUsuario, int idRol, String email, String password) {
        UsuarioActivo.idUsuario = idUsuario;
        UsuarioActivo.idRol = idUsuario;
        UsuarioActivo.rolNombre = tipoRol(idRol);
        UsuarioActivo.email = email;
        UsuarioActivo.password = password;
    }

    public UsuarioActivo obtenerInstancia (int idUsuario, int idRol, String email, String password) {
        if (instancia == null) {
            instancia = new UsuarioActivo(idUsuario, idRol, email, password);
        }
        return instancia;
    }

    private String tipoRol (int idRol) {
        switch (idRol) {
            case 1:
                return "Administrador";
            case 2:
                return "Cliente";
            case 3:
                return "Proveedor";
            case 4:
                return "Veterinario";
            default:
                return "Cliente";
        }
    }

}
