package Ingrenietes;

public class Cobertura implements Ingrediente{
    private String tipo;
    private int cantidad;

    public Cobertura(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "tipo"+tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Cobertura{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
