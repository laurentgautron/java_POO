package solid.open_closed;

public class PaypalPayment implements IPaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paiement par paypal en cours...");
    }
}
