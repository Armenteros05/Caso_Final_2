package ANIMALES;

public class Volador extends Animal{
    private double altura;

    public Volador(String nombre, String tipo, String estado, double altura) {
        super(nombre, tipo, estado, "volador");
        this.altura = altura;
    }

    public String monitorearAltura() {
        return "Monitoreando altura del hábitat volador: " + altura + " metros";
    }
}
