public class Orden {
    private int numOrden;
    private Cliente cliente;
    private Producto producto;
    private int cantidadCompra;

    public Orden(int numOrden, Cliente cliente, Producto producto, int cantidadCompra) {
        this.numOrden = numOrden;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadCompra = cantidadCompra;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void procesarOrden(Inventario inventario) {
        if (inventario.verificarExistencia(producto.getNombre(), cantidadCompra)) {
            producto.vender(cantidadCompra);
            System.out.println("Venta realizada");
            mostrarDetalles();
        } else {
            System.out.println("No se pudo completar la venta, no hay inventario");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Número de orden: " + numOrden);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad comprada: " + cantidadCompra);
    }
}
