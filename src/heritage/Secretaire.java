package heritage;

public class Secretaire extends Personnel{
    private String laboratoire;
    private int salaire;

    public Secretaire(String nom, String annee, String laboratoire, int salaire) {
        super(nom, annee);
        this.laboratoire = laboratoire;
        this.salaire = salaire;
    }

    public String getLaboratoire() {
        return laboratoire;
    }

    public void setLaboratoire(String laboratoire) {
        this.laboratoire = laboratoire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String toString() {
        return super.toString() + String.format("Laboratoire: %s\nSalaire: %d\n", laboratoire, salaire);
    }
}
