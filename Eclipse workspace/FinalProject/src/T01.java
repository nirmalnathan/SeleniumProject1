package finalProject;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T01 {

  WebDriver driver;
  ExcelReporter ER= new ExcelReporter();
  String Filename = "C:\\Project1\\data\\TestDataForProject.xls";
  
  
  @Test
  public void f() throws RowsExceededException, WriteException, IOException, BiffException, InterruptedException {
	  	
	  	try {
 
			WrapperMethods WM= new WrapperMethods(driver);
	  		WM.launchURL("http://www.developerforce.com/events/regular/registration.php");
			WM.setValueById("first_name", "Nirmal");
			WM.setValueById("last_name", "Nathan");
//read user name from xl file
			String userEmail= WM.readXl(0,0,Filename);
			WM.setValueById("email", userEmail);
//	WM.selectListByIndex("job_role", 1);
//	WM.setValueById("company", "Jamcracker");
			WM.selectListByIndex("country", 1);
			WM.setValueById("postal_code", "614903");
			WM.setValueById("username", userEmail);
			WM.SelectCheckBoxByID("eula");
			WM.takeSnap();
			ER.repotstep("Testcase1","Pass");
			
		} catch (Exception e) {
			WrapperMethods WM= new WrapperMethods(driver);
			WM.takeSnap();
			ER.repotstep("Testcase1","Fail");
		}
  }
  

 @BeforeSuite
public void beforeSuite() throws WriteException, IOException, BiffException
	{
			ER.createWorkSheet();
			ER.addHeader();
	}
  @BeforeMethod
  public void beforeMethod() throws IOException, BiffException, RowsExceededException, WriteException {
		  Utility U = new Utility();
		  WrapperMethods WM = new WrapperMethods(driver);
		  String browser = WM.readXl(2,1);
		  driver = U.selectBroswer(browser);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	}
  @AfterMethod
  public void afterMethod() throws WriteException, IOException {
 	 		driver.close();
 	  
   	} 
  @AfterSuite
  public void afterSuite() throws WriteException, IOException{
  ER.createResultFile();
  }
}
