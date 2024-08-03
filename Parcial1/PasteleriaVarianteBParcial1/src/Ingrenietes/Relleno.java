package Ingrenietes;

public class Relleno implements Ingrediente{
    private String Sabor;
    private int Cantidad;
    public Relleno(String Sabor, int Cantidad) {
        this.Sabor = Sabor;
        this.Cantidad = Cantidad;
    }
    @Override
    public String obtenerNombre() {
        return "Sabor"+Sabor;
    }

    @Override
    public int obtenerCantidad() {
        return Cantidad;
    }

    @Override
    public String toString() {
        return "Relleno{" +
                "Sabor='" + Sabor + '\'' +
                ", Cantidad=" + Cantidad +
                '}';
    }
}
