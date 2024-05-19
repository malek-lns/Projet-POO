package projet_poo;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireCabinet {
    // Attributs
    private List<Patient> patients;
    private List<Medecin> medecins;
    private List<RendezVous> rendezVous;
    
    // Constructeur
    public GestionnaireCabinet() {
        this.patients = new ArrayList<>();
        this.medecins = new ArrayList<>();
        this.rendezVous = new ArrayList<>();
    }
    
    // Méthodes
    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }
    
    public List<Patient> getPatients() {
        return patients;
    }
    
    public void ajouterMedecin(Medecin medecin) {
        medecins.add(medecin);
    }
    
    public List<Medecin> getMedecins() {
        return medecins;
    }
    
    public void ajouterRendezVous(RendezVous rdv) {
        rendezVous.add(rdv);
    }
    
    public List<RendezVous> getRendezVous() {
        return rendezVous;
    }
    
   
}
