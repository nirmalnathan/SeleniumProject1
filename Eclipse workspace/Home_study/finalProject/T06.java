package finalProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T06 {

  WebDriver driver;
	ExcelReporter ER= new ExcelReporter();
  @Test
  public void f() throws RowsExceededException, WriteException, IOException, BiffException {
	  	
	  try {
		WrapperMethods WM= new WrapperMethods(driver);
			WM.launchURL("https://login.salesforce.com/");
			WM.login();
			WM.ClickLinkByText("Campaigns");
			WM.ClickLinkByID("createNewLabel");
			WM.ClickLinkByText("Campaign");
			WM.setValueById("cpn1","Testcamp");
			WM.ClickLinkByID("cpn16");
			WM.selectListByIndex("cpn2",2);
			WM.selectListByIndex("cpn3",2);
			WM.setValueById("cpn5","2/18/2014");
			WM.setValueById("cpn6","3/18/2014");
			WM.setValueById("cpn8","1000");
			WM.setValueById("cpn9","100");
			WM.setValueById("cpn10","110");
			WM.setValueById("cpn11","10");
			WM.setValueById("cpn13","20");
			WM.setValueById("cpn4","Testcamp1");
			WM.ClickLinkByname("save");
			WM.logout();
			ER.repotstep("Testcase1","Pass");
	} catch (Exception e) {
		ER.repotstep("Testcase2","Fail");
	}
  }
  
  @BeforeMethod
  public void beforeMethod() throws BiffException, IOException {
	  Utility U = new Utility();
	  WrapperMethods WM = new WrapperMethods(driver);
	  String browser = WM.readXl(2,6);
	  driver = U.selectBroswer(browser);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
