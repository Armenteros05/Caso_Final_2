package HABITAT;

public class Acuatico extends Habitat {

    private double profundidad;


    public Acuatico(double temperatura, double humedad, String limpieza, double profundidad) {
        super();
        this.profundidad = profundidad;
        this.tipo = "Acuático";
        this.temperatura = 60;
        this.humedad = 80;
        this.limpieza = "Limpio";
    }

    public String monitorearEstado() {
        return "Monitoreando condiciones del hábitat " + tipo + " con temperatura " + temperatura + "°C, humedad " + humedad + "%, limpieza " + limpieza + " y profundidad " + profundidad + "m.";

    }
}