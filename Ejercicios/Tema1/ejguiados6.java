import java.io.File;
public class ejguiados6 {
    public static void main(String[] args) {
        File fichero= new File("./Ejercicios/Tema1/cine_granada");
        //fichero.listFiles();
        if (fichero.exists()) {
            File [] ficheros = fichero.listFiles();
            for (File f : ficheros) {
                System.out.println("Ruta relativa: " + f.getPath());
            }
        }
    }
}
