public class java12 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 12: SUMA DE ELEMENTOS.");
        int numeros[] = {10, 25, 30, 45, 50};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("Suma de los elementos del array: " + suma);
    }
    
}
