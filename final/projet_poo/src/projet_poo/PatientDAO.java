package projet_poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/system";
    private static final String USERNAME = "system";
    private static final String PASSWORD = "****";

    public void creerPatient(Patient patient) {
        String sql = "INSERT INTO patients (nom, prenom, adresse, numero_secu) VALUES (?, ?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, patient.getNom());
            stmt.setString(2, patient.getPrenom());
            stmt.setString(3, patient.getAdresse());
            stmt.setString(4, patient.getNumeroSecu());

            stmt.executeUpdate();
            System.out.println("Patient créé avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la création du patient : " + e.getMessage());
        }
    }

}

