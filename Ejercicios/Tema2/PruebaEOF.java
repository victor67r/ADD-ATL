package Ejercicios.Tema2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.IOException;

public class PruebaEOF {

    public static void main(String[] args) {

        try {
            DataOutputStream salida = new DataOutputStream(
                    new FileOutputStream("Ejercicios/Tema2/datos.txt"));

            salida.write(65);
            salida.close();

            DataInputStream entrada = new DataInputStream(
                    new FileInputStream("Ejercicios/Tema2/datos.txt"));

            int dato = entrada.readInt();
            System.out.println(dato);

            entrada.close();

        } catch (EOFException e) {
            System.out.println("Error: no hay suficientes bytes para leer un entero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}