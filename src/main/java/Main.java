import HABITAT.Acuatico;
import HABITAT.Terrestre;
import HABITAT.Volador;
import HABITAT.Habitat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Eres visitante o staff?");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("staff")) {
            boolean exit = false;
            while (!exit) {
                System.out.println("Menú de gestión del zoo:");
                System.out.println("1. Gestionar animales");
                System.out.println("2. Gestionar hábitats");
                System.out.println("3. Gestionar personal");
                System.out.println("4. Salir");

                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        // Aquí va el código para gestionar animales
                        System.out.println("Gestionando animales...");
                        System.out.println("Por favor, introduce el nombre del animal que quieres ver:");
                        String nombreAnimal = scanner.nextLine();
                        System.out.println("Por favor, introduce el tipo del animal que es el:" + nombreAnimal + " (Mamifero, Aves, etc.):");
                        String tipoAnimal = scanner.nextLine();
                        System.out.println("Por favor, introduce el estado del animal (Saludable, Enfermo, Hambriento):");
                        String estadoAnimal = scanner.nextLine();
                        if (estadoAnimal.equals("Enfermo")) {
                            System.out.println("El animal " + nombreAnimal + " está enfermo. Se le administrará medicina.");
                        } else if (estadoAnimal.equals("Hambriento")) {
                            System.out.println("El animal " + nombreAnimal + " está hambriento. Se le proporcionará comida.");
                        } else if (estadoAnimal.equals("Saludable")) {
                            System.out.println("El animal " + nombreAnimal + " está saludable.");
                        } else {
                            System.out.println("El estado del animal no es válido.");
                        }
                        break;
                    case "2":
                        // Aquí va el código para gestionar hábitats
                        System.out.println("Gestionando hábitats...");
                        System.out.println("Por favor, introduce el tipo de hábitat (Acuático, Terrestre, etc.):");
                        String tipoHabitat = scanner.nextLine();
                        if (tipoHabitat.equals("Acuático")) {
                            Acuatico animal = new Acuatico("Tiburon", "Pez", "Saludable", 10);
                            HABITAT.Acuatico habitat = new HABITAT.Acuatico(60, 80, "Limpio", 10);
                            System.out.println(habitat.monitorearCondiciones());

                        } else if (tipoHabitat.equals("Terrestre")) {
                            Terrestre animal = new Terrestre(25, 60, "Limpio", 10);
                            HABITAT.Terrestre habitat = new HABITAT.Terrestre(60, 80, "Limpio", 50);
                            System.out.println(habitat.monitorearArea());
                        } else if (tipoHabitat.equals("Aéreo")) {
                            Volador animal = new Volador(17, 50, "Limpio", 30);
                            HABITAT.Volador habitat = new HABITAT.Volador(60, 80, "Limpio", 10);
                        } else {
                            System.out.println("El tipo de hábitat no es válido.");
                        }
                        break;
                    case "3":
                        // Aquí va el código para gestionar personal
                        System.out.println("Gestionando personal...");
                        break;
                    case "4":
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                        break;
                }
            }
        } else if (userType.equalsIgnoreCase("visitante")) {














            // Aquí va el código para los visitantes
            System.out.println("Bienvenido al zoo!");
            System.out.println("Por favor, introduce el nombre del animal que quieres ver:");
            String nombreAnimal = scanner.nextLine();

            // Solicitar el tipo del animal
            System.out.println("Por favor, introduce el tipo del animal que es el:" + nombreAnimal + " (Mamifero, Aves, etc.):");
            String tipoAnimal = scanner.nextLine();

            // Solicitar el estado del animal
            System.out.println("Por favor, introduce el estado del animal (Saludable, Enfermo, Hambriento):");
            String estadoAnimal = scanner.nextLine();
            if (estadoAnimal.equals("Enfermo")) {
                System.out.println("El animal " + nombreAnimal + " está enfermo. Se le administrará medicina.");
            } else if (estadoAnimal.equals("Hambriento")) {
                System.out.println("El animal " + nombreAnimal + " está hambriento. Se le proporcionará comida.");
            } else if (estadoAnimal.equals("Saludable")) {
                System.out.println("El animal " + nombreAnimal + " está saludable.");
            } else {
                System.out.println("El estado del animal no es válido.");
            }

            // Solicitar el tipo de hábitat
            System.out.println("Por favor, introduce el tipo de hábitat (Acuático, Terrestre, etc.):");
            String tipoHabitat = scanner.nextLine();

            if (tipoHabitat.equals("Acuático")) {
                Acuatico animal = new Acuatico(nombreAnimal, tipoAnimal, estadoAnimal, 10);
                HABITAT.Acuatico habitat = new HABITAT.Acuatico(60, 80, "Limpio", 10);
                System.out.println(habitat.monitorearCondiciones());

            } else if (tipoHabitat.equals("Terrestre")) {
                Terrestre animal = new Terrestre(25, 60, "Limpio", 10);
                HABITAT.Terrestre habitat = new HABITAT.Terrestre(60, 80, "Limpio", 50);
                System.out.println(habitat.monitorearArea());

            } else if (tipoHabitat.equals("Aéreo")) {
                Volador animal = new Volador(17, 50, "Limpio", 30);
                HABITAT.Volador habitat = new HABITAT.Volador(60, 80, "Limpio", 10);
            } else {
                System.out.println("El tipo de hábitat no es válido.");

            }


            // Cerrar el scanner
            scanner.close();
        } else ;
        System.out.println("Tipo de usuario no válido.");
    }

}