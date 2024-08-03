import Agregados.Granos;
import Agregados.Ingrediente;
import Agregados.Leche;
import SucursalesYcafe.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan","caja",54);
        System.out.println("empleado =" + empleado);
        Empleado empleado2 = new Empleado("Carla","caja",40);
        System.out.println("empleado2 =" + empleado2);

        Equipo equipo = new Equipo("CajaRe","Encendido");
        System.out.println("equipo =" + equipo);

        Ingrediente granos = new Granos("cafe");
        System.out.println("ingrediente1 =" + granos);
        Ingrediente leche = new Leche("entera",10);
        System.out.println("ingrediente2 =" + leche);

        Cafe Colombiano = new CafeColombiano("cafeColombiano",10,5);
        System.out.println("Cafe =" + Colombiano);

        Cafe espreso = new EspressoItaliano(5,10,4);
        System.out.println("Cafe =" + espreso);

        Sucursal sucursalItalia = new Sucursal("sucursalItalia","zona 15");
        System.out.println("Sucursal =" + sucursalItalia);
        sucursalItalia.agregarEmpleado(empleado);
        sucursalItalia.agregarEmpleado(empleado2);
        sucursalItalia.agregarEspecialidad(equipo);
        sucursalItalia.agregarEspecialidad(espreso);
        System.out.println("Sucursal =" + sucursalItalia);
    }

}