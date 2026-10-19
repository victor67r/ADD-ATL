package Ejercicios.Tema3;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class parseadordom {

    public static void main(String[] args) {

        // Creamos un objeto DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        factory.setValidating(false);
        factory.setIgnoringElementContentWhitespace(true);

        try {
            // Crear el parseador DOM
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Leer el archivo XML
            File file = new File("Ejercicios/Tema3/ejemploXML.xml");
            Document doc = builder.parse(file);
            System.out.println("Archivo XML leído correctamente.");

            // 2.1 Crear un objeto XPath
            XPath xpath = XPathFactory.newInstance().newXPath();

            // 2.2 Crear la expresión XPath
            String expresion = "/class/student";

            // 2.3 Ejecutar la expresión y obtener la lista de nodos
            NodeList lista = (NodeList) xpath.compile(expresion).evaluate(doc, XPathConstants.NODESET);

            // 2.4 Recorrer la lista de estudiantes
            for (int i = 0; i < lista.getLength(); i++) {

                Node nodo = lista.item(i);

                // 2.5 Mostrar el nombre del elemento actual
                System.out.println("Current Element: "
                        + nodo.getNodeName());

                // 2.6 Convertir el nodo a Element
                Element elemento = (Element) nodo;
                System.out.println("Student Roll no: " + elemento.getAttribute("rollno"));

                // 2.7 Mostrar los datos del estudiante
                System.out.println("First Name: " + elemento.getElementsByTagName("firstname").item(0).getTextContent());
                System.out.println("Last Name: " + elemento.getElementsByTagName("lastname").item(0).getTextContent());
                System.out.println("Nickname: "+ elemento.getElementsByTagName("nickname").item(0).getTextContent());
                System.out.println("Marks: "+ elemento.getElementsByTagName("marks").item(0).getTextContent());
                System.out.println("--------------------");
            }

        } catch (ParserConfigurationException | SAXException
                | IOException | XPathExpressionException e) {

            System.out.println("Error al procesar el archivo XML.");
            e.printStackTrace();
        }
    }
}