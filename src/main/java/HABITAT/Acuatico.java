package HABITAT;
public class Acuatico extends Habitat {
    private double profundidad;
    public Acuatico(double temperatura, double humedad, String limpieza, double profundidad) {
        super();
        this.profundidad = profundidad;
    }

    public Acuatico(String nombreAnimal, String tipoAnimal, String estadoAnimal, int profundidad) {
        super();
    }

    public String monitorearEstado() {
        return "Monitoreando estado del hábitat acuático: " + monitorearCondiciones() + " y profundidad " + profundidad + " metros";
    }

}