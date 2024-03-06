package Mantenimiento_Seguridad;

import ANIMALES.Animal;

import java.util.Map;
import java.util.HashMap;

public class Seguimiento {
    private Recursos recursos;
    private Map<Animal, String> registroRevisiones;

    public Seguimiento() {
        this.recursos = recursos;
        this.registroRevisiones = new HashMap<>();
    }

    public Seguimiento(String time, String pendiente) {
    }

    public void revisarAnimal(Animal animal) {
        String estado = animal.getEstado();
        if (estado.equals("Enfermo")) {
            if (recursos.obtenerCantidad("Medicina") > 0) {
                recursos.eliminarInventario("Medicina", 1);
                animal.setEstado("Saludable");
                registroRevisiones.put(animal, "Medicina administrada");
            }
        } else if (estado.equals("Hambriento")) {
            if (recursos.obtenerCantidad("Comida") > 0) {
                recursos.eliminarInventario("Comida", 1);
                animal.setEstado("Satisfecho");
                registroRevisiones.put(animal, "Comida proporcionada");
            }
        }
    }

    public String obtenerRegistroRevisiones() {
        StringBuilder registro = new StringBuilder("Registro de revisiones:\n");
        for (Map.Entry<Animal, String> entry : registroRevisiones.entrySet()) {
            registro.append("- ").append(entry.getKey().getNombre()).append(": ").append(entry.getValue()).append("\n");
        }
        return registro.toString();
    }

    public boolean rastrearMantenimiento() {
        return false;
    }
}