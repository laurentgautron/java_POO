package POO;

public class PatientImc {

    private double poids;
    private double taille;

    public double getPoids() {
        return poids;
    }

    public PatientImc(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double displayImc() {
        return poids/Math.pow(taille, 2);
    }
}
