package Practicas.PT1;

public class User {

    //Creamos las clases
    private String nombre;
    private String codigo;
    private String password;
   

    //Constructor
     public User(String nombre, String codigo, String password) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.password = password;
    }

    //Getters y setters
     public String getNombre() {
         return nombre;
     }


     public void setNombre(String nombre) {
         this.nombre = nombre;
     }


     public String getCodigo() {
         return codigo;
     }


     public void setCodigo(String codigo) {
         this.codigo = codigo;
     }


     public String getPassword() {
         return password;
     }


     public void setPassword(String password) {
         this.password = password;
     }


    
}
