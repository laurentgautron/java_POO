package POO;

import java.util.Scanner;

public class MainPersonnes {
    public static void main(String[] args) {
        // 2
        Personne humain = new Personne();

        Scanner input = new Scanner(System.in);

        System.out.println("Entrer un Nom: ");
        humain.setNom(input.nextLine());
        System.out.println("Entrer un Prenom: ");
        humain.setPrenom(input.nextLine());
        System.out.println("Entrer un Nombre d'enfants: ");
        humain.setNombreEnfants(input.nextInt());
        // pour éviter le prob avec le nextInt()
        input.nextLine();
        System.out.println("Entrer la situation maritale marié(M) ou célibataire(C): ");
        humain.setCelibat(input.nextLine());

        humain.displayPersonne();

    }
}
