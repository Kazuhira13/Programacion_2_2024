package ManejoPagos;

import Clases.ControlDePagos;
import Clases.PaymentStrategy;
import Clases.TarjetaCredto;
import Clases.paypal;

public class PaypalManejo extends ControlDePagos {
    private PaymentStrategy strategy = new paypal();

    @Override
    public void manejarPago(String tipoPago, double amount) {
        if (tipoPago.equalsIgnoreCase("paypal")) {
            strategy.pay(amount);
        } else if (nextPago != null) {
            nextPago.manejarPago(tipoPago, amount);
        }
    }
}
