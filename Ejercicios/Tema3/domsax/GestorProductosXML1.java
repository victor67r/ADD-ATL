import java.util.Scanner;

public class GestorProductosXML1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> DOMManager1.mostrarProductos();
                case 2 -> DOMManager1.agregarProducto();
                //case 3 -> DOMManager1.incrementarPreciosPorCategoria();
                
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción incorrecta. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 0);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("===== GESTOR DE PRODUCTOS XML =====");
        System.out.println("1. Mostrar todos los productos (DOM)");
        System.out.println("2. Añadir un nuevo producto (DOM)");
        System.out.println("3. Incrementar precios de una categoría (DOM)");
        System.out.println("4. Generar informe de stock por categoría (SAX)");
        System.out.println("5. Mostrar precio medio global (SAX)");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
