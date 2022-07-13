package POO;

import java.util.Scanner;

public class MainImc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Rentrez votre poids (en Kg): ");
        double poids = input.nextDouble();
        input.nextLine();
        System.out.println("Rentrez votre taille ( en m ): ");
        double taille = input.nextDouble();

        PatientImc patient = new PatientImc(poids, taille);

        System.out.println("Votre poids: "+ patient.getPoids());
        System.out.println("Votre taille: " + patient.getTaille());
        System.out.println("Votre IMC: " + patient.displayImc());

    }
}
