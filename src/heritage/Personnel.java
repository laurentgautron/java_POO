package heritage;

public abstract class Personnel {
    private String nom;
    private String annee;
    private static int compteur = 0;

    public Personnel(String nom, String annee) {
        this.nom = nom;
        this.annee = annee;
        compteur++;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String toString() {
        return String.format("Nom: %s\nAnnée: %s\n", nom, annee);
    }

    public int getCompteurPersonnes() {
        return compteur;
    }

    public boolean estEtudiant() {
        return false;
    }
}
