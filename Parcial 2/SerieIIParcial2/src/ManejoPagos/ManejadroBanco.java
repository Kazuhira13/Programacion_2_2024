package ManejoPagos;

import Clases.Banco;
import Clases.ControlDePagos;
import Clases.CriptoMoneda;
import Clases.PaymentStrategy;

public class ManejadroBanco extends ControlDePagos {
    private PaymentStrategy strategy = new Banco();

    @Override
    public void manejarPago(String tipoPago, double amount) {
        if (tipoPago.equalsIgnoreCase("banco")) {
            strategy.pay(amount);
        } else if (nextPago != null) {
            nextPago.manejarPago(tipoPago, amount);
        }
    }
}
