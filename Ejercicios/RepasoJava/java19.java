public class java19 {
    String nombre = "Victor";
    int edad = 29;

    public java19(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void presentarse(java19 persona) {
        System.out.println("Hola, mi nombre es " + persona.nombre + " y tengo " + persona.edad + " años.");
    }
}
