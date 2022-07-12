package POO;

public class Main {
    public static void main(String[] args) {
        // Objet = instance
        Avion boeing737Map = new Avion();
        boeing737Map.fabricant = "boeing";
        boeing737Map.modele = "737 Max 10";
        boeing737Map.nombreSieges = 200;
        boeing737Map.couleur = "white";
        System.out.printf("%s\n=======================\n", boeing737Map.nomCompletAvion());
        System.out.printf("Marque: %s\nModèle: %s\nNombre de siège: %d\nCouleur: %s\n",
                boeing737Map.fabricant,
                boeing737Map.modele,
                boeing737Map.nombreSieges,
                boeing737Map.couleur);

        Avion airbusA320 = new Avion();
        airbusA320.fabricant = "airbus";
        airbusA320.modele = "A320";
        airbusA320.nombreSieges = 150;
        airbusA320.couleur = "white";
        System.out.printf("%s\n=======================\n", airbusA320.nomCompletAvion());
        System.out.printf("Marque: %s\nModèle: %s\nNombre de sièges: %d\nCouleur: %s\n",
                airbusA320.fabricant,
                airbusA320.modele,
                airbusA320.nombreSieges,
                airbusA320.couleur);

        Avion monAvion = new Avion(); // si on ne renseigne pas les données
        // toutes les variables d'origine primitive seront à 0 (pour les int)
        // à null (pour les String)
        System.out.printf("Marque: %s\nModèle: %s\nNombre de sièges: %d\nCouleur: %s",
                monAvion.fabricant,
                monAvion.modele,
                monAvion.nombreSieges,
                monAvion.couleur);

    }
}
