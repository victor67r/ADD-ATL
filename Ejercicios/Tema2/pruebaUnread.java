package Ejercicios.Tema2;

import java.io.FileReader;
import java.io.PushbackReader;
import java.io.IOException;

public class pruebaUnread {

    public static void main(String[] args) throws IOException {

        PushbackReader lector = new PushbackReader(
            new FileReader("Ejercicios/Tema2/texto.txt")
        );

        lector.unread('X');

        int caracter = lector.read();

        System.out.println((char) caracter);

        lector.close();
    }
}