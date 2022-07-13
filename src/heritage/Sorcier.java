package heritage;

public class Sorcier extends Magicien{
    private String batonMagique;

    public Sorcier(String nom, int dureeDeVie, String baguetteMagique, String batonMagique) {
        super(nom, dureeDeVie, baguetteMagique);
        this.batonMagique = batonMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    @Override
    public void rencontrer() {
        System.out.println("Je vais te transformer en biscuit");
    }
}
