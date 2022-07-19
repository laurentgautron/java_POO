package solid.open_closed;

public class VisaCardPayment implements IPaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paiement par Visa en cours...");
    }
}
