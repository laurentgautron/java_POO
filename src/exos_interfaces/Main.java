package exos_interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var method = new Payment(new VisaCardPayment());

        method.pay();


    }
}
