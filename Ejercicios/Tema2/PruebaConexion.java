package Ejercicios.Tema2;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

public class PruebaConexion {

    public static void main(String[] args) throws IOException {

        PipedInputStream entrada = new PipedInputStream();

        // Primera conexión
        PipedOutputStream salida1 = new PipedOutputStream(entrada);
        System.out.println("Primera conexión realizada correctamente.");

        // Intentamos realizar una segunda conexión
        PipedOutputStream salida2 = new PipedOutputStream();

        try {
            salida2.connect(entrada);
            System.out.println("Segunda conexión realizada correctamente.");
        } catch (IOException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }

        salida1.close();
        salida2.close();
        entrada.close();
    }
}