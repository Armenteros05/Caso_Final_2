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

    public Animal(String leon, String enfermo) {
    }

    public String monitorearEstado() {
        return "Monitoreando estado del animal: " + estado;
    }

    public String getEstado() {
        return null;
    }

    public Object getTipo() {
        return null;
    }

    public Animal getHabitat() {
        return null;
    }

    public void setEstado(String saludable) {
    }

    public char[] getNombre() {
        return new char[0];
    }
}
