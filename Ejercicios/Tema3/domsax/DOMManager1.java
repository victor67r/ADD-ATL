import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOMManager1 {

    private static final String RUTA_XML = "Ejercicios/Tema3/domsax/productos.xml";

    public static void mostrarProductos() {
        try {
            Document doc = cargarDocumento();
            NodeList lista = doc.getElementsByTagName("producto");

            System.out.println("\n=== LISTA DE PRODUCTOS ===");

            for (int i = 0; i < lista.getLength(); i++) {
                Element element = (Element) lista.item(i);

                String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                String categoria = element.getElementsByTagName("categoria").item(0).getTextContent();
                String precio = element.getElementsByTagName("precio").item(0).getTextContent();
                String stock = element.getElementsByTagName("stock").item(0).getTextContent();

                System.out.println(i + 1 + ". " + element.getAttribute("id") + " - "
                        + nombre + " - " + categoria + " - " + precio + " - " + stock);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String generarId(Document doc) {
    NodeList productos = doc.getElementsByTagName("producto");
    int maxId = 0;

    for (int i = 0; i < productos.getLength(); i++) {
        Element producto = (Element) productos.item(i);
        String id = producto.getAttribute("id");

        try {
            int numero = Integer.parseInt(id);

            if (numero > maxId) {
                maxId = numero;
            }
        } catch (NumberFormatException e) {
            // Ignorar IDs que no sean numéricos
        }
    }

    return String.format("%03d", maxId + 1);
}

public static void agregarProducto() {
    Scanner sc = new Scanner(System.in);

    try {
        Document doc = cargarDocumento();
        Element raiz = doc.getDocumentElement();

        // 1. Generar el ID automáticamente
        String id = generarId(doc);
        System.out.println("ID asignado: " + id);

        // 2. Solicitar los datos del producto
        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce la categoría:");
        String categoria = sc.nextLine();

        System.out.println("Introduce el precio:");
        String precio = sc.nextLine();

        System.out.println("Introduce el stock:");
        String stock = sc.nextLine();

        // 3. Crear el nodo producto
        Element producto = doc.createElement("producto");
        producto.setAttribute("id", id);

        // 4. Crear y añadir el nodo nombre
        Element nodoNombre = doc.createElement("nombre");
        nodoNombre.setTextContent(nombre);
        producto.appendChild(nodoNombre);

        // 5. Crear y añadir el nodo categoria
        Element nodoCategoria = doc.createElement("categoria");
        nodoCategoria.setTextContent(categoria);
        producto.appendChild(nodoCategoria);

        // 6. Crear y añadir el nodo precio
        Element nodoPrecio = doc.createElement("precio");
        nodoPrecio.setTextContent(precio);
        producto.appendChild(nodoPrecio);

        // 7. Crear y añadir el nodo stock
        Element nodoStock = doc.createElement("stock");
        nodoStock.setTextContent(stock);
        producto.appendChild(nodoStock);

        // 8. Añadir el producto a la raíz del XML
        raiz.appendChild(producto);

        // 9. Guardar los cambios en el XML
        guardarDocumento(doc, RUTA_XML);

        System.out.println("Producto agregado correctamente.");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

public static void incrementarPreciosPorCategoria() {
    Scanner sc = new Scanner(System.in);

    try {
        Document doc = cargarDocumento();

        // 1. Solicitar la categoría al usuario
        System.out.println("Introduce la categoría:");
        String categoria = sc.nextLine();

        // 2. Recorrer los productos
        NodeList productos = doc.getElementsByTagName("producto");

        for (int i = 0; i < productos.getLength(); i++) {
            Element producto = (Element) productos.item(i);

            // Obtener la categoría del producto
            String categoriaProducto = producto
                    .getElementsByTagName("categoria")
                    .item(0)
                    .getTextContent();

            // Comprobar si coincide con la categoría introducida
            if (categoriaProducto.equalsIgnoreCase(categoria)) {

                // Obtener el precio
                Element nodoPrecio = (Element) producto
                        .getElementsByTagName("precio")
                        .item(0);

                double precio = Double.parseDouble(
                        nodoPrecio.getTextContent()
                );

                // Incrementar el precio un 10 %
                precio = precio * 1.10;

                // Actualizar el precio en el XML
                nodoPrecio.setTextContent(
                        String.format(java.util.Locale.US, "%.2f", precio)
                );
            }
        }

        // 3. Guardar los cambios en el archivo actualizado
        guardarDocumento(doc, "productos_actualizados.xml");

        System.out.println(
                "Precios actualizados para la categoría: " + categoria
        );

    } catch (Exception e) {
        e.printStackTrace();
    }
}



    private static Document cargarDocumento() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File(RUTA_XML));
        doc.getDocumentElement().normalize();
        return doc;
    }

    private static void guardarDocumento(Document doc, String ruta) throws Exception {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(ruta));

        transformer.transform(source, result);
    }
}