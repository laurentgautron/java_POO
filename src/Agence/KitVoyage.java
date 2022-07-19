package Agence;

import java.util.ArrayList;

public class KitVoyage {
    private String depart;
    private String destination;
    private ArrayList<OptionVoyage> options;

    public KitVoyage(String depart, String destination, ArrayList<OptionVoyage> options) {
        this.depart = depart;
        this.destination = destination;
        this.options = options;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<OptionVoyage> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<OptionVoyage> options) {
        this.options = options;
    }

    public double Prix() {
        double sum = 0;
        for(OptionVoyage optionVoyage : options) {
            sum += optionVoyage.prix();
        }
        return sum;
    }

    @Override
    public String toString() {
        String optionsList = "";
        for (OptionVoyage optionVoyage: options) {
            optionsList += optionVoyage.toString() + "\n";
        }
        return String.format("de %s à %s avec pour options:\n %s\nPrix total: %.1f\n", depart, destination, optionsList, Prix());
    }

    public void ajouterOption(OptionVoyage option) {
        if (option != null) {
            options.add(option);
        }
    }

    public void annuler() {
        options.clear();
    }

    public int getNbOptions() {
        return options.size();
    }
}
