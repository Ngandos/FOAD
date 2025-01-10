package Models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

public class Formations {
    public int id;
    public String titre;
    public String description;
    public Formateurs formateur;
    public List<Etudiants> etudiant = new ArrayList<>();

    public Formations(int id, String titre, String description, Formateurs formateur) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.formateur = formateur;
    }

    public int getId() {
        return this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Formateurs getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateurs formateur) {
        this.formateur = formateur;
    }

    public Collection<Etudiants> getEtudiant() {
        return null;
    }

    public void setEtudiant(List<Etudiants> etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "Formations {" +
                "id = " + id +
                ", titre = '" + titre + '\'' +
                ", description = '" + description + '\'' +
                ", formateur = " + formateur +
                '}';
    }


}