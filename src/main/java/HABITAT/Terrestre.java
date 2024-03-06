package HABITAT;

public class Terrestre extends Habitat{
    private double area;

    public Terrestre(double temperatura, double humedad, String limpieza, double area) {
        super();
        this.area = area;
    }

    public String monitorearArea() {
        return "Monitoreando área del hábitat terrestre: " + area + " metros cuadrados";
    }
}
