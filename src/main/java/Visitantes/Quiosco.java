package Visitantes;

import ANIMALES.Animal;

import java.util.Map;

public class Quiosco {
    private Map<String, Animal> animales;

    public Quiosco(Map<String, Animal> animales) {
        this.animales = animales;
    }

    public String preguntarAnimal(String nombreAnimal) {
        if (animales.containsKey(nombreAnimal)) {
            Animal animal = animales.get(nombreAnimal);
            return "El " + nombreAnimal + " es un " + animal.getTipo() +
                    " y se encuentra en el hábitat " + animal.getHabitat().getTipo() + ".";
        } else {
            return "Lo siento, no tenemos información sobre el " + nombreAnimal + ".";
        }
    }

    public String preguntarEstadoAnimal(String nombreAnimal) {
        if (animales.containsKey(nombreAnimal)) {
            Animal animal = animales.get(nombreAnimal);
            return "El " + nombreAnimal + " está " + animal.getEstado() + ".";
        } else {
            return "Lo siento, no tenemos información sobre el " + nombreAnimal + ".";
        }
    }

    public String buscarPorTipo(String tipo) {
        StringBuilder resultado = new StringBuilder("Animales del tipo " + tipo + ":\n");
        for (Map.Entry<String, Animal> entry : animales.entrySet()) {
            if (entry.getValue().getTipo().equals(tipo)) {
                resultado.append("- ").append(entry.getKey()).append("\n");
            }
        }
        return resultado.toString();
    }
}