package Practicas.PT1;

public class Review {

    //Creamos las clases
    private String pelicula;
    private int calificacion;

    //Constructor
    public Review(String pelicula, int calificacion) {
        this.pelicula = pelicula;
        this.calificacion = calificacion;
    }

    //Getters y setters
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
    
}
