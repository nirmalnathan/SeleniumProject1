package finalProject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;*/

public class T05 {

  WebDriver driver;
	ExcelReporter ER= new ExcelReporter();
  @Test
  public void f() throws RowsExceededException, WriteException, IOException, BiffException {
		try {
			WrapperMethods WM= new WrapperMethods(driver);
			WM.launchURL("https://login.salesforce.com/");
			WM.login();
			WM.ClickLinkByText("Campaigns");
			Select S1 = WM.findListByName("fcf");
			List<WebElement> L1 = S1.getOptions();
			int i = L1.size();
			int j;
			for (j=0;j<i;j++)
			{
				if (L1.get(j).getText().equalsIgnoreCase("Testing"))
				break;
				 
						
			}
			S1.selectByIndex(j);
			System.out.println(j);
			//This line of code is not working to handle alerts . Need to check why .. 
			//WM.ClickLinkByText("Delete");
			driver.findElement(By.linkText("Delete")).click();
			driver.switchTo().alert().accept();
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
	  String browser = WM.readXl(2,5);
	  driver = U.selectBroswer(browser);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
