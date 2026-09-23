public class java13 {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 13: BUSQUEDA EN ARRAY:");
       int array[]={3,7,1,9,4,6,8};
       int buscar = 9;
       boolean encontrado = false;
       for (int i = 0; i < array.length; i++) {
           if (array[i] == buscar) {
               encontrado = true;
               break;
           }
       }
       if (encontrado) {
           System.out.println("Elemento encontrado en el array.");
       } else {
           System.out.println("Elemento no encontrado en el array.");
       }
    }

}
