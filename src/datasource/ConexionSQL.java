package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionSQL {

    public static ConexionSQL instancia;
    private Connection connection;
    private final String DATABASE = "PoliVetDAO";
    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=" + DATABASE;
    private final String USER = "sa";
    private final String PASSWORD = "sa";

    private ConexionSQL () {
    }

    public static synchronized ConexionSQL getInstance () {
        if (instancia == null) {
            instancia = new ConexionSQL();
        }
        return instancia;
    }

    public Connection conectar () {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }

        return connection;
    }

    public void cerrarConexion () {
        try {
            this.connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
