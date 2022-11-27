package datasource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConexionArchivo {

    private File archivo;

    private void crearArchivo () {
        archivo = new File("correos.txt");
        try {
            if (archivo.createNewFile()) {
            }
        } catch (IOException ex) {
            System.err.println("No se puedo crear el archivo");
        }
    }

    public void guardarCorreo (String correo) {
        try {
            crearArchivo();
            boolean existe = new ConexionArchivo().existeCorreo(correo) != null;
            if (!existe) {
                try (FileWriter escribir = new FileWriter(archivo, true)) {
                    escribir.write(correo + "\n");
                }
            }
        } catch (IOException ex) {
            System.err.println("No se puedo escribir sobre el archivo");
        }
    }

    public List<String> obtenerCorreos () {
        List<String> correos = new ArrayList<>();
        String cadena;
        try {
            crearArchivo();
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            cadena = lectura.readLine();
            while (cadena != null) {
                correos.add(cadena);
                cadena = lectura.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return correos;
    }

    public String existeCorreo (String correo) {
        List<String> correos = obtenerCorreos();
        return correos.stream().filter(valor -> valor.equals(correo)).findFirst().orElse(null);
    }

}
