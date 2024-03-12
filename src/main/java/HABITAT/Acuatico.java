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

    public Acuatico() {

    }

    public String monitorearEstado() {
        String crearHabitatAcuatico ; {
            Acuatico animal = new Acuatico("Tiburon", "Pez", "Saludable", 10);
            HABITAT.Acuatico habitat = new HABITAT.Acuatico(60, 80, "Limpio", 10);
            System.out.println(habitat.monitorearEstado());
            return "Monitoreando estado del hábitat acuático: " + monitorearCondiciones() + " y profundidad " + profundidad + " metros";
        }
    }
    }