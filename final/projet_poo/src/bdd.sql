-- Création de la table des médecins
CREATE TABLE Medecins (
    MedecinID INT AUTO_INCREMENT PRIMARY KEY,
    Nom VARCHAR(100) NOT NULL,
    Prenom VARCHAR(100) NOT NULL,
    Specialite VARCHAR(100),
    CONSTRAINT UC_Medecins_Nom_Prenom UNIQUE (Nom, Prenom)
);

-- Création de la table des patients
CREATE TABLE Patients (
    PatientID INT AUTO_INCREMENT PRIMARY KEY,
    Nom VARCHAR(100) NOT NULL,
    Prenom VARCHAR(100) NOT NULL,
    DateNaissance DATE,
    Adresse VARCHAR(255),
    CONSTRAINT UC_Patients_Nom_Prenom UNIQUE (Nom, Prenom)
);

-- Création de la table des consultations
CREATE TABLE Consultations (
    ConsultationID INT AUTO_INCREMENT PRIMARY KEY,
    MedecinID INT,
    PatientID INT,
    Description TEXT NOT NULL,
    DateConsultation DATE,
    HeureConsultation TIME,
    FOREIGN KEY (MedecinID) REFERENCES Medecins(MedecinID),
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID)
);

-- Création de la table des médicaments
CREATE TABLE Medicaments (
    MedicamentID INT AUTO_INCREMENT PRIMARY KEY,
    Nom VARCHAR(100) NOT NULL,
    CONSTRAINT UC_Medicaments_Nom UNIQUE (Nom)
);

-- Création de la table des ordonnances
CREATE TABLE Ordonnances (
    OrdonnanceID INT AUTO_INCREMENT PRIMARY KEY,
    ConsultationID INT,
    MedicamentID INT,
    Quantite INT NOT NULL CHECK (Quantite > 0),
    FOREIGN KEY (ConsultationID) REFERENCES Consultations(ConsultationID),
    FOREIGN KEY (MedicamentID) REFERENCES Medicaments(MedicamentID)
);

-- Création de la table des allergies
CREATE TABLE Allergies (
    AllergieID INT AUTO_INCREMENT PRIMARY KEY,
    PatientID INT,
    Nom VARCHAR(100) NOT NULL,
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID)
);

-- Création de la table des examens médicaux
CREATE TABLE ExamensMedicaux (
    ExamenID INT AUTO_INCREMENT PRIMARY KEY,
    PatientID INT,
    Type VARCHAR(100) NOT NULL,
    Resultats TEXT NOT NULL,
    DateExamen DATE NOT NULL,
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID)
);

-- Création de la table des rendez-vous
CREATE TABLE RendezVous (
    RendezVousID INT AUTO_INCREMENT PRIMARY KEY,
    MedecinID INT,
    PatientID INT,
    DateRendezVous DATE NOT NULL,
    HeureRendezVous TIME NOT NULL,
    FOREIGN KEY (MedecinID) REFERENCES Medecins(MedecinID),
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID),
    CONSTRAINT UC_RendezVous_Medecin_Patient_DateHeure UNIQUE (MedecinID, PatientID, DateRendezVous, HeureRendezVous)
);