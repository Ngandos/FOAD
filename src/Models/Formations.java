package Models;

public class Formations {

    private int id;
    private String titre;
    private String description;
    private String formateur;
    private String etudiant;

    public Formations() {
    }

    public Formations(int id, String titre, String description, String formateur, String etudiant) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.formateur = formateur;
        this.etudiant = etudiant;
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
    public String getFormateur() {
        return formateur;
    }
    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }
    public String getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(String etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "Formations{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", formateur='" + formateur + '\'' +
                ", etudiant='" + etudiant + '\'' +
                '}';
    }
}
