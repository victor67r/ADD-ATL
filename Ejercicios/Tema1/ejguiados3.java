import java.io.File;
public class ejguiados3 {
    public static void main(String[] args) {
      String dias [] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
      for (String dia : dias) {
          File origen = new File("./Ejercicios/Tema1/" + dia);
          File destino = new File("./Ejercicios/Tema1/cine_granada/" + dia);
          origen.renameTo(destino);
            
      }
    }
}
