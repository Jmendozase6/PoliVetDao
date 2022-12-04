package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionSQL {

    private static Connection connection;
    private static final String DATABASE = "db_a90f67_polivet";
    private static final String URL = "jdbc:sqlserver://SQL5109.site4now.net:1433;databaseName=" + DATABASE;
    private static final String USER = "db_a90f67_polivet_admin";
    private static final String PASSWORD = "T9|=-_{}#zr5Y7(";

    private ConexionSQL () {
        conectar();
    }

    private static void conectar () {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static synchronized Connection getConnection () {
        if (connection == null) {
            new ConexionSQL();
        }
        return connection;
    }

    public static void cerrarConexion () {
        try {
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
