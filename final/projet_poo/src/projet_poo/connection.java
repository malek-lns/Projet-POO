package projet_poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    // Informations de connexion à la base de données
    private static final String URL = "jdbc:mysql://localhost:3306/system";
    private static final String USER = "system";
    private static final String PASSWORD = "****";

    // Méthode pour établir la connexion
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
