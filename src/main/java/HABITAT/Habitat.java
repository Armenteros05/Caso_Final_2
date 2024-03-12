package HABITAT;

import ANIMALES.Animal;

public class Habitat {
    String tipo;
    double temperatura;
    double humedad;
    String limpieza;

    public Habitat() {
        this.tipo = tipo;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public String monitorearCondiciones() {
        return "Monitoreando condiciones del hábitat " + tipo + " con temperatura " + temperatura + "°C, humedad " + humedad + "% y limpieza " + limpieza;
    }


    public String getNombre() {
        return null;
    }

    public boolean monitorearTemperatura() {
        return false;
    }

    public String getTipo() {
        return null;
    }
}
