package Clases;

public class TarjetaCredto implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("paga " + amount + " usando tarjetaCredito.");
    }
}
