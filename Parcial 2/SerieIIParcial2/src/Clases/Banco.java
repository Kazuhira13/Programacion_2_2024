package Clases;

public class Banco implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("paga " + amount + " usando cuenta bancaria.");

    }
}
