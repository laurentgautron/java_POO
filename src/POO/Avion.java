package POO;

// constructeur par défaut par défaut : c'est une version minimale du constructeur que la JVM va appeler
// si aucun constructeur n'est défini
// c'est pourquoi lorsqu'on ne définit aucune valeur pour l'avion, il initialise les attributs

public class Avion {

    private String fabricant;
    private String modele;
    private int nombreSieges;
    private String couleur;

    public Avion(String fabricant, String modele, int nombreSieges, String couleur) {
        this.fabricant = fabricant;
        this.modele = modele;
        this.nombreSieges = nombreSieges;
        this.couleur = couleur;
    }

    public String getFabricant() {
        return fabricant;
    }

    public String getModele() {
        return modele;
    }

    public int getNombreSieges() {
        return nombreSieges;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setFabricant(String fabricant) {
        // fabricant = fabricant ; le paramètre empêche de voir l'attribut = masquage
        // this distingue le paramètre de l'attribut
        this.fabricant = fabricant;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setNombreSieges(int nombreSieges) {
        this.nombreSieges = nombreSieges;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // pas besoin de passer des paramètres
    String nomCompletAvion() {
        // return String.format("%s %s, fabricant, modele);
        return fabricant + " " + modele;
    }
}
