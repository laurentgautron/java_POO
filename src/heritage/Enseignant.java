package heritage;

public class Enseignant extends Secretaire {
    private String sectionEnseignement;

    public Enseignant(String nom, String annee, String laboratoire, int salaire, String sectionEnseignement) {
        super(nom, annee, laboratoire, salaire);
        this.sectionEnseignement = sectionEnseignement;
    }

    public String getSectionEnseignement() {
        return sectionEnseignement;
    }

    public void setSectionEnseignement(String sectionEnseignement) {
        this.sectionEnseignement = sectionEnseignement;
    }

    public String toString() {
        return super.toString() + String.format("Section Enseignement: %s\n", sectionEnseignement);
    }
}
