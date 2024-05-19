package projet_poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceGestionConsultations {
    private static Scanner scanner = new Scanner(System.in);

    // Méthode pour créer une nouvelle consultation
    public static Consultation creerConsultation(List<Medecin> medecins, List<Patient> patients) {
        System.out.println("Création d'une nouvelle consultation :");

        // Affichage de la liste des médecins disponibles
        System.out.println("Liste des médecins disponibles :");
        for (int i = 0; i < medecins.size(); i++) {
            System.out.println((i + 1) + ". " + medecins.get(i).getNom() + " " + medecins.get(i).getPrenom());
        }
        System.out.print("Choisissez le médecin (entrez le numéro) : ");
        int choixMedecin = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        // Récupérer le médecin choisi
        Medecin medecinChoisi = medecins.get(choixMedecin - 1);

        // Affichage de la liste des patients
        System.out.println("Liste des patients :");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println((i + 1) + ". " + patients.get(i).getNom() + " " + patients.get(i).getPrenom());
        }
        System.out.print("Choisissez le patient (entrez le numéro) : ");
        int choixPatient = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        // Récupérer le patient choisi
        Patient patientChoisi = patients.get(choixPatient - 1);

        // Description de la consultation
        System.out.print("Entrez la description de la consultation : ");
        String description = scanner.nextLine();
        
        System.out.print("Entrez la date (jj/mm/aaaa) : ");
        String date = scanner.nextLine();

        // Demander l'heure à l'utilisateur
        System.out.print("Entrez l'heure (hh:mm) : ");
        String heure = scanner.nextLine();

        // Créer la consultation
        Consultation consultation = new Consultation(date, heure, medecinChoisi, patientChoisi, description);

        // Ajout des médicaments à l'ordonnance
        System.out.println("Ajout de médicaments à l'ordonnance (entrez 'stop' pour terminer) :");
        List<Medicament> medicaments = new ArrayList<>();
        boolean ajouterMedicament = true;
        while (ajouterMedicament) {
            System.out.print("Entrez le nom du médicament (ou entrez 'stop' pour arrêter) : ");
            String nomMedicament = scanner.nextLine();
            if (nomMedicament.equalsIgnoreCase("stop")) {
                ajouterMedicament = false;
            } else {
                // Créer un objet Medicament avec le nom saisi
                Medicament medicament = new Medicament(nomMedicament, "", "", "", "", "", "");
                // Ajouter le médicament à la liste des médicaments de l'ordonnance
                medicaments.add(medicament);
            }
        }
        

        // Retourner la consultation créée
        return consultation;
    }
}
