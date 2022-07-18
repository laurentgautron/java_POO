package heritage;

import java.util.ArrayList;
import java.util.List;

public class MainPersonnel {
    public static void main(String[] args) {

        EtudiantRegulier etudiantRegulier1 = new EtudiantRegulier(
                "Chris Lisangola",
                "2013",
                "Physique",
                15F);

        EtudiantRegulier etudiantRegulier2 = new EtudiantRegulier(
                "JIhane Cheddadi",
                "2011",
                "Math Informatique",
                19.4F);

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

        System.out.println("Nombre de personnes (avec compteur): " + etudiantEchange.getCompteurPersonnes());
        System.out.println();
        System.out.println(etudiantRegulier1 + etudiantSentence(etudiantRegulier1));
        System.out.println();
        System.out.println(etudiantRegulier2 + etudiantSentence(etudiantRegulier2));
        System.out.println();
        System.out.println(etudiantEchange + etudiantSentence(etudiantEchange));
        System.out.println();
        System.out.println(enseignant + etudiantSentence(enseignant));
        System.out.println();
        System.out.println(secretaire + etudiantSentence(secretaire));

        ArrayList<Personnel> personnes = new ArrayList<>();
        personnes.add(etudiantRegulier1);
        personnes.add(etudiantRegulier2);
        personnes.add(etudiantEchange);
        personnes.add(enseignant);
        personnes.add(secretaire);

        ArrayList<Personnel> etudiantsListe = new ArrayList<>();

        for (Personnel personne : personnes) {
            if (personne.estEtudiant()) {
                etudiantsListe.add(personne);
            }
        }

        int compteurEtudiant = 0;
        for (Personnel personne : personnes) {
            if (personne.estEtudiant()) {
                compteurEtudiant++;
            }
        }

        System.out.println("nombre étudiant ( taille de tableau): " + etudiantsListe.size());
        System.out.println("nombre etudiant ( comptage tableau personnes): " + compteurEtudiant);

        System.out.println();
        System.out.println("################################");
        System.out.println("#### Liste des étudiants ######");
        System.out.println("################################");
        for (Personnel etudiant : etudiantsListe) {
            System.out.println(etudiant);
        }

        List<Personnel> etudiants = personnes.stream().filter(Personnel::estEtudiant).toList();
        System.out.println();
        System.out.println("##########################################");
        System.out.println("###### Les étudiants avec stream ########");
        System.out.println("##########################################");

        for(Personnel etudiant : etudiants) {
            System.out.println(etudiant);
        }

        int nbEtudiants = 0;
        for (Personnel personne: personnes) {
            if (personne.estEtudiant()) {
                nbEtudiants = ((Etudiant) personne).getCompteurEtudiant();
                break;
            }
        }

        System.out.println("nombre étudiants avec compteur: " + nbEtudiants);

        int nbPersonnes = personnes.size();
        System.out.println("Nombre de personnes (taille tableau): " + nbPersonnes);
    }

    public static String etudiantSentence(Personnel personne) {
        return personne.estEtudiant() ? "c'est un étudiant" : "Ce n'es pas un étudiant";
    }
}
