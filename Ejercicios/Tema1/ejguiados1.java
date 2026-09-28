import java.io.File;
public class ejguiados1 {
    public static void main(String[] args) {
       File fichero = new File("./Ejercicios/Tema1/cine_granada");
       //fichero.mkdir();

       //existe
       if (fichero.exists()) {
          fichero.mkdir()
       }
    }
}
