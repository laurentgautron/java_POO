package heritage;

public class Magicien extends Personnage {
    private String baguetteMagique;

    public Magicien(String nom, int dureeDeVie, String baguetteMagique) {
        super(nom, dureeDeVie);
        this.baguetteMagique = baguetteMagique;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    /*@Override
    public void rencontrer() {
        System.out.println("Je vais te faire disparaître");
    }*/

    @Override
    public void rencontrer() {
        System.out.println("Je vais te faire disparaitre");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Baguette: %s", baguetteMagique);
    }
}
