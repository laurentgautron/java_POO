package Agence;

public class Transport extends OptionVoyage {
    final double TARIF_LONG = 1500.0;
    final double TARIF_BASE = 200.0;
    private boolean islong;
    private double prixTransport;

    public Transport(String nom, double prix, boolean islong) {
        super(nom, prix);
        this.islong = islong;
        this.prixTransport = islong ? TARIF_LONG : TARIF_BASE;
    }

    public boolean islong() {
        return islong;
    }

    public void setIslong(boolean islong) {
        this.islong = islong;
    }

    public double getPrixTransport() {
        return prixTransport;
    }

    public void setPrixTransport(double prixTransport) {
        this.prixTransport = prixTransport;
    }

    @Override
    public double prix() {
        return super.prix() + (islong ? TARIF_LONG : TARIF_BASE);
    }
}
