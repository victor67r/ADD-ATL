import java.io.*;

public class ej1completo {

    public static void main(String[] args) throws IOException {

        // 1. Crear un directorio llamado Biblioteca
        File biblioteca = new File("./Ejercicios/Tema1/Biblioteca");

        if (!biblioteca.exists()) {
            biblioteca.mkdir();
            System.out.println("Directorio creado: " + biblioteca.getAbsolutePath());
        }

        // 2. Crear un directorio para cada categoría
        String[] categorias = {"Novela", "Poesía", "Ciencia", "Historia", "Arte"};

        for (String categoria : categorias) {
            File archivo = new File(biblioteca, categoria);

            if (!archivo.exists()) {
                archivo.mkdir();
                System.out.println("Directorio creado: " + archivo.getAbsolutePath());
            }
        }

        // 3. Crear catalogo.txt en cada categoría
        for (String categoria : categorias) {

            File catalogo = new File(biblioteca,categoria + File.separator + "catalogo.txt");

            if (!catalogo.exists()) {
                catalogo.createNewFile();
                System.out.println("Archivo creado: " + catalogo.getAbsolutePath());
            }
        }

        // 4.1 NOVELA - Bytes

        File archivoNovela = new File(biblioteca,"Novela" + File.separator + "catalogo.txt");
        FileOutputStream escrituraNovela = new FileOutputStream(archivoNovela);
        String cadena = "Don Quijote (1605) - Miguel de Cervantes";

        escrituraNovela.write(cadena.getBytes());

        FileInputStream lecturaNovela = new FileInputStream(archivoNovela);
        int dato;

        while ((dato = lecturaNovela.read()) != -1) {
            System.out.print((char) dato);
        }

        escrituraNovela.close();
        lecturaNovela.close();

        // 4.2 POESÍA - Caracteres

        File archivoPoesia = new File(biblioteca,"Poesía" + File.separator + "catalogo.txt");
        FileWriter escrituraPoesia = new FileWriter(archivoPoesia);
        escrituraPoesia.write("Veinte poemas de amor (1924) - Pablo Neruda");
        escrituraPoesia.close();

        FileReader lecturaPoesia = new FileReader(archivoPoesia);
        int caracter;

        while ((caracter = lecturaPoesia.read()) != -1) {
            System.out.print((char) caracter);
        }

        lecturaPoesia.close();

        //4.3. Ciencia - RAM
        File archivo = new File(biblioteca, "Ciencia" + File.separator + "catalogo.txt");
        RandomAccessFile escritura = new RandomAccessFile(archivo, "rws");
        escritura.writeBytes("El origen de las especies (1859) - Charles Darwin");

        escritura.seek("El origen de las especies ".length());
        escritura.writeBytes(" (1858)");

        escritura.close();

        FileReader lectura = new FileReader(archivo);
    int i;
    while ((i = lectura.read()) != -1) {
        System.out.print((char) i);
    }
    
    lectura.close();
    }
}