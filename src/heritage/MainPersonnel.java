package heritage;

import java.util.ArrayList;
import java.util.List;

public class MainPersonnel {
    public static void main(String[] args) {

        EtudiantRegulier etudiantRegulier1 = new EtudiantRegulier(
                "Chris Lisangola",
                "2013",
                "Physique",
                15);

        EtudiantRegulier etudiantRegulier2 = new EtudiantRegulier(
                "JIhane Cheddadi",
                "2011",
                "Math Informatique",
                19.4);

        EtudiantEchange etudiantEchange = new EtudiantEchange(
                "Bjorn cote de fer",
                "2012",
                "Physique",
                "Paris 40");

        Enseignant enseignant = new Enseignant(
                "Zinedine Benzema",
                "1998",
                "Physique",
                20000,
                "Physique"
        );

        Secretaire secretaire = new Secretaire(
                "Christianna Lisangolanne",
                "2005",
                "secrétaire",
                5000
        );

        System.out.println("Nombre de personnes (avec compteur: " + etudiantEchange.getCompteur());
        System.out.println();
        System.out.println(etudiantRegulier1 + (etudiantRegulier1.estEtudiant() ? "C'est un étudiant": "Ce n'est pas un étudiant"));
        System.out.println();
        System.out.println(etudiantRegulier2 + (etudiantRegulier2.estEtudiant() ? "C'est un étudiant": "Ce n'est pas un étudiant"));
        System.out.println();
        System.out.println(etudiantEchange + (etudiantEchange.estEtudiant() ? "C'est un étudiant": "Ce n'est pas un étudiant"));
        System.out.println();
        System.out.println(enseignant + (enseignant.estEtudiant() ? "C'est un étudiant": "Ce n'est pas un étudiant"));
        System.out.println();
        System.out.println(secretaire + (secretaire.estEtudiant() ? "C'est un étudiant": "Ce n'est pas un étudiant"));

        /*ArrayList<Personnel> personnes = new ArrayList<>();
        personnes.add(etudiantRegulier1);
        personnes.add(etudiantRegulier2);
        personnes.add(etudiantEchange);
        personnes.add(enseignant);
        personnes.add(secretaire);

        ArrayList<Personnel> etudiantsListe = new ArrayList<>();

        int compteurEtudiants;

        for (Personnel personne : personnes) {
            if (personne.estEtudiant()) {
                etudiantsListe.add(personne);
            }
        }

        System.out.println();
        System.out.println("Liste des étudiants: ");
        for (Personnel etudiant : etudiantsListe) {
            System.out.println(etudiant);
        }



        // long nbEtudiants = personnes.stream().filter(personne->personne.getCategorie().equals("étudiant")).count();

        List<Personnel> etudiants = personnes.stream().filter(Personnel::estEtudiant).toList();
        System.out.println();
        System.out.println("Les étudiants avec stream: ");
        for(Personnel etudiant : etudiants) {
            System.out.println(etudiant);
        }*/


        //System.out.println("Nombre d'étudiants: " + nbEtudiants);
    }
}
