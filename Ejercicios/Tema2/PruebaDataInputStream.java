package Ejercicios.Tema2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PruebaDataInputStream {

    public static void main(String[] args) {

        try {
            // Escribimos los datos
            DataOutputStream salida = new DataOutputStream(
                    new FileOutputStream("Ejercicios/Tema2/datos.txt"));

            salida.write(65);
            salida.writeInt(12345);
            salida.writeFloat(3.14f);
            salida.writeDouble(2.718);
            salida.close();

            // Leemos los datos en un orden diferente
            DataInputStream entrada = new DataInputStream(
                    new FileInputStream("Ejercicios/Tema2/datos.txt"));

            int aByte = entrada.read();
            System.out.println(aByte);

            /*
            double numero = entrada.readDouble();
            System.out.println(numero);
            */ 
            

            // Intentamos leer un double donde se escribió primero un int
            double numero = entrada.readDouble();
            System.out.println(numero);

            entrada.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}