package heritage;

public class EtudiantEchange extends Etudiant{
    private String universiteOrigine;

    public EtudiantEchange(String nom, String annee, String section, String universiteOrigine) {
        super(nom, annee, section);
        this.universiteOrigine = universiteOrigine;
    }

    public String getUniversiteOrigine() {
        return universiteOrigine;
    }

    public void setUniversiteOrigine(String universiteOrigine) {
        this.universiteOrigine = universiteOrigine;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Université d'origine: %s\n", universiteOrigine);
    }
}
