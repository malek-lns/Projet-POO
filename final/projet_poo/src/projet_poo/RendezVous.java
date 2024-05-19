package projet_poo;
import java.util.Date;

public class RendezVous {
    // Attributs
    private Date date;
    private String heure;
    private Medecin medecin;
    private Patient patient;
    private String statut; /*Confirmé | En attente de confirmation | Annulé par le patient | Annulé par le médecin |Reporté |Terminé  */
    
    // Constructeurs
    public RendezVous(Date date, String heure, Medecin medecin, Patient patient, String statut) {
        this.date = date;
        this.heure = heure;
        this.medecin = medecin;
        this.patient = patient;
        this.statut = statut;
    }
    public RendezVous(Date date, String heure, Medecin medecin, Patient patient) {
        this.date = date;
        this.heure = heure;
        this.medecin = medecin;
        this.patient = patient;
    }
    
    // Getters et setters
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public String getHeure() {
        return heure;
    }
    
    public void setHeure(String heure) {
        this.heure = heure;
    }
    
    public Medecin getMedecin() {
        return medecin;
    }
    
    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getStatut() {
        return statut;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }
    
}
