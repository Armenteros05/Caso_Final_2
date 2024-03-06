package VISITANTES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visitante {
    private String nombre;
    private String tipo; // Niño, Adulto, Anciano
    private List<String> preferenciasAnimales;
    private Map<String, Boolean> haVisitado;

    public Visitante() {
        this.nombre = nombre;
        this.tipo = tipo;
        this.preferenciasAnimales = new ArrayList<>(); // Inicializamos la lista aquí
        this.haVisitado = new HashMap<>();
        for (String animal : preferenciasAnimales) {
            haVisitado.put(animal, false);
        }
    }

    public void visitar(String animal) {
        if (haVisitado.containsKey(animal)) {
            haVisitado.put(animal, true);
        }
    }

    public String obtenerTourPersonalizado() {
        StringBuilder tour = new StringBuilder("Tour personalizado para " + nombre + " (" + tipo + "):\n");
        for (String animal : preferenciasAnimales) {
            tour.append("- Visita al ").append(animal);
            if (haVisitado.get(animal)) {
                tour.append(" (Visitado)");
            }
            tour.append("\n");
        }
        return tour.toString();
    }
}