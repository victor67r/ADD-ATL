import java.io.File;
import java.util.TreeMap;
import java.util.Map;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SAXManager1 {

    public static void generarInformeStockPorCategoria() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            Map<String, Integer> stockPorCategoria = new TreeMap<>();

            DefaultHandler handler = new DefaultHandler() {
                String categoria = "";
                String elementoActual = "";
                StringBuilder contenido = new StringBuilder();

                @Override
                public void startElement(
                        String uri, String localName,
                        String qName, Attributes attributes) {
                    elementoActual = qName;
                    contenido.setLength(0);
                }

                @Override
                public void characters(
                        char[] ch, int start, int length) {
                    contenido.append(ch, start, length);
                }

                @Override
                public void endElement(
                        String uri, String localName, String qName) {

                    String texto = contenido.toString().trim();

                    if (qName.equals("categoria")) {
                        categoria = texto;
                    }

                    if (qName.equals("stock")) {
                        int stock = Integer.parseInt(texto);

                        stockPorCategoria.put(
                            categoria,
                            stockPorCategoria.getOrDefault(categoria, 0) + stock
                        );
                    }

                    elementoActual = "";
                }
            };

            parser.parse(new File("Ejercicios/Tema3/domsax/productos.xml"), handler);

            System.out.println("===== INFORME DE STOCK POR CATEGORÍA =====");

            for (Map.Entry<String, Integer> entrada
                    : stockPorCategoria.entrySet()) {
                System.out.println(
                    "Categoría: " + entrada.getKey()
                    + " - Stock total: " + entrada.getValue()
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mostrarPrecioMedioGlobal() {
    try {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        double[] sumaPrecios = {0};
        int[] cantidadProductos = {0};

        DefaultHandler handler = new DefaultHandler() {
            String elementoActual = "";
            double precio = 0;
            int stock = 0;
            StringBuilder contenido = new StringBuilder();

            @Override
            public void startElement(
                    String uri, String localName,
                    String qName, Attributes attributes) {
                elementoActual = qName;
                contenido.setLength(0);
            }

            @Override
            public void characters(
                    char[] ch, int start, int length) {
                contenido.append(ch, start, length);
            }

            @Override
            public void endElement(
                    String uri, String localName, String qName) {

                String texto = contenido.toString().trim();

                if (qName.equals("precio")) {
                    precio = Double.parseDouble(texto);
                }

                if (qName.equals("stock")) {
                    stock = Integer.parseInt(texto);

                    if (stock > 0) {
                        sumaPrecios[0] += precio;
                        cantidadProductos[0]++;
                    }
                }

                elementoActual = "";
            }
        };

        parser.parse(new File("Ejercicios/Tema3/domsax/productos.xml"), handler);

        System.out.println("===== PRECIO MEDIO GLOBAL =====");

        if (cantidadProductos[0] > 0) {
            double media = sumaPrecios[0] / cantidadProductos[0];

            System.out.printf(
                java.util.Locale.US,
                "Precio medio: %.2f euros%n",
                media
            );
        } else {
            System.out.println("No hay productos con stock disponible.");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}