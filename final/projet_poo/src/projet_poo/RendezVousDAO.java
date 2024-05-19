package projet_poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RendezVousDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/system";
    private static final String USERNAME = "system";
    private static final String PASSWORD = "****";

    public void planifierRendezVous(RendezVous rendezVous) {
        String sql = "INSERT INTO rendez_vous (date, heure, patient_id, medecin_id) VALUES (?, ?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setDate(1, rendezVous.getDate());
            stmt.setTime(2, rendezVous.getHeure());
            stmt.setInt(3, rendezVous.getPatient());
            stmt.setInt(4, rendezVous.getMedecin());

            stmt.executeUpdate();
            System.out.println("Rendez-vous planifié avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la planification du rendez-vous : " + e.getMessage());
        }
    }

}
