package projet_poo;

public class AntecedentMedical {
    // Attributs
    private String antecedentsMedicaux;
    private String antecedentsChirurgicaux;
    
    // Constructeur
    public AntecedentMedical(String antecedentsMedicaux, String antecedentsChirurgicaux) {
        this.antecedentsMedicaux = antecedentsMedicaux;
        this.antecedentsChirurgicaux = antecedentsChirurgicaux;
    }
    
    // Getters et setters
    public String getAntecedentsMedicaux() {
        return antecedentsMedicaux;
    }
    
    public void setAntecedentsMedicaux(String antecedentsMedicaux) {
        this.antecedentsMedicaux = antecedentsMedicaux;
    }
    
    public String getAntecedentsChirurgicaux() {
        return antecedentsChirurgicaux;
    }
    
    public void setAntecedentsChirurgicaux(String antecedentsChirurgicaux) {
        this.antecedentsChirurgicaux = antecedentsChirurgicaux;
    }
    
    // Autres méthodes de la classe
}
