package Ejercicios.Tema3;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

public class parseadordom {

    public static void main(String[] args) {


        // Creamos un objeto DocumentBuilderFactory
        DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();

        factory.setValidating(false);
        factory.setIgnoringElementContentWhitespace(true);

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            File file = new File("Ejercicios/Tema3/ejemploXML.xml");
            Document doc = builder.parse(file);
            System.out.println("Archivo XML leído correctamente.");

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Error al procesar el archivo XML.");
            e.printStackTrace();
        }
    }




}