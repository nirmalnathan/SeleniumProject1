package finalProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class T03 {
	  WebDriver driver;
		ExcelReporter ER= new ExcelReporter();
	
  @Test
  public void t03() throws RowsExceededException, WriteException, IOException, BiffException {
	  try {
		WrapperMethods WM= new WrapperMethods(driver);
			WM.launchURL("https://login.salesforce.com/");
			WM.login();
			WM.ClickLinkByText("Campaigns");
			WM.ClickLinkByText("Create New View");
			WM.setValueById("fname", "Testing");
			WM.setValueById("devname", "Test");
			WM.ClickLinkByname("save");
			WM.logout();
			ER.repotstep("Testcase3","Pass");
	} catch (Exception e) {
			ER.repotstep("Testcase3","Fail");
	}
  }
  @BeforeMethod
  public void beforeMethod() throws BiffException, IOException {
	  Utility U = new Utility();
	  WrapperMethods WM = new WrapperMethods(driver);
	  String browser = WM.readXl(2,3);
	  driver = U.selectBroswer(browser);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
