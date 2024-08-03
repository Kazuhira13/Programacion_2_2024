package Pasteleria;

import Ingrenietes.Relleno;

public class Crepa extends Postre{
    private String tipoMasa;

    public Crepa(String nombre, int tamaño, int precio) {
        super(nombre, tamaño, precio);
        this.tipoMasa = tipoMasa;
        ingredientes.add(new Relleno("Fresa",5));
    }

    @Override
    public String toString() {
        return "Crepa{" +
                "tipoMasa='" + tipoMasa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
