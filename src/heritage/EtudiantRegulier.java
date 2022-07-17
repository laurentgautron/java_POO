package heritage;

public class EtudiantRegulier extends Etudiant {
    private double moyenne;

    public EtudiantRegulier(String nom, String annee, String section, double moyenne) {
        super(nom, annee, section);
        this.moyenne = moyenne;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(int moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Moyenne: %.0f\n", moyenne);
    }
}
