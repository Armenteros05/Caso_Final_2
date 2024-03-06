package Mantenimiento_Seguridad;

import HABITAT.Habitat;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.Duration;

public class Vigilancia {
    private List<String> registroLugares;
    private List<LocalDateTime> registroHoras;
    private LocalDateTime inicioTour;

    public Vigilancia() {
        this.registroLugares = new ArrayList<>();
        this.registroHoras = new ArrayList<>();
        this.inicioTour = LocalDateTime.now();
    }

    public void registrarLugar(String lugar) {
        registroLugares.add(lugar);
        registroHoras.add(LocalDateTime.now());
    }

    public String obtenerRegistroTour() {
        StringBuilder registro = new StringBuilder("Registro del tour:\n");
        for (int i = 0; i < registroLugares.size(); i++) {
            registro.append("- ").append(registroLugares.get(i)).append(" (").append(registroHoras.get(i)).append(")\n");
        }
        return registro.toString();
    }

    public String obtenerDuracionTour() {
        Duration duracion = Duration.between(inicioTour, LocalDateTime.now());
        return "Duración del tour: " + duracion.toMinutes() + " minutos";
    }

    public boolean monitorearZoo() {
        return false;
    }

    public void registrarHabitat(Habitat habitat) {
    }
}