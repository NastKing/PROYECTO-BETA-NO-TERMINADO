import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda de sillas.");
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Por favor, ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Por favor, ingrese su dirección:");
        String direccion = scanner.nextLine();
        System.out.println("Por favor, ingrese su teléfono:");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, direccion, telefono);

        Inventario inventario = new Inventario();
        Producto silla = new Silla("Silla", 50.0, 10);
        inventario.agregarProducto(silla);


        System.out.print("Cuántas sillas desea comprar? ");
        int cantidadComprada = scanner.nextInt();

        Orden orden = new Orden(generarNumeroOrden(), cliente, silla, cantidadComprada);
        orden.procesarOrden(inventario);



        if (orden.getCantidadCompra() > silla.getCantidadExistencia()) {
            System.out.println("No hay suficiente cantidad de sillas en el inventario para ensamblar.");
        } else {
            Factura factura = new Factura(orden);
            factura.mostrarFactura();
            System.out.println("Proceso de ensamblaje:");
            System.out.println("1. Cortar materiales");
            System.out.println("2. Armar piezas");
            System.out.print("Elija una opción (1/2): ");
            int opcion = scanner.nextInt();

            Ensamble procesoEnsamble;

            if (opcion == 1) {
                procesoEnsamble = new Cortar();
            } else if (opcion == 2) {
                procesoEnsamble = new Armar(inventario);
            } else {
                System.out.println("Opción no válida. Proceso de ensamblaje cancelado.");
                scanner.close();
                return;
            }

            procesoEnsamble.crear();
        }

        scanner.close();
    }

    private static int generarNumeroOrden() {
        return (int) (Math.random() * 1000);
    }
}


