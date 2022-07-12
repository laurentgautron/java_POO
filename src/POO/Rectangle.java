package POO;

public class Rectangle {

    private double longueur = 200.5;
    private double largeur = 50.5;

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    double calculPerimetre() {
        return 2 * (longueur + largeur);
    }

    double calculAire() {
        return longueur * largeur;
    }
}
