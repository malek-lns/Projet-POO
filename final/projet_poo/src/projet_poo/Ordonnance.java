package projet_poo;

import java.util.Date;
import java.util.List;

public class Ordonnance {
    // Attributs
    private Date date;
    private Medecin medecinPrescripteur;
    private Patient patient;
    private List<Medicament> medicaments;
    
    // Constructeur
    public Ordonnance(Date date, Medecin medecinPrescripteur, Patient patient, List<Medicament> medicaments) {
        this.date = date;
        this.medecinPrescripteur = medecinPrescripteur;
        this.patient = patient;
        this.medicaments = medicaments;
    }
    
    
    // Getters et setters
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Medecin getMedecinPrescripteur() {
        return medecinPrescripteur;
    }
    
    public void setMedecinPrescripteur(Medecin medecinPrescripteur) {
        this.medecinPrescripteur = medecinPrescripteur;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public List<Medicament> getMedicaments() {
        return medicaments;
    }
    
    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }
    
}