package ManejoPagos;

import Clases.ControlDePagos;
import Clases.PaymentStrategy;
import Clases.TarjetaCredto;

public class tarjetaManejoPagos extends ControlDePagos {
    private PaymentStrategy strategy = new TarjetaCredto();
    @Override
    public void manejarPago(String tipoPago, double amount) {
        if (tipoPago.equalsIgnoreCase("credito")) {
            strategy.pay(amount);
        } else if (nextPago != null) {
            nextPago.manejarPago(tipoPago, amount);
        }
    }
}
