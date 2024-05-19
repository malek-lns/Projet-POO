package projet_poo;
import java.util.Date;

public class Consultation {
    // Attributs
    private String date;
    private String heure;
    private Medecin medecinTraitant;
    private Patient patient;
    private String description;
    
    // Constructeur
    public Consultation(String date, String heure, Medecin medecinTraitant, Patient patient, String description) {
        this.date = date;
        this.heure = heure;
        this.medecinTraitant = medecinTraitant;
        this.patient = patient;
        this.description = description;
    }
    
    // Getters et setters
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getHeure() {
        return heure;
    }
    
    public void setHeure(String heure) {
        this.heure = heure;
    }
    
    public Medecin getMedecinTraitant() {
        return medecinTraitant;
    }
    
    public void setMedecinTraitant(Medecin medecinTraitant) {
        this.medecinTraitant = medecinTraitant;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Medecin getMedecin() {
        return medecinTraitant;
    }

    
    
}