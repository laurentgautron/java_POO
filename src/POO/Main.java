package POO;

public class Main {
    public static void main(String[] args) {
        // Objet = instance
        Avion boeing737Map = new Avion();
        boeing737Map.fabricant = "boeing";
        boeing737Map.modele = "737 Max 10";
        boeing737Map.nombreSieges = 200;
        boeing737Map.couleur = "white";
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
        System.out.printf("Marque: %s\nModèle: %s\nNombre de sièges: %d\nCouleur: %s",
                airbusA320.fabricant,
                airbusA320.modele,
                airbusA320.nombreSieges,
                airbusA320.couleur);

    }
}