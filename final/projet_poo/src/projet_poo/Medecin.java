package projet_poo;

import java.util.ArrayList;
import java.util.List;

public class Medecin {
    // Attributs
    private String nom;
    private String prenom;
    private String specialite;
    private String adresse;
    private String horairesTravail;
    private String numeroTelephone;
    private List<Consultation> consultations; // Liste des consultations effectuées par le médecin
    
    // Constructeur
    public Medecin(String nom, String prenom, String specialite, String adresse, String horairesTravail, String numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.adresse = adresse;
        this.horairesTravail = horairesTravail;
        this.numeroTelephone = numeroTelephone;
        this.consultations = new ArrayList<>(); // Initialisation de la liste des consultations
    }
    
    // Getters et setters
    public List<Consultation> getConsultations() {
        return consultations;
    }
    
    // Méthode pour ajouter une consultation
    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation);
    }
    
    // Méthode pour afficher les consultations du médecin
    public void afficherConsultations() {
        System.out.println("Consultations du Dr. " + nom + " " + prenom + " (" + specialite + ") :");
        for (Consultation consultation : consultations) {
            System.out.println("Date : " + consultation.getDate() + ", Heure : " + consultation.getHeure() + ", Patient : " +
                    consultation.getPatient().getNom() + " " + consultation.getPatient().getPrenom());
        }
    }
    
    // Autres méthodes de la classe
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getHorairesTravail() {
        return horairesTravail;
    }

    public void setHorairesTravail(String horairesTravail) {
        this.horairesTravail = horairesTravail;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}
