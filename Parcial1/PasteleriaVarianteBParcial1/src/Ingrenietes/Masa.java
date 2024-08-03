package Ingrenietes;

public class Masa implements Ingrediente{
    private String tipo;
    private int cantidad;
    public Masa(String tipo,int cantidad) {
        this.cantidad = cantidad;
        this.tipo = tipo;

    }
    @Override
    public String obtenerNombre() {
        return "Masa"+tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
