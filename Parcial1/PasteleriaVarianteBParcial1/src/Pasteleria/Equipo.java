package Pasteleria;

public class Equipo {
    private String Tipo;
    private String Estado;

    public Equipo(String Tipo, String Estado) {
        this.Tipo = Tipo;
        this.Estado = Estado;
    }

    public void encender(){
        System.out.println("Encendiendo Equipo");
        Estado = "Encendido";
    }

    public void apagar(){
        System.out.println("Apagando Equipo");
        Estado= "Apagado";
    }

    public void reparar(){
        System.out.println("Reparando Equipo");
        Estado = "Reparado";
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "Tipo='" + Tipo + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }
}
