package POO;

public class Avion {

    String fabricant;
    String modele;
    int nombreSieges;
    String couleur;

    // pas besoin de passer des paramètres
    String nomCompletAvion() {
        // return String.format("%s %s, fabricant, modele);
        return fabricant + " " + modele;
    }
}
