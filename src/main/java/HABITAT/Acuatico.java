package HABITAT;

public class Acuatico extends Habitat {
    private double profundidad;

    public Acuatico(double temperatura, double humedad, String limpieza, double profundidad) {
        super("acuático", temperatura, humedad, limpieza);
        this.profundidad = profundidad;
    }

    public String monitorearProfundidad() {
        return "Monitoreando profundidad del hábitat acuático: " + profundidad + " metros";
    }
}