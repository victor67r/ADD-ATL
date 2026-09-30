import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ejguiados9 {
 public static void main(String[] args) throws IOException {
    File archivo = new File("./Ejercicios/Tema1/cine_granada/Martes/sesiones.txt");

    FileWriter escritura = new FileWriter(archivo);
    escritura.write("Martes: Iron Man (2008): 17:00 - 19:06.");

    escritura.close();

    FileReader lectura = new FileReader(archivo);
    int i;
    while ((i = lectura.read()) != -1) {
        System.out.print((char) i);
    }
    
    lectura.close();
 }   
}
