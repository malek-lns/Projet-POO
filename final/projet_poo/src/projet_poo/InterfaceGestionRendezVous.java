package projet_poo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InterfaceGestionRendezVous {
    private static Scanner scanner = new Scanner(System.in);

    // Méthode pour prendre un nouveau rendez-vous
    public static RendezVous prendreRendezVous(List<Medecin> medecins) {
        System.out.println("Liste des médecins disponibles :");
        for (int i = 0; i < medecins.size(); i++) {
            System.out.println((i + 1) + ". " + medecins.get(i).getNom() + " " + medecins.get(i).getPrenom());
        }
        System.out.print("Choisissez le médecin (entrez le numéro) : ");
        int choixMedecin = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la nouvelle ligne après nextInt()

        // Déclaration du format de date à l'intérieur de la méthode
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entrez une date (format JJ/MM/AAAA) : ");
        String dateS = scanner.nextLine();

        try {
            Date date = dateFormat.parse(dateS);
            System.out.println("Date saisie : " + dateFormat.format(date));

            System.out.print("Entrez l'heure du rendez-vous (format HH:MM) : ");
            String heure = scanner.nextLine();

            // Création du rendez-vous
            Medecin medecinChoisi = medecins.get(choixMedecin - 1);
            // Statut initialisé à null
            RendezVous rendezVous = new RendezVous(date, heure, medecinChoisi, null);
            return rendezVous;
        } catch (ParseException e) {
            System.out.println("Format de date invalide. Veuillez saisir la date au format JJ/MM/AAAA.");
            return null;
        }
    }

    // Méthode pour afficher la liste des rendez-vous
    public static void afficherListeRendezVous(List<RendezVous> rendezVousList) {
        System.out.println("Liste des rendez-vous :");
        for (int i = 0; i < rendezVousList.size(); i++) {
            RendezVous rdv = rendezVousList.get(i);
            System.out.println((i + 1) + ". " + rdv.getDate() + " - " + rdv.getMedecin().getNom() + " " + rdv.getMedecin().getPrenom());
        }
    }
}
