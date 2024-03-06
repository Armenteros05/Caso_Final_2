package ANIMALES;

public class Animal {
    private String nombre;
    private String tipo;
    private String estado;
    private String habitat;

public Animal(String nombre, String tipo, String estado, String habitat) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.habitat = habitat;
    }

    public Animal(String nombre, String acuático, String estado) {
    }
    public String monitorearEstado() {
        return "Monitoreando estado del animal: " + estado;
    }
}
