public class java19 {
    String nombre;
    int edad;

    public java19(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void presentarse(java19 persona) {
        System.out.println("Hola, soy " + persona.nombre + " y tengo " + persona.edad + " años.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
