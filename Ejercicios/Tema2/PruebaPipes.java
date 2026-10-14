package Ejercicios.Tema2;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

public class PruebaPipes {

    public static void main(String[] args) throws IOException {

        PipedInputStream entrada = new PipedInputStream();
        PipedOutputStream salida = new PipedOutputStream(entrada);

        Thread lector = new Thread(() -> {
            try {
                System.out.println("Intentando leer...");

                int dato = entrada.read();

                System.out.println("Dato recibido: " + (char) dato);

                entrada.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        lector.start();
    }
}