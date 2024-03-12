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
        String registro = "Registro de tour de vigilancia:\n";
        for (int i = 0; i < registroLugares.size(); i++) {
            registro += registroLugares.get(i) + " - " + registroHoras.get(i) + "\n";
        }
        return registro;
    }
    public String obtenerDuracionTour() {
        Duration duracion = Duration.between(inicioTour, LocalDateTime.now());
        return "Duración del tour del visitante seleccionado: " + duracion.toMinutes() + " minutos";
    }
}