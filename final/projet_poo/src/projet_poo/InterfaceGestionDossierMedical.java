package projet_poo;

import java.util.List;

public class InterfaceGestionDossierMedical {
    // Méthode pour afficher les informations du dossier médical d'un patient
    public static void afficherDossierMedical(Patient patient) {
        System.out.println("Dossier médical de " + patient.getNom() + " " + patient.getPrenom());
        System.out.println("Antécédents médicaux : " + patient.getDossierMedical().getAntecedents().getAntecedentsMedicaux());
        System.out.println("Antécédents chirurgicaux : " + patient.getDossierMedical().getAntecedents().getAntecedentsChirurgicaux());
        System.out.println("Liste des consultations :");
        List<Consultation> consultations = patient.getDossierMedical().getConsultations();
        for (Consultation consultation : consultations) {
            System.out.println("- Date : " + consultation.getDate());
            System.out.println("  Médecin : " + consultation.getMedecin().getNom() + " " + consultation.getMedecin().getPrenom());
            
        }
    }
}
