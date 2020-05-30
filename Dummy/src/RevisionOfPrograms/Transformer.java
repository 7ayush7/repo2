package RevisionOfPrograms;

import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Transformer {

	public static void main(String[] args) throws TransformerException{
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		
		StreamSource inputXML = new StreamSource(new File("C:\\Users\\ayushsi\\Documents\\24July\\XMLTransform\\Product.xml"));
		Result outputXML = new StreamResult(new File("C:\\Users\\ayushsi\\Documents\\24July\\XMLTransform\\ProductOutput.xml"));
		StreamSource inputXSLT = new StreamSource(new File("C:\\Users\\ayushsi\\Documents\\24July\\XMLTransform\\generateIF_XSD.xslt"));
		
		javax.xml.transform.Transformer transformer = transformerFactory.newTransformer(inputXSLT);
		transformer.transform(inputXML, outputXML);

	}
}
