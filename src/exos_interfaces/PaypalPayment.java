package exos_interfaces;

public class PaypalPayment implements IPaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paiement avec Paypal en cours ...");
    }
}
