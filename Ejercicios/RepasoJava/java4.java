public class java4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4: Operadores.");
        System.out.println("CALCULADORA BASICA:");
        int numero1=15;
        int numero2=4;

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));
        System.out.println("Division: " + (numero1 / numero2));
        System.out.println("Módulo: " + (numero1 % numero2));

        System.out.println("OPERADORES DE COMPARACION:");
        int a = 10;
        int b = 20;

        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("(a <= b) && (a > 0): " + ((a < b) && (a > 0)));   
        System.out.println("(a > b) || (b > 0): " + ((a > b) || (b > 0)));     

        System.out.println("INCREMENTO Y DECREMENTO:");
        int x = 5;
        int y=++x;
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y:" + y);

        int k = 5;
        int m=k++;
        System.out.println("Valor de k: " + k);
        System.out.println("Valor de m: " + m);    

    }
    
}
