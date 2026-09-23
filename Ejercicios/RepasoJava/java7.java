public class java7 {
    public static void main(String[] args) {
      System.out.println("Ejercicio 7: Clasificador de Edad.");
      int edad = 25;

        if (edad < 12) {
            System.out.println("Niño.");
        } else if (edad >= 13 && edad < 17) {
            System.out.println("Adolescente.");
        } else if (edad >= 18 && edad < 64) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Adulto Mayor.");
        }
    }
    
}
