import HABITAT.Habitat;
import Mantenimiento_Seguridad.Recursos;
import Mantenimiento_Seguridad.Seguimiento;
import Mantenimiento_Seguridad.Vigilancia;
import VISITANTES.Visitante;
import ANIMALES.Animal;
import java.util.HashMap;
import java.util.Scanner;
import VISITANTES.Quiosco;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un nuevo inventario y añadir algunos recursos
        Recursos recursos = new Recursos(new HashMap<>());
        recursos.añadirInventario("Medicina", 10);
        recursos.añadirInventario("Comida", 20);

        // Crear un nuevo seguimiento
        Seguimiento seguimiento = new Seguimiento(recursos);

        // Crear una nueva vigilancia
        Vigilancia vigilancia = new Vigilancia();

        // Crear un nuevo quiosco de información
        Quiosco quiosco = new Quiosco();

        // Crear un nuevo visitante
        Visitante visitante = new Visitante();

        // Crear algunos hábitats y animales
        Habitat habitat1 = new Habitat("Exhibición de leones");
        Animal leon = new Animal("Leon", "Enfermo");
        habitat1.añadirAnimal(leon);

        Habitat habitat2 = new Habitat("Exhibición de tigres");
        Animal tigre = new Animal("Tigre", "Hambriento");
        habitat2.añadirAnimal(tigre);

        // Preguntar al usuario qué quiere hacer
        System.out.println("Bienvenido al zoo! ¿Qué te gustaría hacer hoy?");
        System.out.println("1. Visitar un hábitat");
        System.out.println("2. Obtener información sobre un animal en el quiosco de información");
        System.out.println("3. Salir del zoo");

        String eleccion = scanner.nextLine();
        switch (eleccion) {
            case "1":
                System.out.println("¿Qué hábitat te gustaría visitar?");
                System.out.println("1. Exhibición de leones");
                System.out.println("2. Exhibición de tigres");
                String eleccionHabitat = scanner.nextLine();
                switch (eleccionHabitat) {
                    case "1":
                        vigilancia.registrarLugar(habitat1.getNombre());
                        seguimiento.revisarAnimal(leon);
                        break;
                    case "2":
                        vigilancia.registrarLugar(habitat2.getNombre());
                        seguimiento.revisarAnimal(tigre);
                        break;
                }
                break;
            case "2":
                System.out.println("¿Sobre qué animal te gustaría obtener información?");
                System.out.println("1. Leon");
                System.out.println("2. Tigre");
                String eleccionAnimal = scanner.nextLine();
                switch (eleccionAnimal) {
                    case "1":
                        quiosco.proporcionarInformacion(leon);
                        break;
                    case "2":
                        quiosco.proporcionarInformacion(tigre);
                        break;
                }
                break;
            case "3":
                vigilancia.registrarLugar("Salida");
                break;
        }

        // Imprimir los registros
        System.out.println(recursos.obtenerEstadoInventario());
        System.out.println(seguimiento.obtenerRegistroRevisiones());
        System.out.println(vigilancia.obtenerRegistroTour());
        System.out.println(vigilancia.obtenerDuracionTour());

        scanner.close();
    }
}