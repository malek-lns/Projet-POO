package projet_poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedecinDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/system";
    private static final String USERNAME = "system";
    private static final String PASSWORD = "****";

    public void creerMedecin(Medecin medecin) {
        String sql = "INSERT INTO medecins (nom, prenom, specialite) VALUES (?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, medecin.getNom());
            stmt.setString(2, medecin.getPrenom());
            stmt.setString(3, medecin.getSpecialite());

            stmt.executeUpdate();
            System.out.println("Médecin créé avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la création du médecin : " + e.getMessage());
        }
    }

    // Autres méthodes pour les opérations de mise à jour, de suppression et de récupération des données
}
