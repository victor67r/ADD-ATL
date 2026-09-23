public class java16 {

    // Sumar
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Restar
    public static int restar(int a, int b) {
        return a - b;
    }

    // Multiplicar
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Dividir
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 3;

        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        System.out.println("División: " + dividir(num1, num2));
    }
}