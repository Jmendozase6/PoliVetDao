package presentacion.files.componentes.cartaAnimada;

import javax.swing.Icon;

public class ModelCart {

    private String nombres;
    private String apellidos;
    private String edad;
    private String description;
    private Icon image;
    private String numero;

    public ModelCart () {
    }

    public ModelCart (String nombres, String apellidos, String edad, String description, Icon image, String numero) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.description = description;
        this.image = image;
        this.numero = "https://wa.me/51" + numero;
    }

    public String getNombres () {
        return nombres;
    }

    public void setNombres (String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos () {
        return apellidos;
    }

    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad () {
        return edad;
    }

    public void setEdad (String edad) {
        this.edad = edad;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public Icon getImage () {
        return image;
    }

    public void setImage (Icon image) {
        this.image = image;
    }

    public String getNumero () {
        return numero;
    }

    public void setNumero (String url) {
        this.numero = url;
    }

}
