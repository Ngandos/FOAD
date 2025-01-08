package Models;

import java.util.ArrayList;
import java.util.List;

public class Formations {

    private int id;
    private String titre;
    private String description;
    private Formateurs formateur;
    private List<Etudiants> etudiant;

    public Formations() {
    }

    public Formations(int id, String titre, String description, Formateurs formateur) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.formateur = formateur;
        this.etudiant = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public List<Etudiants> getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(List<Etudiants> etudiant) {
        this.etudiant = etudiant;
    }
    public void ajouterUnEtudiant(Etudiants etudiants) {
        this.etudiant.add(etudiants);
    }

    @Override
    public String toString() {
        return "Formations{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", formateur=" + (formateur != null ? formateur.getNom() : "Aucun formateur") +
                ", nombre d'étudiants=" + (etudiant != null ? etudiant.size() : 0) +
                '}';
    }
}
