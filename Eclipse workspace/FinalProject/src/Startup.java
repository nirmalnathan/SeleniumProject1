package finalProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.testng.TestNG;

import jxl.read.biff.BiffException;

public class Startup {


	public static void main(String[] args) throws BiffException, ParserConfigurationException, TransformerException, IOException {
		CreateXml Create = new CreateXml ();
		Create.createXML();
		List<String> file = new ArrayList<String>();
        file.add("C:\\Project1\\conf\\suite.xml");
        TestNG testNG = new TestNG();
        testNG.setTestSuites(file);
        testNG.run();
	}

}
