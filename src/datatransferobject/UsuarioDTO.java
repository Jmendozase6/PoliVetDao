package datatransferobject;

public class UsuarioDTO {

    private int idUsuario;
    private short idRol;
    private String nombre;
    private String apellidos;
    private byte idGenero;
    private String fechaNacimiento;
    private byte idTipoDocumento;
    private String documento;
    private String direccion;
    private String telefonoMovil;
    private String email;
    private String password;
    private byte estado;

    public UsuarioDTO () {
    }

    public UsuarioDTO (int idUsuario, String nombre, String apellidos) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public UsuarioDTO (int idUsuario, String nombre, String apellidos, byte idGenero, String fechaNacimiento, String documento, String direccion, String telefonoMovil, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idGenero = idGenero;
        this.fechaNacimiento = fechaNacimiento;
        this.documento = documento;
        this.direccion = direccion;
        this.telefonoMovil = telefonoMovil;
        this.email = email;
    }

    public UsuarioDTO (short idRol, String nombre, String apellidos, byte idGenero, String fechaNacimiento, byte idTipoDocumento, String documento, String direccion, String telefonoMovil, String email, String password, byte estado) {
        this.idRol = idRol;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idGenero = idGenero;
        this.fechaNacimiento = fechaNacimiento;
        this.idTipoDocumento = idTipoDocumento;
        this.documento = documento;
        this.direccion = direccion;
        this.telefonoMovil = telefonoMovil;
        this.email = email;
        this.password = password;
        this.estado = estado;
    }

    public UsuarioDTO (int idUsuario, short idRol, String nombre, String apellidos, byte idGenero, String fechaNacimiento, byte idTipoDocumento, String documento, String direccion, String telefonoMovil, String email, String password, byte estado) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idGenero = idGenero;
        this.fechaNacimiento = fechaNacimiento;
        this.idTipoDocumento = idTipoDocumento;
        this.documento = documento;
        this.direccion = direccion;
        this.telefonoMovil = telefonoMovil;
        this.email = email;
        this.password = password;
        this.estado = estado;
    }

    public byte getEstado () {
        return estado;
    }

    public void setEstado (byte estado) {
        this.estado = estado;
    }

    public int getIdUsuario () {
        return idUsuario;
    }

    public void setIdUsuario (int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public short getIdRol () {
        return idRol;
    }

    public void setIdRol (short idRol) {
        this.idRol = idRol;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos () {
        return apellidos;
    }

    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }

    public byte getIdGenero () {
        return idGenero;
    }

    public void setIdGenero (byte idGenero) {
        this.idGenero = idGenero;
    }

    public String getFechaNacimiento () {
        return fechaNacimiento;
    }

    public void setFechaNacimiento (String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public byte getIdTipoDocumento () {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento (byte idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDocumento () {
        return documento;
    }

    public void setDocumento (String documento) {
        this.documento = documento;
    }

    public String getDireccion () {
        return direccion;
    }

    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoMovil () {
        return telefonoMovil;
    }

    public void setTelefonoMovil (String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    @Override
    public String toString () {
        return idUsuario + " - " + nombre + " " + apellidos;
    }

}
