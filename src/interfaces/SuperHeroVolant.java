package interfaces;

// on ne peut pas faire hériter SuperHeroVolant car le langage java ne gère pas l'héritage multiple
public class SuperHeroVolant extends SuperHero implements Voler {
    private double altitude;

    public SuperHeroVolant(String name, String dateDeNaissance, int niveauDePouvoir, double altitude) {
        super(name, dateDeNaissance, niveauDePouvoir);
        this.altitude = altitude;
    }

    public void voler() {
        System.out.println("Je peux voler");
    }
}
