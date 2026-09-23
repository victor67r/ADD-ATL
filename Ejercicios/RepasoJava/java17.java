public class java17 {

    public static int encontrarMaximo(int array[]) {
        int maximo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }

        return maximo;
    }

    public static void main(String[] args) {

        System.out.println("EJERCICIO 17: METODO PARA ARRAYS.");

        int numeros[] = {5, 12, 3, 25, 8, 17};

        int maximo = encontrarMaximo(numeros);

        System.out.println("El número máximo es: " + maximo);
    }
}