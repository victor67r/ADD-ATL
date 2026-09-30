import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
public class ejguiados10 {
    public static void main(String[] args) throws IOException{
        File archivo = new File("./Ejercicios/Tema1/cine_granada/Miércoles/sesiones.txt");
        RandomAccessFile escritura = new RandomAccessFile(archivo, "rw");
        escritura.writeBytes("Miércoles: Titanic (1998): 17:00 - 20:15.");

        escritura.seek("Titanic (...)".length());
        escritura.writeBytes(" - 1997");

        escritura.close();

        FileReader lectura = new FileReader(archivo);
    int i;
    while ((i = lectura.read()) != -1) {
        System.out.print((char) i);
    }
    
    lectura.close();
    }
}
