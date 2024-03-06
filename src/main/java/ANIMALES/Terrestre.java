package ANIMALES;

public class Terrestre extends Animal{
    private double area;

    public Terrestre(String nombre, String tipo, String estado, double area) {
        super(nombre, tipo, estado, "terrestre");
        this.area = area;
    }

    public String monitorearArea() {
        return "Monitoreando área del hábitat terrestre: " + area + " metros cuadrados";
    }
}
