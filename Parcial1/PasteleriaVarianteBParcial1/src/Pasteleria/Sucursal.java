package Pasteleria;

import Ingrenietes.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    protected List<Empleado>empleados = new ArrayList<>();
    protected List<Equipo>equipos = new ArrayList<>();
    protected List<Ingrediente>ingredientes = new ArrayList<>();
    private Postre postre;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarEmpleado(Empleado empleado){
        System.out.println("Agregar Empleado");
        empleados.add(empleado);

    }

    public void agregarIngrediente(Ingrediente ingrediente){
        System.out.println("Agregar Ingrediente");
        ingredientes.add(ingrediente);

    }

    public void agregarEquipo(Equipo equipo){
        System.out.println("Agregar Equipo");
        equipos.add(equipo);

    }

    public void agregarEspecialidad(Postre postre){
        System.out.println("Agregar Especialidad");
        this.postre = postre;

    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                ", equipos=" + equipos +
                ", ingredientes=" + ingredientes +
                ", postre=" + postre +
                '}';
    }
}
