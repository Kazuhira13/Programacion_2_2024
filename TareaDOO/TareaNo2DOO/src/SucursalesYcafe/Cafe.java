package SucursalesYcafe;

import Agregados.Ingrediente;

import java.util.ArrayList;
import java.util.List;
public abstract class Cafe {
    private String nombre;
    private int tamaño;
    private double precio;
    protected List<Ingrediente> ingredientes = new ArrayList<>();

    public Cafe(String nombre, int tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }
}
