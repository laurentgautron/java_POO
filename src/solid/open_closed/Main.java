package solid.open_closed;

public class Main {
    public static void main(String[] args) {
        var paypal=new PaypalPayment();
        var paymentService=new PaymentService(paypal);
        paymentService.pay();
    }
}
