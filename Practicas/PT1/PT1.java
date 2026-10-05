package Practicas.PT1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PT1 {

    public static void main(String[] args) throws IOException {

        // Creamos estructuras
        File archivo = new File("./Practicas/PT1/cinema_2000");

        if (!archivo.exists()) {
            archivo.mkdir();
        }

        File reviews = new File("./Practicas/PT1/cinema_2000/reviews");
        if (!reviews.exists()) {
            reviews.mkdir();
        }

        File users = new File("./Practicas/PT1/cinema_2000/users.txt");
        if (!users.exists()) {
            users.createNewFile();
        }

        // Menú
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Crear usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Añadir review (usuario existente)");
            System.out.println("4. Mostrar review (usuario existente)");
            System.out.println("5. Salir del programa");

            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Crear usuario");
                    break;

                case 2:
                    System.out.println("Eliminar usuario");
                    break;

                case 3:
                    System.out.println("Añadir review");
                    break;

                case 4:
                    System.out.println("Mostrar review");
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 5);
        sc.close();
    }
}