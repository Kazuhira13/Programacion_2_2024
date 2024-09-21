package Clases;

public class paypal implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("paga " + amount + " usando paypal.");

    }
}
