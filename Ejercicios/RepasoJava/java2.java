

public class java2 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 2: Conversion de tipos.");
        String numeroTexto = "123";
        double precio = 19.99;

        //Convertir numeroTexto a entero
        int numeroConvertido = Integer.parseInt(numeroTexto);
        System.out.println("Numero convertido a entero: " + numeroConvertido);

        //Convertir precio a entero
        int numero= (int) precio;
        System.out.println("Precio convertido a entero: " + numero);

        //Convierte numero a String
        String numeroString = Integer.toString(numeroConvertido);
        System.out.println("Numero convertido a String: " + numeroString);
    }
}