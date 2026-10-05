package Practicas.PT1;

import java.io.File;
import java.io.IOException;

public class PT1 {
    public static void main(String[] args) throws IOException {

        //Creamos estructuras
    File archivo = new File("./Practicas/PT1/cinema_2000");
    if (!archivo.exists()) {
       archivo.mkdir();
    }

    File reviews = new File("./Practicas/PT1/cinema_2000/reviews");

    if (!reviews.exists()) {
    reviews.mkdir();
}

    File users = new File("./Practicas/PT1/cinema_2000/users.txt");
    if (!users.exists()) {
    users.createNewFile();
}

    //Guardamos los usuarios
    }
}
