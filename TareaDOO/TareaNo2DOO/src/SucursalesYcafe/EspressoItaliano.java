package SucursalesYcafe;

import Agregados.Agua;
import Agregados.Granos;

public class EspressoItaliano extends Cafe{
    private int intensidad;

    public EspressoItaliano(int intensidad, int tamaño, double precio) {
        super(String.valueOf(intensidad), tamaño, precio);
        this.intensidad = intensidad;
        ingredientes.add(new Granos("italiano"));
        ingredientes.add(new Agua(300));
    }

    @Override
    public String toString() {
        return "EspressoItaliano{" +
                "intensidad=" + intensidad +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
