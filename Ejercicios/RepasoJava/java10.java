public class java10 {
    public static void main(String[] args) {
      System.out.println("Ejercicio 10: CONTADOR NUMEROS PARES.");
      int contador = 0;
      for (int i = 1; i <= 20; i++) {
          if (i % 2 == 0) {
              contador++;
          }
      }
      System.out.println("Cantidad de números pares del 1 al 20: " + contador);
    }
    
}
