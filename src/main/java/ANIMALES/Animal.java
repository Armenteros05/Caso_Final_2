package ANIMALES;

import HABITAT.Habitat;

public class Animal {
    private String nombre;
    private String estado;
    private String comportamiento;
    private String tipo;
    private Habitat habitat;

    public Animal(String nombre, String estado, String comportamiento, String tipo, Habitat habitat) {
        this.nombre = nombre;
        this.estado = estado;
        this.comportamiento = comportamiento;
        this.tipo = tipo;
        this.habitat = habitat;
    }

    public Animal(String nombre, String tipo, String estado, String acuático) {
    }

    // Getters y setters para cada campo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
}