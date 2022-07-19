package exos_interfaces;

public class MasterCardPayment implements IPaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paiement par master card en cours...");
    }
}
