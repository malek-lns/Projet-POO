package projet_poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DossierMedical {
    // Attributs
    private Patient patient;
    private List<Consultation> consultations;
    private AntecedentMedical antecedents;
    
    // Constructeur
    public DossierMedical(Patient patient, String antecedentsMedicaux, String antecedentsChirurgicaux) {
        this.patient = patient;
        this.consultations = new ArrayList<>();
        
        // Création des antécédents médicaux
        this.antecedents = new AntecedentMedical(antecedentsMedicaux, antecedentsChirurgicaux);
    }
    
    // Méthodes
    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation);
    }
    
    public List<Consultation> getConsultations() {
        return consultations;
    }
    
    public AntecedentMedical getAntecedents() {
        return antecedents;
    }
    
    public void setAntecedents(AntecedentMedical antecedents) {
        this.antecedents = antecedents;
    }
}
