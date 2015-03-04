package finalProject;

import java.io.IOException;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class T02 {
	WebDriver driver;
	ExcelReporter ER= new ExcelReporter();
  @Test
  public void f() throws RowsExceededException, WriteException, IOException, BiffException{
		try {
			WrapperMethods WM= new WrapperMethods(driver);
			WM.launchURL("https://login.salesforce.com/");
			WM.login();
			if (WM.verifytextpresentbyid("userNavLabel", "nirmal nathan")==true) System.out.println("pass");
			else
			System.out.println("Notloggedin");
			WM.logout();
			WM.wait(5);
			WM.takeSnap();
			ER.repotstep("Testcase2","Pass");
		} catch (Exception e) {
			WrapperMethods WM= new WrapperMethods(driver);
			WM.takeSnap();
			ER.repotstep("Testcase2","Fail");
		}
  }
  @BeforeMethod
  public void beforeMethod() throws BiffException, IOException, RowsExceededException, WriteException, InterruptedException {
	  Utility U = new Utility();
	  WrapperMethods WM = new WrapperMethods(driver);
	  String browser = WM.readXl(2,2);
	  driver = U.selectBroswer(browser);
	  WM.implicitwait(10);

  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
