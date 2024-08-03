package Pasteleria;

import Ingrenietes.Cobertura;
import Ingrenietes.Masa;
import Ingrenietes.Relleno;

public class Pastel extends Postre{
    private String sabor;

    public Pastel(String nombre, int tamaño, int precio) {
        super(nombre, tamaño, precio);
        this.sabor = sabor;
        ingredientes.add(new Masa("Vainilla",4));
        ingredientes.add(new Cobertura("Chocolate",5));
        ingredientes.add(new Relleno("Fresa",4));

    }

    @Override
    public String toString() {
        return "Pastel{" +
                "sabor='" + sabor + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
