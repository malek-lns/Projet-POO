package projet_poo;

import java.util.List;

public class FichePatient {
    // Attributs
    private Patient patient;
    private AntecedentMedical antecedentsMedicaux;
    private List<Consultation> consultations;
    private List<Ordonnance> ordonnances;
    private String autresInformations;

    // Constructeur
    public FichePatient(Patient patient, AntecedentMedical antecedentsMedicaux, List<Consultation> consultations, List<Ordonnance> ordonnances, String autresInformations) {
        this.patient = patient;
        this.antecedentsMedicaux = antecedentsMedicaux;
        this.consultations = consultations;
        this.ordonnances = ordonnances;
        this.autresInformations = autresInformations;
    }

    // Getters et setters
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public AntecedentMedical getAntecedentsMedicaux() {
        return antecedentsMedicaux;
    }

    public void setAntecedentsMedicaux(AntecedentMedical antecedentsMedicaux) {
        this.antecedentsMedicaux = antecedentsMedicaux;
    }

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }

    public List<Ordonnance> getOrdonnances() {
        return ordonnances;
    }

    public void setOrdonnances(List<Ordonnance> ordonnances) {
        this.ordonnances = ordonnances;
    }

    public String getAutresInformations() {
        return autresInformations;
    }

    public void setAutresInformations(String autresInformations) {
        this.autresInformations = autresInformations;
    }

    // Autres méthodes de la classe
    public void afficherFichePatient() {
        System.out.println("Fiche patient de " + patient.getPrenom() + " " + patient.getNom());
        System.out.println("Antécédents médicaux : " + antecedentsMedicaux);
        System.out.println("Consultations : ");
        for (Consultation consultation : consultations) {
            System.out.println("- Date : " + consultation.getDate() + ", Heure : " + consultation.getHeure() +
                    ", Médecin : " + consultation.getMedecinTraitant().getNom() + " " + consultation.getMedecinTraitant().getPrenom() +
                    ", Description : " + consultation.getDescription());
        }
        System.out.println("Ordonnances : ");
        for (Ordonnance ordonnance : ordonnances) {
            System.out.println("- Date : " + ordonnance.getDate() + ", Médecin prescripteur : " +
                    ordonnance.getMedecinPrescripteur().getNom() + " " + ordonnance.getMedecinPrescripteur().getPrenom());
            System.out.println("  Médicaments : ");
            for (Medicament medicament : ordonnance.getMedicaments()) {
                System.out.println("  - Nom : " + medicament.getNom() + ", Forme : " + medicament.getForme() +
                        ", Dosage : " + medicament.getDosage() + ", Indications : " + medicament.getIndications());
            }
        }
        System.out.println("Autres informations : " + autresInformations);
    }
}
