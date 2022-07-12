package POO;

public class Main {
    public static void main(String[] args) {
        // Objet = instance
        Avion boeing737Map = new Avion();
        boeing737Map.setFabricant( "boeing");
        boeing737Map.setModele("737 Max 10");
        boeing737Map.setNombreSieges(200);
        boeing737Map.setCouleur("white");
        System.out.printf("%s\n=======================\n", boeing737Map.nomCompletAvion());
        System.out.printf("Marque: %s\nModèle: %s\nNombre de siège: %d\nCouleur: %s\n",
                boeing737Map.getFabricant(),
                boeing737Map.getModele(),
                boeing737Map.getNombreSieges(),
                boeing737Map.getCouleur());

        Avion airbusA320 = new Avion();
        airbusA320.setFabricant("airbus");
        airbusA320.setModele("A320");
        airbusA320.setNombreSieges(150);
        airbusA320.setCouleur("white");
        System.out.printf("%s\n=======================\n", airbusA320.nomCompletAvion());
        System.out.printf("Marque: %s\nModèle: %s\nNombre de sièges: %d\nCouleur: %s\n",
                airbusA320.getFabricant(),
                airbusA320.getModele(),
                airbusA320.getNombreSieges(),
                airbusA320.getCouleur());

        Avion monAvion = new Avion(); // si on ne renseigne pas les données
        // toutes les variables d'origine primitive seront à 0 (pour les int)
        // à null (pour les String)
        System.out.printf("Marque: %s\nModèle: %s\nNombre de sièges: %d\nCouleur: %s\n",
                monAvion.getFabricant(),
                monAvion.getModele(),
                monAvion.getNombreSieges(),
                monAvion.getCouleur());

        // opérations objet Rectangle
        Rectangle rec = new Rectangle();
        rec.setLargeur(200.5);
        rec.setLongueur(150.3);
        System.out.println("##############################");
        System.out.println("######## Rectangle ###########");
        System.out.println("##############################");
        System.out.println("Longueur: " + rec.getLongueur());
        System.out.println("Largeur: " + rec.getLargeur());
        System.out.println("La surface du rectangle est: " + rec.calculAire());
        System.out.println("Le périmètre du rectangle est: " + rec.calculPerimetre());
    }
}
