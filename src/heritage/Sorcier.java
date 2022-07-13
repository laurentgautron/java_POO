package heritage;

public class Sorcier {
    private String nom;
    private int dureeDeVie;
    private String baguetteMagique;
    private String batonMagique;

    public Sorcier(String nom, int dureeDeVie, String baguetteMagique, String batonMagique) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        this.baguetteMagique = baguetteMagique;
        this.batonMagique = batonMagique;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    public void rencontrer() {
        System.out.println("Je vais te transformer en biscuit");
    }

    @Override
    public String toString() {
        return String.format("Nom: %s\nDurée de vie: %d\nBagette magique: %s\nBatôn magique: %s",
                nom, dureeDeVie, baguetteMagique, batonMagique);
    }
}
