import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Producto> inventario;

    public Inventario() {
        inventario = new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.put(producto.getNombre(), producto);
    }

    public boolean verificarExistencia(String nombreProducto, int cantidad) {
        if (inventario.containsKey(nombreProducto)) {
            Producto producto = inventario.get(nombreProducto);
            return producto.getCantidadExistencia() >= cantidad;
        }
        return false;
    }

    public void mostrarInventario() {
        System.out.println("Inventario");
        for (Map.Entry<String, Producto> entry : inventario.entrySet()) {
            String productoNombre = entry.getKey();
            Producto producto = entry.getValue();
            System.out.println(productoNombre + " " + producto.getCantidadExistencia());
        }
    }
}
