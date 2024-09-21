package ManejoPagos;

import Clases.ControlDePagos;
import Clases.CriptoMoneda;
import Clases.PaymentStrategy;
import Clases.paypal;

public class CriptoManejador extends ControlDePagos {
    private PaymentStrategy strategy = new CriptoMoneda();

    @Override
    public void manejarPago(String tipoPago, double amount) {
        if (tipoPago.equalsIgnoreCase("Cripto")) {
            strategy.pay(amount);
        } else if (nextPago != null) {
            nextPago.manejarPago(tipoPago, amount);
        }
    }
}
