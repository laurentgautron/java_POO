package exos_interfaces;

public class VisaCardPayment implements IPaymentMethod
{
    @Override
    public void processPayment() {
        System.out.println("Paiement en visa card en cours ...");
    }
}
