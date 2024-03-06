package ANIMALES;

public class Acuatico extends Animal{
    private double profundidad;

    public Acuatico(String nombre, String tipo, String estado, double profundidad) {
        super(nombre, tipo, estado, "acuático");
        this.profundidad = profundidad;
    }

    public String monitorearProfundidad() {
        return "Monitoreando profundidad del hábitat acuático: " + profundidad + " metros";
    }
}