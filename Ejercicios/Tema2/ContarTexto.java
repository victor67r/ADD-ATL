package Ejercicios.Tema2;

import java.io.FileReader;
import java.io.StreamTokenizer;
import java.io.LineNumberReader;
import java.io.IOException;

public class ContarTexto {

    public static void main(String[] args) throws IOException {

        String ruta = "Ejercicios/Tema2/texto2.txt";

        int palabras = 0;
        int numeros = 0;
        int lineas = 0;

        // Contamos las palabras y los números
        FileReader archivo = new FileReader(ruta);
        StreamTokenizer tokenizer = new StreamTokenizer(archivo);

        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {

            if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                System.out.println("Palabra: " + tokenizer.sval);
                palabras++;

            } else if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                System.out.println("Número: " + tokenizer.nval);
                numeros++;
            }
        }

        archivo.close();

        // Contamos las líneas
        LineNumberReader lector =
                new LineNumberReader(new FileReader(ruta));

        while (lector.readLine() != null) {
            lineas++;
        }

        lector.close();

        // Mostramos los resultados
        System.out.println("Número de palabras: " + palabras);
        System.out.println("Número de números: " + numeros);
        System.out.println("Número de líneas: " + lineas);
    }
}