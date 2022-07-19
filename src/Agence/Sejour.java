package Agence;

public class Sejour extends OptionVoyage {
    private int nbNuits;
    private double prixParNuits;

    public Sejour(String nom, double prix, int nbNuits, double prixParNuits) {
        super(nom, prix);
        this.nbNuits = nbNuits;
        this.prixParNuits = prixParNuits;
    }

    public int getNbNuits() {
        return nbNuits;
    }

    public void setNbNuits(int nbNuits) {
        this.nbNuits = nbNuits;
    }

    public double getPrixParNuits() {
        return prixParNuits;
    }

    public void setPrixParNuits(double prixParNuits) {
        this.prixParNuits = prixParNuits;
    }

    @Override
    public double prix() {
        return super.prix() + (prixParNuits * nbNuits);
    }
}
