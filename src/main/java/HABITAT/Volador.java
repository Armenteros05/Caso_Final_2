package HABITAT;

public class Volador extends Habitat{
    private double altura;

    public Volador(double temperatura, double humedad, String limpieza, double altura) {
        super("volador", temperatura, humedad, limpieza);
        this.altura = altura;
    }

    public String monitorearAltura() {
        return "Monitoreando altura del hábitat volador: " + altura + " metros";
    }
}
