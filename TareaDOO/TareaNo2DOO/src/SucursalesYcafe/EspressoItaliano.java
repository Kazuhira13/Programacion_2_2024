package SucursalesYcafe;

import Agregados.Agua;
import Agregados.Granos;

public class EspressoItaliano extends Cafe{
    private String intensidad;

    public EspressoItaliano(String nombre, int tamaño, double precio) {
        super(nombre, tamaño, precio);
        this.intensidad = intensidad;
        ingredientes.add(new Granos("italiano"));
        ingredientes.add(new Agua(300));
    }
}
