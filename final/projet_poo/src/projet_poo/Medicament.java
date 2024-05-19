package projet_poo;

public class Medicament {
    // Attributs
    private String nom;
    private String forme;
    private String dosage;
    private String indications;
    private String contreIndications;
    private String effetsSecondaires;
    private String instructionsPrise;

    // Constructeur
    public Medicament(String nom, String forme, String dosage, String indications, String contreIndications, String effetsSecondaires, String instructionsPrise) {
        this.nom = nom;
        this.forme = forme;
        this.dosage = dosage;
        this.indications = indications;
        this.contreIndications = contreIndications;
        this.effetsSecondaires = effetsSecondaires;
        this.instructionsPrise = instructionsPrise;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }

    public String getContreIndications() {
        return contreIndications;
    }

    public void setContreIndications(String contreIndications) {
        this.contreIndications = contreIndications;
    }

    public String getEffetsSecondaires() {
        return effetsSecondaires;
    }

    public void setEffetsSecondaires(String effetsSecondaires) {
        this.effetsSecondaires = effetsSecondaires;
    }

    public String getInstructionsPrise() {
        return instructionsPrise;
    }

    public void setInstructionsPrise(String instructionsPrise) {
        this.instructionsPrise = instructionsPrise;
    }

    // Méthode toString pour afficher les informations du médicament
    @Override
    public String toString() {
        return "Médicament{" +
                "nom='" + nom + '\'' +
                ", forme='" + forme + '\'' +
                ", dosage='" + dosage + '\'' +
                ", indications='" + indications + '\'' +
                ", contreIndications='" + contreIndications + '\'' +
                ", effetsSecondaires='" + effetsSecondaires + '\'' +
                ", instructionsPrise='" + instructionsPrise + '\'' +
                '}';
    }
}
