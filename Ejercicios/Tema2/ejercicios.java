package Ejercicios.Tema2;

import java.io.FileReader;
import java.io.PushbackReader;
import java.io.IOException;

public class ejercicios {

    public static void main(String[] args) throws IOException {

        PushbackReader lector = new PushbackReader(
    new FileReader("Ejercicios/Tema2/texto.txt")
);

        int caracter;

        while ((caracter = lector.read()) != -1) {
            System.out.print((char) caracter);
        }

        lector.close();
    }
}
