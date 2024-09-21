package Clases;

public abstract class ControlDePagos {
    protected ControlDePagos nextPago;

    public void setNextPago(ControlDePagos nextPago) {
        this.nextPago = nextPago;
    }

    public abstract void manejarPago(String tipoPago, double amount);
}
