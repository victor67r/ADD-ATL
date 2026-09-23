public class java20 {
    double ancho;
    double alto;

    public java20(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    public double esCuadrado() {
        if (ancho == alto) {
            return 1; // Es un cuadrado
        } else {
            return 0; // No es un cuadrado
        }
    }
    
}
