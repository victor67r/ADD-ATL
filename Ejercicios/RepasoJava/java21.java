public class java21 {
    public static void main(String[] args) {
        java20 rectangulo = new java20(5.0, 3.0);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Es cuadrado: " + (rectangulo.esCuadrado() == 1 ? "Sí" : "No"));
    }
    
}
