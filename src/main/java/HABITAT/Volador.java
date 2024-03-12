package HABITAT;

public class Volador extends Habitat {
    private double altura;

    public Volador(double temperatura, double humedad, String limpieza, double altura) {
        super();
        this.altura = altura;
        this.tipo = "Aéreo";
        this.temperatura = 12;
        this.limpieza = "Limpio";
        this.humedad = 30;
    }

    public String monitorearAltura() {
        return "Monitoreando altura del hábitat volador: " + altura + " metros" + " con temperatura " + temperatura + "°C, humedad " + humedad + "% y limpieza " + limpieza;
    }
}
