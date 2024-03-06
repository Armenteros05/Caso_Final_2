package Mantenimiento_Seguridad;

import java.util.Map;

public class Recursos {
    private Map<String, Integer> inventario;

    public Recursos(Map<String, Integer> inventario) {
        this.inventario = inventario;
    }

    public void añadirInventario(String item, int cantidad) {
        inventario.put(item, inventario.getOrDefault(item, 0) + cantidad);
    }

    public void eliminarInventario(String item, int cantidad) {
        if (inventario.containsKey(item)) {
            int nuevaCantidad = inventario.get(item) - cantidad;
            if (nuevaCantidad <= 0) {
                inventario.remove(item);
            } else {
                inventario.put(item, nuevaCantidad);
            }
        }
    }

    public int obtenerCantidad(String item) {
        return inventario.getOrDefault(item, 0);
    }

    public String obtenerEstadoInventario() {
        StringBuilder estado = new StringBuilder("Estado del inventario:\n");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            estado.append("- ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return estado.toString();
    }
}