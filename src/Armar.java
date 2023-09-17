public class Armar implements Ensamble{
    private Inventario inventario;
    public Armar(Inventario inventario){
        this.inventario= this.inventario;
    }
    @Override
    public void crear() {
        System.out.println("armando piezaas");
        Producto silla = new Silla("Silla",50.0,1);
        inventario.agregarProducto(silla);
    }
}
