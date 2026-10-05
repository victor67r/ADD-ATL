package Practicas.PT1;

import java.io.File;
import java.io.FileWriter;
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

            System.out.print("Introduce tu nombre: ");
            String nombre = sc.next();

            String codigo;
            int siguienteCodigo = 1;
            boolean codigoOcupado = true;

            while (codigoOcupado) {
            codigoOcupado = false;

            Scanner lectorUsuarios = new Scanner(users);
            while (lectorUsuarios.hasNextLine()) {

            String linea = lectorUsuarios.nextLine();
            String[] datos = linea.split(";");

            int codigoActual = Integer.parseInt(datos[1]);

            if (codigoActual == siguienteCodigo) {
                codigoOcupado = true;
                siguienteCodigo++;
            }
        }

        lectorUsuarios.close();
    }

            codigo = String.format("%03d", siguienteCodigo);

            System.out.println("Tu código es: " + codigo);

            System.out.print("Introduce tu contraseña: ");
            String password = sc.next();
            User usuario = new User(nombre, codigo, password);

            FileWriter escritor = new FileWriter(users, true);

            escritor.write(usuario.getNombre() + ";"
            + usuario.getCodigo() + ";"
            + usuario.getPassword() + "\n");

             escritor.close();

            System.out.println("Usuario creado correctamente.");

            break;

                case 2:
                System.out.println("Eliminar usuario");

                System.out.print("Introduce el código del usuario: ");
                String codigoEliminar = sc.next();

                Scanner lector = new Scanner(users);

                String usuarios = "";
                while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                String[] datos = linea.split(";");

                if (datos[1].equals(codigoEliminar)) {
                System.out.println("Usuario encontrado");
                }
                if (!datos[1].equals(codigoEliminar)) {
                usuarios += linea + "\n";
                }
                }
        
                lector.close();

                FileWriter escritorEliminar = new FileWriter(users);
                escritorEliminar.write(usuarios);
                escritorEliminar.close();

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