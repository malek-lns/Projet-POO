package projet_poo;

public class Patient {
    // Attributs
    private String nom;
    private String prenom;
    private String adresse;
    private String numeroSecu;
    private DossierMedical dossierMedical;

    // Constructeur
    public Patient(String nom, String prenom, String adresse, String numeroSecu, DossierMedical dossierMedical) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numeroSecu = numeroSecu;
        this.dossierMedical = dossierMedical;
    }

    // Getters et setters
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroSecu() {
        return numeroSecu;
    }

    public void setNumeroSecu(String numeroSecu) {
        this.numeroSecu = numeroSecu;
    }

    public DossierMedical getDossierMedical() {
        return dossierMedical;
    }

    public void setDossierMedical(DossierMedical dossierMedical) {
        this.dossierMedical = dossierMedical;
    }
   
}
