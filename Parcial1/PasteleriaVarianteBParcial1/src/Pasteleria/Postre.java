package Pasteleria;

import Ingrenietes.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public  abstract class Postre {
    private String nombre;
    private int tamaño;
    private int precio;
    protected List<Ingrediente> ingredientes = new ArrayList<>();

    public Postre(String nombre,int tamaño, int precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }
}
