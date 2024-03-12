import HABITAT.Acuatico;
import HABITAT.Terrestre;
import HABITAT.Volador;
import HABITAT.Habitat;
import Mantenimiento_Seguridad.Vigilancia;
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
                System.out.println("4. Ver las cámaras y acceder a los registros de vigilancia");
                System.out.println("5. Salir");

                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        // Aquí va el código para gestionar animales
                        System.out.println("Gestionando animales...");
                        System.out.println("Por favor, introduce el nombre del animal de tu consulta:");
                        String nombreAnimal = scanner.nextLine();
                        System.out.println("Por favor, introduce el tipo del animal que es el:" + nombreAnimal + " (Mamifero, Aves, etc.):");
                        String tipoAnimal = scanner.nextLine();
                        System.out.println("Por favor, introduce el estado del animal (Saludable, Enfermo, Hambriento):");
                        String estadoAnimal = scanner.nextLine();
                        if (estadoAnimal.equals("Enfermo")) {
                            System.out.println("El " + nombreAnimal + " está enfermo. Se le administrará medicina.");
                            System.out.println("--------------------------------------------------------");
                        } else if (estadoAnimal.equals("Hambriento")) {
                            System.out.println("El " + nombreAnimal + " está hambriento. Se le proporcionará comida.");
                            System.out.println("--------------------------------------------------------");
                        } else if (estadoAnimal.equals("Saludable")) {
                            System.out.println("El " + nombreAnimal + " está saludable.");
                            System.out.println("--------------------------------------------------------");
                        } else {
                            System.out.println("El estado del animal no es válido.");
                            System.out.println("--------------------------------------------------------");
                        }
                        break;
                    case "2":
                        // Aquí va el código para gestionar hábitats
                        System.out.println("Gestionando hábitats...");
                        System.out.println("Por favor, introduce el tipo de hábitat (Acuático, Terrestre, Volador.):");
                        String tipoHabitat = scanner.nextLine();
                        if (tipoHabitat.equals("Acuático")) {
                            Acuatico animal = new Acuatico(60, 80, "Limpio", 10);
                            HABITAT.Acuatico habitat = new HABITAT.Acuatico(60, 80, "Limpio", 10);
                            System.out.println(habitat.monitorearCondiciones());
                            System.out.println("--------------------------------------------------------");
                        } else if (tipoHabitat.equals("Terrestre")) {
                            Terrestre animal = new Terrestre(25, 60, "Limpio", 10);
                            HABITAT.Terrestre habitat = new HABITAT.Terrestre(60, 80, "Limpio", 50);
                            System.out.println(habitat.monitorearArea());
                            System.out.println("--------------------------------------------------------");
                        } else if (tipoHabitat.equals("Volador")) {
                            Volador animal = new Volador(17, 50, "Limpio", 30);
                            HABITAT.Volador habitat = new HABITAT.Volador(60, 80, "Limpio", 10);
                            System.out.println(habitat.monitorearAltura());
                            System.out.println("--------------------------------------------------------");
                        } else {
                            System.out.println("El tipo de hábitat no es válido.");
                        }
                        break;
                    case "3":
                        // Aquí va el código para gestionar personal
                        System.out.println("Gestionando personal...");
                        System.out.println("Por favor, introduce el nombre del empleado:");
                        String nombreEmpleado = scanner.nextLine();
                        System.out.println("Por favor, introduce el tipo de empleado (Veterinario, Cuidador, etc.):");
                        String tipoEmpleado = scanner.nextLine();
                        System.out.println("Por favor, introduce el estado del empleado (Disponible, Ocupado, etc.):");
                        String estadoEmpleado = scanner.nextLine();
                        if (estadoEmpleado.equals("Disponible")) {
                            System.out.println("El empleado " + nombreEmpleado + " está disponible.");
                            System.out.println("--------------------------------------------------------");
                        } else if (estadoEmpleado.equals("Ocupado")) {
                            System.out.println("El empleado " + nombreEmpleado + " está ocupado.");
                            System.out.println("--------------------------------------------------------");
                        } else {
                            System.out.println("El estado del empleado no es válido.");
                            System.out.println("--------------------------------------------------------");
                        }
                        break;
                    case "4":
                        System.out.println("Viendo las cámaras...");
                        Vigilancia vigilancia = new Vigilancia();
                        vigilancia.registrarLugar("Entrada");
                        vigilancia.registrarLugar("Hábitat Terrestre");
                        System.out.println("¿Que habitat quieres ver? (Acuático, Terrestre, Volador)");
                        String habitat = scanner.nextLine();
                        if (habitat.equals("Acuático")) {
                            System.out.println("                                     _\n" +
                                    "                               _.-~~.)\n" +
                                    "         _.--~~~~~---....__  .' . .,'\n" +
                                    "       ,'. . . . . . . . . .~- ._ (\n" +
                                    "      ( .. .g. . . . . . . . . . .~-._\n" +
                                    "   .~__.-~    ~`. . . . . . . . . . . -.\n" +
                                    "   `----..._      ~-=~~-. . . . . . . . ~-.\n" +
                                    "             ~-._   `-._ ~=_~~--. . . . . .~.\n" +
                                    "              | .~-.._  ~--._-.    ~-. . . . ~-.\n" +
                                    "               \\ .(   ~~--.._~'       `. . . . .~-.                ,\n" +
                                    "                `._\\         ~~--.._    `. . . . . ~-.    .- .   ,'/\n" +
                                    "_  . _ . -~\\        _ ..  _          ~~--.`_. . . . . ~-_     ,-','`  .\n" +
                                    "             ` ._           ~                ~--. . . . .~=.-'. /. `\n" +
                                    "       - . -~            -. _ . - ~ - _   - ~     ~--..__~ _,. /   \\  - ~\n" +
                                    "              . __ ..                   ~-               ~~_. (  `\n" +
                                    ")`. _ _               `-       ..  - .    . - ~ ~ .    \\    ~-` ` `  `. _\n" +
                                    "      _  _");
                        } else if (habitat.equals("Terrestre")) {
                            System.out.println("⠀⠀⠀⠀⠀⢀⣾⠿⢷⣤⣄⣀⣀⡀⢀⣀⣠⣤⣤⣴⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣤⣤⣄⣀⡀⠀⣀⣀⣠⣤⡾⠿⣷⡀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⣸⡏⣿⣦⡈⠉⠛⠻⢿⣿⡿⠛⢉⣡⣴⣶⣿⡿⠟⠁⠈⠻⢿⣿⣷⣦⣌⡉⠛⢿⣿⡿⠟⠛⠉⠁⣠⣶⠸⣧⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⣿⠀⣿⣿⣿⣦⡀⠀⢈⠏⠀⣴⣿⠟⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⣿⣧⠀⠹⡅⠀⠀⣴⣿⣿⣿⠀⣿⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⣿⠀⢿⣿⣿⣿⣷⠀⠀⠀⣠⣿⠃⠀⠀⠀⠀⠀⢀⣠⣄⠀⠀⠀⠀⠀⠀⠘⢿⣄⠀⠈⠀⣼⣿⣿⣿⣿⠀⢿⡀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⣿⠀⢸⣿⣿⣿⡿⢁⣴⡾⠛⢁⣠⣤⣶⣶⣶⣿⠿⠋⠙⠿⣿⣶⣶⣶⣤⣄⠈⠛⢷⣦⣸⣿⣿⣿⣿⣿⠄⣿⡇⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⢿⣷⣄⠹⡿⠋⠀⣸⡿⠃⣰⠿⠋⠉⠉⠉⠀⢀⡤⠀⠀⢤⡀⠀⠉⠉⠉⠙⠿⣆⠐⢿⣏⠈⠻⣿⡿⣃⣾⡿⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠈⣿⣿⣻⠁⢠⠾⠋⠀⠊⠁⠀⢀⣤⣤⣤⣴⣿⠀⠀⠀⠀⣿⣦⣤⣤⣤⡀⠀⠈⠑⠀⠙⠳⡄⠉⢹⣿⣿⡁⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⢠⣾⣿⣿⠁⠀⠁⠀⠀⠀⠀⠒⠚⠛⠋⠁⠀⠀⠈⢀⡀⠀⡀⠁⠀⠀⠈⠙⠛⠓⠒⠀⠀⠀⠀⠈⠀⠈⢿⣿⣿⡆⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⣸⣿⣿⠇⠀⠀⠀⠀⠀⢀⣴⠞⠀⢀⣀⣠⣤⡶⠟⠉⠀⠀⠉⠻⢶⣤⣄⣀⡀⠀⠱⣦⡀⠀⠀⠀⠀⠀⠸⣿⣿⣇⠀⠀⠀⠀\n" +
                                    "⠀⠀⢀⣾⣿⠟⠁⠀⠀⣠⡖⢀⣴⡿⠋⠀⢠⡟⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⢿⡄⠀⠘⢿⣶⡄⢲⣄⠀⠀⠈⠻⣿⣷⡀⠀⠀\n" +
                                    "⠀⢠⣿⣿⠋⠀⠀⣠⣾⡟⢠⣿⠏⠀⠀⠀⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⠀⠀⠀⠙⣿⡄⢻⣷⣄⠀⠀⠘⣿⣿⡄⠀\n" +
                                    "⢠⣿⣿⠁⠀⠀⢰⣿⣿⡇⢸⡟⠐⢿⣿⣷⣶⣦⣤⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⣤⣴⣶⣾⣿⡿⠂⢹⡇⢸⣿⣯⠀⠀⠀⠈⢿⣿⡄\n" +
                                    "⣼⣿⡇⠀⠀⠀⢸⣿⣿⣧⠀⠃⠀⠀⠸⣧⡘⠋⣹⣿⣧⡀⠀⠀⠀⠀⠀⠀⢀⣾⣿⡏⠙⢃⣾⠇⠀⠀⠘⠀⣼⣿⣿⣇⠀⠀⠀⠸⣿⣷\n" +
                                    "⣿⣿⢠⠄⠀⠀⢸⣿⣿⣿⡷⠀⠀⠀⠀⠉⠛⠛⠛⢿⣿⣷⠀⠀⠀⠀⠀⠀⣾⣿⡿⠛⠛⠛⠉⠀⠀⠀⠀⢸⣿⣿⣿⡏⠀⠀⠀⡄⣿⣿\n" +
                                    "⣿⣿⣿⡄⠀⠀⠈⠿⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⢀⣾⠿⠋⠀⠀⠀⠀⠀⠀⠙⢿⣿⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⡿⠃⠀⠀⠀⣿⣿⣿\n" +
                                    "⢸⣿⣿⡇⣤⠀⠀⠀⢻⣿⣿⣆⠀⠀⠀⠀⠀⠀⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⠀⠀⠀⠀⠀⠁⣠⣿⣿⡟⠀⠀⠀⣀⢸⣿⣿⡇\n" +
                                    "⠀⠋⢸⣿⣿⡆⠀⠀⠀⢻⣿⣿⡆⠀⠀⠀⠀⣸⡟⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣆⢻⣇⠀⠀⠀⠀⢠⣿⣿⡟⠀⠀⠀⢠⣿⣾⣧⠘⠀\n" +
                                    "⠀⠀⢸⣿⣿⣿⡀⣤⠀⠀⠹⣿⣿⢠⡄⠀⠀⡿⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢿⠀⠀⢠⣆⣾⣿⠏⠀⠀⣠⠀⣾⣿⣿⡏⠀⠀\n" +
                                    "⠀⠀⠀⢻⣿⣿⣷⣿⣷⣄⠀⠉⣿⣿⣷⣄⠀⠁⢰⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣆⠈⠀⣠⣾⣿⣿⠋⠀⣠⣾⣿⣾⣿⢿⡟⠁⠀⠀\n" +
                                    "⠀⠀⠀⠀⠙⠘⢿⣿⣿⣿⣷⣄⡈⠉⠙⣿⣿⡆⢻⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡟⢸⣿⣿⠋⠉⢁⣠⣾⣿⣿⣿⡿⠃⠈⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⠀⠙⠛⠎⢿⣿⣿⣶⣶⣿⡛⢧⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠃⡼⠛⣿⣶⣶⣿⣿⡿⠁⠛⠋⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠿⣿⣧⢤⣤⣈⠙⢿⣶⣶⣦⣤⣶⣶⡿⠛⣁⣠⡤⣼⣿⡿⠍⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠐⢻⣿⡖⠶⠤⠄⠀⠀⠉⢻⡟⠉⠀⠀⠠⠤⢶⢲⣿⡟⠒⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠊⢹⣿⣝⣓⡂⠀⣀⣀⣨⣇⣀⣀⡀⢐⣚⣫⣿⡟⠉⠒⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⡛⠋⠉⠛⠛⠉⠙⢛⣻⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠻⠿⣶⣦⣤⣶⠾⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        } else if (habitat.equals("Volador")) {
                            System.out.println("" +
                                    "\n" +
                                    "                                    /T /I                     \n" +
                                    "                                   / |/ | .-~/                \n" +
                                    "                               T\\ Y  I  |/  /  _              \n" +
                                    "              /T               | \\I  |  I  Y.-~/              \n" +
                                    "             I l   /I       T\\ |  |  l  |  T  /               \n" +
                                    "          T\\ |  \\ Y l  /T   | \\I  l   \\ `  l Y                \n" +
                                    "      __  | \\l   \\l  \\I l __l  l   \\   `  _. |                \n" +
                                    "      \\ ~-l  `\\   `\\  \\  \\\\ ~\\  \\   `. .-~   |                \n" +
                                    "       \\   ~-. \"-.  `  \\  ^._ ^. \"-.  /  \\   |                \n" +
                                    "     .--~-._  ~-  `  _  ~-_.-\"-.\" ._ /._ .\" ./                \n" +
                                    "      >--.  ~-.   ._  ~>-\"    \"\\\\   7   7   ]                 \n" +
                                    "     ^.___~\"--._    ~-{  .-~ .  `\\ Y . /    |                 \n" +
                                    "      <__ ~\"-.  ~       /_/   \\   \\I  Y   : |                 \n" +
                                    "        ^-.__           ~(_/   \\   >._:   | l______           \n" +
                                    "            ^--.,___.-~\"  /_/   !  `-.~\"--l_ /     ~\"-.       \n" +
                                    "                   (_/ .  ~(   /'     \"~\"--,Y   -=b-. _)      \n" +
                                    "                    (_/ .  \\  :           / l      c\"~o \\     \n" +
                                    "                     \\ /    `.    .     .^   \\_.-~\"~--.  )    \n" +
                                    "                      (_/ .   `  /     /       !       )/     \n" +
                                    "                       / / _.   '.   .':      /        '      \n" +
                                    "                       ~(_/ .   /    _  `  .-<_               \n" +
                                    "                         /_/ . ' .-~\" `.  / \\  \\          ,z=.\n" +
                                    "                         ~( /   '  :   | K   \"-.~-.______//   \n" +
                                    "                           \"-,.    l   I/ \\_    __{--->._(==. \n" +
                                    "                            //(     \\  <    ~\"~\"     //       \n" +
                                    "                           /' /\\     \\  \\     ,v=.  ((        \n" +
                                    "                         .^. / /\\     \"  }__ //===-  `        \n" +
                                    "                        / / ' '  \"-.,__ {---(==-              \n" +
                                    "                      .^ '       :  T  ~\"   ll     -Row       \n" +
                                    "                     / .  .  . : | :!        \\\\               \n" +
                                    "                    (_/  /   | | j-\"          ~^              \n" +
                                    "                      ~-<_(_.^-~\"                             \n" +
                                    "\n" +
                                    "\n");
                        } else {
                            System.out.println("El tipo de hábitat no es válido.");
                        }
                        vigilancia.registrarLugar("Hábitat Acuático");
                        vigilancia.registrarLugar("Hábitat Volador");
                        System.out.println(vigilancia.obtenerRegistroTour());
                        System.out.println(vigilancia.obtenerDuracionTour());

                        System.out.println("--------------------------------------------------------");
                        break;
                    case "5":
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                        System.out.println("--------------------------------------------------------");
                        break;
                }
            }
        } else if (userType.equalsIgnoreCase("visitante")) {

           //-----------------------------------------------------------------------------------------
           //-----------------------------------------------------------------------------------------
           //-----------------------------------------------------------------------------------------//-----------------------------------------------------------------------------------------

            // Aquí va el código para los visitantes
            System.out.println("Bienvenido al zoo!");
            System.out.println("Por favor, introduce el nombre del animal que quieres ver:");
            String nombreAnimal = scanner.nextLine();

            // Solicitar el tipo del animal
            System.out.println("Por favor, introduce el tipo del animal que es el:" + nombreAnimal + " (Mamifero, Aves, etc.):");
            String tipoAnimal = scanner.nextLine();

            // Solicitar el tipo de hábitat
            System.out.println("Por favor, introduce el tipo de hábitat en el que vive (Acuático, Terrestre, Volador.):");
            String tipoHabitat = scanner.nextLine();

            if (tipoHabitat.equals("Acuático")) {
                System.out.println("El " + nombreAnimal + " vive en un hábitat acuático, en el que se encuentra a una temperatura de 60°C, con un 80% de humedad y limpieza óptima, ¡Mira como chapotea!");
            } else if (tipoHabitat.equals("Terrestre")) {
                System.out.println("El " + nombreAnimal + " vive en un hábitat terrestre, en el que se encuentra a una temperatura de 25°C, con un 60% de humedad y limpieza óptima, ¡Mira como corre!");
            } else if (tipoHabitat.equals("Volador")) {
                System.out.println("El " + nombreAnimal + " vive en un hábitat volador, en el que se encuentra a una temperatura de 17°C, con un 50% de humedad y limpieza óptima, ¡Mira como vuela!");
            } else
                System.out.println("El tipo de hábitat no es válido.");
            System.out.println("--------------------------------------------------------");
            System.out.println("Gracias por visitar el zoo, ¡hasta la próxima!");

            // Cerrar el scanner
            scanner.close();
        } else
        System.out.println("Tipo de usuario no válido.");
    }
}