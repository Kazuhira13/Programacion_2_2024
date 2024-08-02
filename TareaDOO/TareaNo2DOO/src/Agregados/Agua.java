package Agregados;

public class Agua implements Ingrediente{
    private int cantidad;

    public Agua(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Agua";
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
