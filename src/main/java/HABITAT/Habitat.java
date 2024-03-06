package HABITAT;

public class Habitat {
    private String tipo;
    private double temperatura;
    private double humedad;
    private String limpieza;

    public Habitat(String tipo, double temperatura, double humedad, String limpieza) {
        this.tipo = tipo;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public String monitorearCondiciones() {
        return "Monitoreando condiciones del hábitat " + tipo + " con temperatura " + temperatura + "°C, humedad " + humedad + "% y limpieza " + limpieza;
    }
}
