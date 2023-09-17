public abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidadExistencia;
    public Producto(String nombre, double precio, int cantidadExistencia){
        this.nombre=nombre;
        this.precio = precio;
        this.cantidadExistencia = cantidadExistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
    public void vender(int cantidad){
        if(cantidadExistencia >= cantidad){
            cantidadExistencia -=cantidad;
        }else{
            System.out.println("NO HAY SUFICIEN TE CANTIDAD "+nombre+"en el invantario");
        }
    }
}

