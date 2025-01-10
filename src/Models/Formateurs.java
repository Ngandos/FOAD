package Models;

import java.util.List;

public class Formateurs {
    private int id;
    private String nom;
    private String expertise;

    public Formateurs() {

    }

    public Formateurs(int id, String nom, String expertise) {
        this.id = id;
        this.nom = nom;
        this.expertise = expertise;
    }

    public int getId() {
        return this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom = nom;
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
        return "Formateurs {" +
                "id = " + id +
                ", nom = '" + nom + '\'' +
                ", expertise = '" + expertise + '\'' +
                '}';
    }
}
