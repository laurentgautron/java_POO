package POO;

import java.util.Scanner;

public class MainSouris {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Rentrer le poids de la souris: ");
        int poidsSourisBlanche =input.nextInt();
        input.nextLine();
        System.out.print("Rentrer la couleur de la souris: ");
        String couleurSourisBlanche = input.nextLine();
        System.out.print("Age de la souris: ");
        int ageSourisBlanche = input.nextInt();

        Souris sourisBlanche = new Souris(poidsSourisBlanche, couleurSourisBlanche, ageSourisBlanche);

        System.out.print("Rentrer le poids de la souris: ");
        int poidsSourisGrise =input.nextInt();
        input.nextLine();
        System.out.print("Rentrer la couleur de la souris: ");
        String couleurSourisGrise = input.nextLine();
        System.out.print("Age de la souris: ");
        int ageSourisGrise = input.nextInt();

        Souris sourisGrise = new Souris(poidsSourisGrise, couleurSourisGrise, ageSourisGrise);

        // clonage souris
        Souris sourisGriseClonee = new Souris(sourisGrise);

        System.out.println(sourisBlanche);
        System.out.println(sourisGrise);
        System.out.println(sourisGriseClonee);

        sourisBlanche.evolue();
        sourisBlanche.evolue();
        sourisGriseClonee.evolue();

        System.out.println(sourisBlanche);
        System.out.println(sourisGrise);
        System.out.println(sourisGriseClonee);

    }
}
