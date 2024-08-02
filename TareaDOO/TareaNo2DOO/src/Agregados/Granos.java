package Agregados;

public class Granos implements Ingrediente {
    private String tipo;
    private int cantida;
    public Granos(String tipo) {
        this.tipo = tipo;

    }
    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {

        return 0;
    }
}
