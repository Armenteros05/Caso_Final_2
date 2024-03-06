import ANIMALES.Animal;
import HABITAT.Habitat;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public static void main(String[] args) {
    // Crear algunos hábitats y animales
    Habitat habitat1 = new Habitat("Exhibición de leones");
    Animal leon = new Animal("León", "Saludable");
    habitat1.añadirAnimal(leon);

    Habitat habitat2 = new Habitat("Exhibición de tigres");
    Animal tigre = new Animal("Tigre", "Enfermo");
    habitat2.añadirAnimal(tigre);

    // Crear algunos hábitats y animales adicionales
    Habitat habitatAcuatico = new Habitat("Exhibición de delfines");
    Animal delfin = new Animal("Delfín", "Saludable");
    habitatAcuatico.añadirAnimal(delfin);

    Habitat habitatVolador = new Habitat("Exhibición de águilas");
    Animal aguila = new Animal("Águila", "Enferma");
    habitatVolador.añadirAnimal(aguila);

    // Añadir las nuevas opciones a tu menú
    System.out.println("1. Exhibición de leones");
    System.out.println("2. Exhibición de tigres");
    System.out.println("3. Exhibición de delfines");
    System.out.println("4. Exhibición de águilas");

    // Añadir las nuevas opciones a tu switch
    switch (opcion) {
        case "1":
            vigilancia.registrarLugar(habitat1.getNombre());
            seguimiento.revisarAnimal(leon);
            break;
        case "2":
            vigilancia.registrarLugar(habitat2.getNombre());
            seguimiento.revisarAnimal(tigre);
            break;
        case "3":
            vigilancia.registrarLugar(habitatAcuatico.getNombre());
            seguimiento.revisarAnimal(delfin);
            break;
        case "4":
            vigilancia.registrarLugar(habitatVolador.getNombre());
            seguimiento.revisarAnimal(aguila);
            break;
    }

    // Para imprimir el estado de los animales, puedes hacer algo como esto:
    System.out.println("Estado del león: " + leon.obtenerEstado());
    System.out.println("Estado del tigre: " + tigre.obtenerEstado());
    System.out.println("Estado del delfín: " + delfin.obtenerEstado());
    System.out.println("Estado del águila: " + aguila.obtenerEstado());
}