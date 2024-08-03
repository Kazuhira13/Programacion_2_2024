package Pasteleria;

import Ingrenietes.Cobertura;
import Ingrenietes.Masa;

public class Brownie extends Postre{
    private String TipoChocolate;

    public Brownie(String nombre, int tamaño, int precio) {
        super(nombre, tamaño, precio);
        this.TipoChocolate = TipoChocolate;
        ingredientes.add(new Masa("Chocolate",4));
        ingredientes.add(new Cobertura("Chocolate",5));
    }

    @Override
    public String toString() {
        return "Brownie{" +
                "TipoChocolate='" + TipoChocolate + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
