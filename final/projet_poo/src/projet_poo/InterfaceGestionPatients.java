package projet_poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceGestionPatients {
    private static Scanner scanner = new Scanner(System.in);

    // Méthode pour créer un nouveau patient avec son dossier médical
    public static Patient creerPatient() {
        System.out.print("Entrez le nom du patient : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom du patient : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez l'adresse du patient : ");
        String adresse = scanner.nextLine();

        System.out.print("Entrez le numéro de sécurité sociale du patient : ");
        String numeroSecu = scanner.nextLine();

        // Création du dossier médical avec les antécédents médicaux et chirurgicaux
        DossierMedical dossierMedical = creerDossierMedical();

        // Assignation du dossier médical au patient
        Patient patient = new Patient(nom, prenom, adresse, numeroSecu, dossierMedical);
        return patient;
    }

    // Méthode pour afficher la liste des patients
    public static void afficherListePatients(List<Patient> patients) {
        System.out.println("Liste des patients :");
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            System.out.println((i + 1) + ". " + patient.getNom() + " " + patient.getPrenom());
        }
    }

    // Méthode pour créer un nouveau dossier médical
    private static DossierMedical creerDossierMedical() {
        System.out.println("Création du dossier médical :");
        System.out.print("Entrez les antécédents médicaux du patient : ");
        String antecedentsMedicaux = scanner.nextLine();
        System.out.print("Entrez les antécédents chirurgicaux du patient : ");
        String antecedentsChirurgicaux = scanner.nextLine();

        // Création du dossier médical avec les informations saisies
        DossierMedical dossierMedical = new DossierMedical(null, antecedentsMedicaux, antecedentsChirurgicaux);
        return dossierMedical;
    }
}
