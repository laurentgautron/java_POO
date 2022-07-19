package exos_interfaces;

public class PaymentNormal {
    private String paymentService;

    public void ProcessPayment() {
        // injection de la classe (injection des dépendances)
        // classe et methode processpayment
        if (paymentService.equals("visa")) {
            System.out.println("Paiement par visa en cours...");
        } else if (paymentService.equals("paypal")) {
            System.out.println("Paiement par Paypal en cours...");
        } else if (paymentService.equals("masterCard")) {
            System.out.println("Paiement par MasterCard en cours...");
        }
    }
}
