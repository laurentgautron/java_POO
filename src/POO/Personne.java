package POO;

/*TP 2.
        Créer une classe qui permette de représenter une personne par son nom, prénom, nombre d’enfants et qui permet
        de savoir s’il est marié.
        Prévoir ensuite une méthode qui retourne le nom complet.
        Dans main, il faudra fournir toutes ces données à partir du clavier et ensuite afficher les informations
        sur la personne créée. (modifié)*/

public class Personne {

    private String nom;
    private String prenom;
    private int nombreEnfants;
    private boolean celibat;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }

    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public boolean isCelibat() {
        return celibat;
    }

    public void setCelibat(String situation) {
        System.out.println("la situation: " + situation);
        if (situation == "M") {
            this.celibat = true;
        } else {
            this.celibat = false;
        }
    }

    public void displayPersonne() {
        // penser à formatted !!
        System.out.println("##############################");
        System.out.println("######## Personne ###########");
        System.out.println("##############################");
        System.out.printf("%s %s\n", nom, prenom);
        String situation = isCelibat() ? "Célibataire" : "Marié";
        System.out.println(situation);
        String pluriel = nombreEnfants > 1 ? "s" : "";
        System.out.printf("%d enfant%s", nombreEnfants, pluriel);
    }
}

