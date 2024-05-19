package projet_poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultationDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/system";
    private static final String USERNAME = "system";
    private static final String PASSWORD = "****";

    public void creerConsultation(Consultation consultation) {
        String sql = "INSERT INTO consultations (medecin_id, patient_id, description) VALUES (?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, consultation.getMedecin());
            stmt.setInt(2, consultation.getPatient());
            stmt.setString(3, consultation.getDescription());

            stmt.executeUpdate();
            System.out.println("Consultation créée avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la création de la consultation : " + e.getMessage());
        }
    }

    // Autres méthodes pour les opérations de mise à jour, de suppression et de récupération des données
}
