package Clases;

public class CriptoMoneda implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("paga " + amount + " uso cripto moneda.");
    }
}
