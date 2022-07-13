package heritage;

// classe abstraite, car au moins une méthode de la classe est abstraite
// une classe abstraite ne peut pas être instanciée
// on peut mettre cette classe abstraite même s'il n'y a pas de méthode abstraite, car on n'instancie jamais un personnage,
// mais seulement des classes qui héritent de la classe Personnage
public abstract class Personnage {
    private String nom;
    private int dureeDeVie;

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

    public Personnage(String nom, int dureeDeVie) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
    }

    // méthode abstraite : impose de redéfinir dans toutes les classes qui en héritent
    // le concept rencontrer est unique pour toutes les classes
    public abstract void rencontrer();

    public String toString() {
        return String.format("Nom: %s\nDurée de vie: %d\n", nom, dureeDeVie);
    }
}
