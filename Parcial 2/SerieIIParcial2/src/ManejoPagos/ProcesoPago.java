package ManejoPagos;

import Clases.ControlDePagos;

public class ProcesoPago {
    private ControlDePagos primerpago;

    public ProcesoPago(){
        this.primerpago = new tarjetaManejoPagos();
        ControlDePagos Paypalproceso = new PaypalManejo();
        ControlDePagos cryptoproceso = new CriptoManejador();
        ControlDePagos BancoProceso = new ManejadroBanco();

        primerpago.setNextPago(Paypalproceso);
        Paypalproceso.setNextPago(cryptoproceso);
        cryptoproceso.setNextPago(BancoProceso);


    }

    public void processPayment(String tipoPago, double amount) {
        primerpago.manejarPago(tipoPago, amount);
    }
}
