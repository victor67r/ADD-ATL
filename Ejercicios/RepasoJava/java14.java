public class java14 {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 14: ARRAY BIDIMENSIONAL.");
        int matriz [][] = new int[3][3];
        int numero = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                numero++;
            }
        }
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
