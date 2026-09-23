public class java22 {

    private String nombre;
    private int id;
    private int notas[];
    private int numeroNotas = 0;

    public java22(String nombre, int id, int cantidadNotas) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new int[cantidadNotas];
    }

    public void agregarNota(int nota) {
        if (numeroNotas < notas.length) {
            notas[numeroNotas] = nota;
            numeroNotas++;
        } else {
            System.out.println("No se pueden añadir más notas.");
        }
    }

    public double calcularPromedio() {
        if (numeroNotas == 0) {
            return 0;
        }

        double suma = 0;

        for (int i = 0; i < numeroNotas; i++) {
            suma += notas[i];
        }

        return suma / numeroNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public boolean esAprobado() {
        return calcularPromedio() >= 60;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Notas:");

        for (int i = 0; i < numeroNotas; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (esAprobado() ? "Aprobado" : "Suspenso"));
    }

    public static void main(String[] args) {

        java22 estudiante1 = new java22("Juan Pérez", 12345, 3);

        estudiante1.agregarNota(75);
        estudiante1.agregarNota(42);
        estudiante1.agregarNota(40);

        estudiante1.imprimirInformacion();

        java22 estudiante2 = new java22("María López", 67890, 4);

        estudiante2.agregarNota(55);
        estudiante2.agregarNota(60);
        estudiante2.agregarNota(70);

        estudiante2.imprimirInformacion();
    }
}