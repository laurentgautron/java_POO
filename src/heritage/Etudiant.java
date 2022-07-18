package heritage;

public abstract class Etudiant extends Personnel {
    private String section;

    private static int compteurEtudiant = 0;

    public Etudiant(String nom, String annee, String section) {
        super(nom, annee);
        this.section = section;
        compteurEtudiant++;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCompteurEtudiant() {
        return compteurEtudiant;
    }

    @Override
    public boolean estEtudiant() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Section: %s\n", section);
    }
}
