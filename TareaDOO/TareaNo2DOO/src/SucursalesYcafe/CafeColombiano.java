package SucursalesYcafe;


import Agregados.Agua;
import Agregados.Granos;

public class CafeColombiano extends Cafe{
    private String TipoGrano;


    public CafeColombiano(String nombre, int tamaño, double precio) {
        super(nombre, tamaño, precio);
        this.TipoGrano = TipoGrano;
        ingredientes.add(new Granos("arabic"));
        ingredientes.add(new Agua(100));

    }

    @Override
    public String toString() {
        return "CafeColombiano{" +
                "TipoGrano='" + TipoGrano + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
