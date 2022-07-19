package exos_interfaces;

public class Payment {

    // private
    private IPaymentMethod paymentMethod;

    public Payment(IPaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    public void pay(){
        paymentMethod.processPayment();
    }
}
