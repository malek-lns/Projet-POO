package projet_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionnaireCabinet gestionnaireCabinet = new GestionnaireCabinet();

        boolean quitter = false;
        while (!quitter) {
            InterfaceUtilisateur.afficherMenuPrincipal();
            System.out.print("Entrez votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    gererPatients(scanner, gestionnaireCabinet);
                    break;
                case 2:
                    gererMedecins(scanner, gestionnaireCabinet);
                    break;
                case 3:
                    gererRendezVous(scanner, gestionnaireCabinet);
                    break;
                case 4:
                    quitter = true;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 4.");
            }
        }

        System.out.println("Merci d'avoir utilisé notre application !");
        scanner.close();
    }

    public static void gererPatients(Scanner scanner, GestionnaireCabinet gestionnaireCabinet) {
        boolean retourMenuPrincipal = false;
        while (!retourMenuPrincipal) {
            InterfaceUtilisateur.afficherMenuGestionPatients();
            System.out.print("Entrez votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    Patient nouveauPatient = InterfaceGestionPatients.creerPatient();
                    gestionnaireCabinet.ajouterPatient(nouveauPatient);
                    break;
                case 2:
                    InterfaceGestionPatients.afficherListePatients(gestionnaireCabinet.getPatients());
                    break;
                case 3:
                    afficherDossierMedical(scanner, gestionnaireCabinet);
                    break;
                case 4:
                    retourMenuPrincipal = true; // Mettre retourMenuPrincipal à true pour retourner au menu principal
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 4.");
            }
        }
    }

    public static void afficherDossierMedical(Scanner scanner, GestionnaireCabinet gestionnaireCabinet) {
        InterfaceGestionPatients.afficherListePatients(gestionnaireCabinet.getPatients());
        System.out.print("Choisissez le patient (entrez le numéro) : ");
        int choixPatient = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la nouvelle ligne
        Patient patientChoisi = gestionnaireCabinet.getPatients().get(choixPatient - 1);
        InterfaceGestionDossierMedical.afficherDossierMedical(patientChoisi);
    }

    public static void gererMedecins(Scanner scanner, GestionnaireCabinet gestionnaireCabinet) {
        boolean retourMenuPrincipal = false;
        while (!retourMenuPrincipal) {
            InterfaceUtilisateur.afficherMenuGestionMedecins();
            System.out.print("Entrez votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    Medecin nouveauMedecin = InterfaceGestionMedecins.creerMedecin();
                    gestionnaireCabinet.ajouterMedecin(nouveauMedecin);
                    break;
                case 2:
                    InterfaceGestionMedecins.afficherListeMedecins(gestionnaireCabinet.getMedecins());
                    break;
                case 3:
                    retourMenuPrincipal = true; // Mettre retourMenuPrincipal à true pour retourner au menu principal
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 3.");
            }
        }
    }

    public static void gererRendezVous(Scanner scanner, GestionnaireCabinet gestionnaireCabinet) {
        boolean retourMenuPrincipal = false;
        while (!retourMenuPrincipal) {
            InterfaceUtilisateur.afficherMenuGestionRendezVous();
            System.out.print("Entrez votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    RendezVous nouveauRendezVous = InterfaceGestionRendezVous.prendreRendezVous(gestionnaireCabinet.getMedecins());
                    if (nouveauRendezVous != null) {
                        gestionnaireCabinet.ajouterRendezVous(nouveauRendezVous);
                        System.out.println("Rendez-vous pris avec succès !");
                    } else {
                        System.out.println("Impossible de prendre le rendez-vous. Veuillez réessayer.");
                    }
                    break;
                case 2:
                    InterfaceGestionRendezVous.afficherListeRendezVous(gestionnaireCabinet.getRendezVous());
                    break;
                case 3:
                    retourMenuPrincipal = true;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 3.");
            }
        }
    }
}
