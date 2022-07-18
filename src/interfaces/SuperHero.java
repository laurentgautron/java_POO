package interfaces;

public class SuperHero extends Personnage {
    private int niveauDePouvoir;

    public SuperHero(String name, String dateDeNaissance, int niveauDePouvoir) {
        super(name, dateDeNaissance);
        this.niveauDePouvoir = niveauDePouvoir;
    }
}
