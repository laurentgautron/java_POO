package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Objet = instance
        Avion boeing737Map = new Avion("boeing","737 Max 10", 200, "white");
        /*boeing737Map.setFabricant( "boeing");
        boeing737Map.setModele("737 Max 10");
        boeing737Map.setNombreSieges(200);
        boeing737Map.setCouleur("white");*/
        System.out.printf("%s\n=======================\n", boeing737Map.nomCompletAvion());
        System.out.printf("Marque: %s\nModèle: %s\nNombre de siège: %d\nCouleur: %s\n",
                boeing737Map.getFabricant(),
                boeing737Map.getModele(),
                boeing737Map.getNombreSieges(),
                boeing737Map.getCouleur());

        Avion airbusA320 = new Avion("airbus", "A320", 150, "white");
        System.out.printf("%s\n=======================\n", airbusA320.nomCompletAvion());
        System.out.printf("Marque: %s\nModèle: %s\nNombre de sièges: %d\nCouleur: %s\n",
                airbusA320.getFabricant(),
                airbusA320.getModele(),
                airbusA320.getNombreSieges(),
                airbusA320.getCouleur());

        // mauvaise méthode pour copier un objet
        // a et boeing737Map point sur le même objet
        // a == boeing737Map : on copie la référence
        /*Avion a = boeing737Map;
        a.setModele("XYZABC");*/

        // duplication et comparaison
        Avion airbusA330 = new Avion(airbusA320);
        System.out.println("Compare les références: airbusA330 = airbusA320" + (airbusA330 == airbusA320));
        System.out.println("Compare les attributs: airbusA330 = airbusA320" + airbusA330.equals(airbusA320));
        /*airbusA330.setModele("A330");
        System.out.println(airbusA320.getModele());
        System.out.println(airbusA330.getModele());*/


        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Pomme", "mangue", "banane"));
        HashMap<String,String> identite = new HashMap<>();
        identite.put("nom", "Lisangola");
        identite.put("prenom", "Christian");
        String[] noms = {"Sarah", "Jean", "Alain"};
        // la methode toString est appelée implicitement pour afficher les objets
        System.out.println(fruits);
        System.out.println(identite);
        System.out.println(noms);
        System.out.println(boeing737Map);
        System.out.println(boeing737Map);




        Avion monAvion = new Avion(); // si on ne renseigne pas les données
        // toutes les variables d'origine primitive seront à 0 (pour les int)
        // à null (pour les String)
        // sauf si constructeur par défaut
        System.out.printf("%s\n=======================\n", monAvion.nomCompletAvion());
        System.out.printf("Marque: %s\nModèle: %s\nNombre de sièges: %d\nCouleur: %s\n",
                monAvion.getFabricant(),
                monAvion.getModele(),
                monAvion.getNombreSieges(),
                monAvion.getCouleur());

        // opérations objet Rectangle
        /*Rectangle rec = new Rectangle();
        rec.setLargeur(200.5);
        rec.setLongueur(150.3);
        System.out.println("##############################");
        System.out.println("######## Rectangle ###########");
        System.out.println("##############################");
        System.out.println("Longueur: " + rec.getLongueur());
        System.out.println("Largeur: " + rec.getLargeur());
        System.out.println("La surface du rectangle est: " + rec.calculAire());
        System.out.println("Le périmètre du rectangle est: " + rec.calculPerimetre());*/
    }
}
