package Pasteleria;

import Ingrenietes.Masa;

public class Cheesecake extends Postre{
    private String TipoQueso;

    public Cheesecake(String nombre, int tamaño, int precio) {
        super(nombre, tamaño, precio);
        this.TipoQueso = TipoQueso;
        ingredientes.add(new Masa("QuesoCrema",3));

    }

    @Override
    public String toString() {
        return "Cheesecake{" +
                "TipoQueso='" + TipoQueso + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
