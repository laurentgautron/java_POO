package POO;

public class Souris {

    final private int ESPERANCE_DE_VIE_DEFAUT = 36;
    private int poids;
    private String couleur;
    private int age;
    private int lifeExpectancy;
    private boolean clonee;

    // constructeur
    public Souris(int poids, String couleur, int age) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.clonee = false;
        this.lifeExpectancy = ESPERANCE_DE_VIE_DEFAUT;
        System.out.println("Une nouvelle souris");

    }

    // constructeur sans age
    /*public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        System.out.println("Une nouvelle souris");

    }*/

    // constructeur copie
    public Souris (Souris souris) {
        this.poids = souris.poids;
        this.age = souris.age;
        this.couleur = souris.couleur;
        this.lifeExpectancy = ((souris.lifeExpectancy) * 4) / 5;
        this.clonee = true;
        System.out.println("Clonage d'une souris");
    }

    public boolean isClonee() {
        return clonee;
    }

    public String toString() {
        String clone = isClonee() ? ", clonée," : "";
        return String.format("Une souris %s %s de %d moi et pesant %d grammes",
                couleur, clone, age, poids);
    }

    public void vieillir() {
        this.age += 1;
        if (isClonee() && age > lifeExpectancy/2) {
            couleur = "verte";
        }
    }

    public void evolue() {
        while (age < lifeExpectancy) {
            vieillir();
        }
    }

}
