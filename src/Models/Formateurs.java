package Models;

public class Formateurs {

    private String nom;
    private String expertise;

    public Formateurs() {
    }

    public Formateurs(String nom, String expertise) {
        this.nom = nom;
        this.expertise = expertise;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getExpertise() {
        return expertise;
    }
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Formateurs{" +
                "nom='" + nom + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}
