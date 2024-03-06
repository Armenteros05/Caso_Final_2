import VISITANTES.Visitante;

public class Main {
    public static void main(String[] args) {
        // Crear algunos hábitats
        HabitatAcuatico habitatAcuatico = new HabitatAcuatico("Exhibición de delfines");
        HabitatTerrestre habitatTerrestre = new HabitatTerrestre("Exhibición de leones");
        HabitatAviario habitatAviario = new HabitatAviario("Exhibición de águilas");

        // Crear algunos animales
        AnimalAcuatico delfin = new AnimalAcuatico("Delfín", "Saludable");
        AnimalTerrestre leon = new AnimalTerrestre("León", "Saludable");
        AnimalVolador aguila = new AnimalVolador("Águila", "Enferma");

        // Añadir los animales a los hábitats
        habitatAcuatico.añadirAnimal(delfin);
        habitatTerrestre.añadirAnimal(leon);
        habitatAviario.añadirAnimal(aguila);

        // Crear un sistema de monitoreo y registrar los hábitats
        SistemaMonitoreo sistemaMonitoreo = new SistemaMonitoreo();
        sistemaMonitoreo.registrarHabitat(habitatAcuatico);
        sistemaMonitoreo.registrarHabitat(habitatTerrestre);
        sistemaMonitoreo.registrarHabitat(habitatAviario);

        // Crear un sistema de guía virtual y registrar los hábitats y animales
        SistemaGuiaVirtual sistemaGuiaVirtual = new SistemaGuiaVirtual();
        sistemaGuiaVirtual.registrarHabitat(habitatAcuatico);
        sistemaGuiaVirtual.registrarHabitat(habitatTerrestre);
        sistemaGuiaVirtual.registrarHabitat(habitatAviario);
        sistemaGuiaVirtual.registrarAnimal(delfin);
        sistemaGuiaVirtual.registrarAnimal(leon);
        sistemaGuiaVirtual.registrarAnimal(aguila);

        // Crear un módulo de manejo de recursos y registrar los recursos necesarios
        ModuloManejoRecursos moduloManejoRecursos = new ModuloManejoRecursos();
        moduloManejoRecursos.registrarRecurso(new Recurso("Alimento para delfines", 100));
        moduloManejoRecursos.registrarRecurso(new Recurso("Alimento para leones", 100));
        moduloManejoRecursos.registrarRecurso(new Recurso("Alimento para águilas", 100));

        // Crear un sistema de mantenimiento y seguridad y registrar las instalaciones
        SistemaMantenimientoSeguridad sistemaMantenimientoSeguridad = new SistemaMantenimientoSeguridad();
        sistemaMantenimientoSeguridad.registrarInstalacion(habitatAcuatico);
        sistemaMantenimientoSeguridad.registrarInstalacion(habitatTerrestre);
        sistemaMantenimientoSeguridad.registrarInstalacion(habitatAviario);

        // Simular la interacción con un visitante
        Visitante visitante = new Visitante("Juan", "Amante de los mamíferos");
        sistemaGuiaVirtual.proporcionarTourPersonalizado(visitante);
    }

}