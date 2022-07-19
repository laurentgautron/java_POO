package Agence;

public class OptionVoyage {
    private String nom;
    private double prix;

    public OptionVoyage(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double prix() {
        return prix;
    }

    @Override
    public String toString() {
        return String.format("%s -> %.1f", nom, prix);
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
