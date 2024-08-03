import Ingrenietes.Ingrediente;
import Pasteleria.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan","caja",54);
        System.out.println("empleado =" + empleado);

        Equipo equipo = new Equipo("Horno","Encendido");
        System.out.println("equipo =" + equipo);


        Postre pastel = new Pastel("Chocolate",10,25);
        System.out.println("pastel =" + pastel);

        Sucursal SucursarGuatemala = new Sucursal("JaleLoco","4-25 zona 2");
        System.out.println("Sucursal =" + SucursarGuatemala);
        SucursarGuatemala.agregarEmpleado(empleado);
        SucursarGuatemala.agregarEquipo(equipo);
        SucursarGuatemala.agregarEspecialidad(pastel);
        System.out.println("Sucursal =" + SucursarGuatemala);
    }
}