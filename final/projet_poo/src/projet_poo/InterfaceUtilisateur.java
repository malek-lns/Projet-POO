package projet_poo;
import java.util.Scanner;

import java.util.List;

public class InterfaceUtilisateur {
    // Méthodes
    public static void afficherMenuPrincipal() {
        // Afficher le menu principal de l'interface utilisateur
        System.out.println("Bienvenue dans le cabinet médical !");
        System.out.println("1. Gérer les patients");
        System.out.println("2. Gérer les médecins");
        System.out.println("3. Gérer les rendez-vous");
        System.out.println("4. Quitter");
    }
    
    public static void afficherMenuGestionPatients() {
        // Afficher le menu de gestion des patients
        System.out.println("Gestion des patients :");
        System.out.println("1. Ajouter un nouveau patient");
        System.out.println("2. Afficher la liste des patients");
        System.out.println("3. Afficher le Dossier Médical du patient");
        System.out.println("4. Retour au menu principal");
    }
    
    public static void afficherMenuGestionMedecins() {
        // Afficher le menu de gestion des médecins
        System.out.println("Gestion des médecins :");
        System.out.println("1. Ajouter un nouveau médecin");
        System.out.println("2. Afficher la liste des médecins");
        System.out.println("3. Retour au menu principal");
    }
    
    public static void afficherMenuGestionRendezVous() {
        // Afficher le menu de gestion des rendez-vous
        System.out.println("Gestion des rendez-vous :");
        System.out.println("1. Prendre un nouveau rendez-vous");
        System.out.println("2. Afficher la liste des rendez-vous");
        System.out.println("3. Retour au menu principal");
    }
    
    public static void afficherDossierMedical(Scanner scanner, GestionnaireCabinet gestionnaireCabinet) {
        List<Patient> patients = gestionnaireCabinet.getPatients();
        InterfaceGestionPatients.afficherListePatients(patients);
        System.out.print("Choisissez le patient (entrez le numéro) : ");
        int choixPatient = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la nouvelle ligne
        
        // Vérifier si le numéro de patient choisi est valide
        if (choixPatient >= 1 && choixPatient <= patients.size()) {
            Patient patientChoisi = patients.get(choixPatient - 1);
            InterfaceGestionDossierMedical.afficherDossierMedical(patientChoisi);
        } else {
            System.out.println("Numéro de patient invalide.");
        }
    }

    
}
