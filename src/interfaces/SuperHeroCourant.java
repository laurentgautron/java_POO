package interfaces;

public class SuperHeroCourant extends SuperHero {
    private int vitesse;

    public SuperHeroCourant(String name, String dateDeNaissance, int niveauDePouvoir, int vitesse) {
        super(name, dateDeNaissance, niveauDePouvoir);
        this.vitesse = vitesse;
    }

    public void courir() {
        System.out.println("Je cours très vite");
    }
}
