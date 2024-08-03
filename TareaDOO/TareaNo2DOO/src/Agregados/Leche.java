package Agregados;

public class Leche implements Ingrediente{
    private String tipo;
    private int cantida;
    public Leche(String tipo, int cantida) {
        this.tipo = tipo;
        this.cantida = cantida;

    }
    @Override
    public String obtenerNombre() {
        return "Leche"+tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantida;
    }

    @Override
    public String toString() {
        return "Leche{" +
                "tipo='" + tipo + '\'' +
                ", cantida=" + cantida +
                '}';
    }
}
