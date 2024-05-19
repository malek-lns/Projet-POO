package projet_poo;

import java.util.List;
import java.util.Date;
import java.util.Scanner;

public class InterfaceGestionMedecins {
    private static Scanner scanner = new Scanner(System.in);

    // Méthode pour créer un nouveau médecin
    public static Medecin creerMedecin() {
        System.out.print("Entrez le nom du médecin : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom du médecin : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez la spécialité du médecin : ");
        String specialite = scanner.nextLine();

        System.out.print("Entrez l'adresse du médecin : ");
        String adresse = scanner.nextLine();

        System.out.print("Entrez les horaires de travail du médecin : ");
        String horairesTravail = scanner.nextLine();

        System.out.print("Entrez le numéro de téléphone du médecin : ");
        String numeroTelephone = scanner.nextLine();

        // Création du médecin
        Medecin medecin = new Medecin(nom, prenom, specialite, adresse, horairesTravail, numeroTelephone);
        return medecin;
    }
    
    // Méthode pour afficher la liste des médecins
    public static void afficherListeMedecins(List<Medecin> medecins) {
        System.out.println("Liste des médecins :");
        for (int i = 0; i < medecins.size(); i++) {
            Medecin medecin = medecins.get(i);
            System.out.println((i + 1) + ". " + medecin.getNom() + " " + medecin.getPrenom() + " - " + medecin.getSpecialite());
        }
    }
}
