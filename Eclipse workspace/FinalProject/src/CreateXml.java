package finalProject;

import java.io.File;  
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;  
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;  
import javax.xml.transform.TransformerException;  
import javax.xml.transform.TransformerFactory;  
import javax.xml.transform.dom.DOMSource;  
import javax.xml.transform.stream.StreamResult;  
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.w3c.dom.Document;  
import org.w3c.dom.Element; 
public class CreateXml {
	
	 public void createXML() throws ParserConfigurationException, TransformerException, BiffException, IOException {  
		  DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();  
		  DocumentBuilder docBuilder= documentFactory.newDocumentBuilder();		    

		  //root 
		  Document doc = docBuilder.newDocument();	
		  	Element rootElement = doc.createElement("suite");
		  	doc.appendChild(rootElement);
		  	rootElement.setAttribute("name", "testsuite");
		  //test
		  	Element test= doc.createElement("test");
			rootElement.appendChild(test);
		  //set attribute to test 	
			test.setAttribute("verbose", "2");
			test.setAttribute("name", "default_test");
		//classes	
			Element Classes= doc.createElement("classes");
			test.appendChild(Classes);   
			
		//class
			
			int i;
			File F = new File("C:\\Project1\\data\\Testcasefile.xls");
			Workbook wd = Workbook.getWorkbook(F);
			Sheet s1 = wd.getSheet(0);
			int Rowcount=s1.getRows();
			for (i=1;i<Rowcount;i++)
			{
			String A = s1.getCell(3,i).getContents();
			if (A.equalsIgnoreCase("yes"))
				{
				Element Class= doc.createElement("class");
				Classes.appendChild(Class);
				Class.setAttribute("name", "finalProject.T0"+i);
				}
				
			else 
				continue;
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,"http://testng.org/testng-1.0.dtd");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\Project1\\conf\\suite.xml"));
			transformer.transform(source, result);
			System.out.println("File saved to specified path!");  
		   
		   
		  }

	/*public static void main(String[] args) throws ParserConfigurationException, TransformerException, BiffException, IOException {
		createXML();

	}*/

}

