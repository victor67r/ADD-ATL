import java.io.File;
import java.io.IOException;
public class ejguidados7 {
    public static void main(String[] args) throws IOException {
        String dias [] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (String dia : dias){
            File archivo = new File("./Ejercicios/Tema1/cine_granada/" + dia + "/sesiones.txt");
            archivo.createNewFile();

        }
    }
}
