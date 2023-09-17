public class Factura {
    private Orden orden;
    private double total;

    public Factura(Orden orden) {
        this.orden = orden;
        this.total = orden.getProducto().getPrecio() * orden.getCantidadCompra();
    }

    public void mostrarFactura() {
        System.out.println("Factura para la orden #" + orden.getNumOrden());
        System.out.println("Cliente " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
        System.out.println("Producto " + orden.getProducto().getNombre());
        System.out.println("Cantidad comprada " + orden.getCantidadCompra());
        System.out.println("Total " + total);
    }
}