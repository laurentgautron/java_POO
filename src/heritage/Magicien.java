package heritage;

public class Magicien {
    private String nom;
    private int dureeDeVie;
    private String baguetteMagique;

    public Magicien(String nom, int dureeDeVie, String baguetteMagique) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        this.baguetteMagique = baguetteMagique;
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

    public void rencontrer() {
        System.out.println("Je vais te faire disparaître");
    }

    @Override
    public String toString() {
        return String.format("Nom: %s\nDurée de vie: %d\nBagette magique: %s\n", nom, dureeDeVie, baguetteMagique);
    }
}
