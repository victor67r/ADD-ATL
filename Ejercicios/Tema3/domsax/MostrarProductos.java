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

public class MostrarProductos {

    private static final String RUTA_XML = "Ejercicios/Tema3/domsax/productos.xml"; 

       public static void main(String[] args) {
        mostrarProductos();
    }

    public static void mostrarProductos() {
        try {
            Document doc = cargarDocumento();
            NodeList lista = doc.getElementsByTagName("producto");

            System.out.println("\n=== LISTA DE PRODUCTOS ===");

            for (int i = 0; i < lista.getLength(); i++) {
                Element element = (Element) lista.item(i);
                System.out.println(i + 1 + ". " + element.getAttribute("id") + " - "
                        + element.getElementsByTagName("nombre").item(0).getTextContent());
            }

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
}