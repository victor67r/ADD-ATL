import java.io.File;
public class ejguiados5 {
    public static void main(String[] args) {
        File dirCineGranada = new File("./Ejercicios/Tema1/cine_granada");
        if (!dirCineGranada.exists()) {
            dirCineGranada.mkdir();
            System.out.println("Directorio 'cine_granada' creado." + dirCineGranada.getAbsolutePath());
        }

         String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    //File dirCineGranada = new File("./Ejercicios/Tema1/cine_granada");
    for (String dia : dias) {
    
        File dirDia = new File(dirCineGranada, dia);
        if (!dirDia.exists()) {
            dirDia.mkdir();
            System.out.println("Directorio '" + dia + "' creado en 'cine_granada'." + dirDia.getAbsolutePath());
        }
    }

   
}
}

