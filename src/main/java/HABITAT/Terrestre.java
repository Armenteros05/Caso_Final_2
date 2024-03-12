package HABITAT;

public class Terrestre extends Habitat{
    private double area;

    public Terrestre(double temperatura, double humedad, String limpieza, double area) {
        super();
        this.area = area;
        this.tipo = "Terrestre";
        this.temperatura = 25;
        this.humedad = 40;
        this.limpieza = "Limpio";

    }

    public String monitorearArea() {
        return "Monitoreando área del hábitat terrestre: " + area + " metros cuadrados" + " con temperatura " + temperatura + "°C, humedad " + humedad + "% y limpieza " + limpieza;
    }
}
