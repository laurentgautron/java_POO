package POO;

public class Avion {

    private String fabricant;
    private String modele;
    private int nombreSieges;
    private String couleur;

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
