import java.io.File;
public class ejguiados2 {
    public static void main(String[] args) {
      String dias [] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
      for (String dia : dias) {
          File fichero = new File("./Ejercicios/Tema1/" + dia);
            //fichero.mkdir();

            if (!fichero.exists()) {
                fichero.mkdir();
            }
      }


    }
}
