package SucursalesYcafe;

import Agregados.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private Cafe cafe;
    private List<Ingrediente> ingredientes = new ArrayList<>();


    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarEmpleado(Empleado empleado){
        System.out.println("Agregar Empleado");
        empleados.add(empleado);
    }

    public void agregarEspecialidad(Equipo equipo){
        System.out.println("Agregar Especialidad");
        equipos.add(equipo);

    }
    public void  agregarEspecialidad(Cafe cafe){
        System.out.println("Agregar Cafe");
        this.cafe = cafe;
    }
    public void agregarIngrediente(Ingrediente ingrediente){
        System.out.println("Agregar Ingrediente");
        ingredientes.add(ingrediente);
    }
}
