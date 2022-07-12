package POO;

import java.util.ArrayList;

public class approcheProcedurale {

    static double calculPerimetre (double longueur, double largeur) {
        return 2 * (longueur + largeur);
    }

    static double calculAire(double longueur, double largeur) {
        return longueur * largeur;
    }

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("orange");
        System.out.println(fruits.isEmpty());
        double longueur = 200.5;
        double largeur = 50.5;
        double masse = 30.5;

        System.out.println("Surface: " + calculAire(longueur, largeur));
        System.out.println("Périmètre: " + calculPerimetre(longueur, largeur));
    }
}
