import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ejguiados8 {
    public static void main(String[] args) throws IOException{
        File archivo = new File("./Ejercicios/Tema1/cine_granada/Lunes/sesiones.txt");
        FileOutputStream escritura = new FileOutputStream(archivo);
        String cadena = "Lunes: Spiderman (2002): 18:00 - 20:07";
        escritura.write(cadena.getBytes());

        FileInputStream lectura= new FileInputStream(archivo);
        int i;
        while ((i = lectura.read()) != -1) {
        System.out.print((char) i);
}
        
        lectura.close();
        
    }
}
