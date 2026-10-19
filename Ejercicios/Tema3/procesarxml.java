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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class procesarxml {

    public static void main(String[] args) {

        DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();

        factory.setValidating(false);
        factory.setIgnoringElementContentWhitespace(true);

        try {
            // Leer el archivo XML
            DocumentBuilder builder = factory.newDocumentBuilder();

            File file = new File("Ejercicios/Tema3/ejemploXML.xml");
            Document doc = builder.parse(file);

            XPath xpath = XPathFactory.newInstance().newXPath();
            String expresion = "/class/student";
            NodeList lista = (NodeList) xpath.compile(expresion).evaluate(doc, XPathConstants.NODESET);

            System.out.println("Número de estudiantes: " + lista.getLength());

        } catch (ParserConfigurationException | SAXException| IOException | XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}