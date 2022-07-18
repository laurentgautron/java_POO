package interfaces;

public class Main {
    public static void main(String[] args) {
        var superman = new SuperHeroVolant("Clark KENT", "23/09/1889", 500, 1000);
        var flash = new SuperHeroCourant("Barry Allen", "03/05/1890", 300, 300);
        var insecte = new MechantInsecte("Jeff GoldBlum", "05/02/1790");

        var action = new Actions();
        // superman implémente l'interface voler donc peut être passer en paramètre
        action.presenterUnPersonnageVolant(superman);
    }
}
