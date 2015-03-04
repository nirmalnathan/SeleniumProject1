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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase5 {

public static void testcase5() throws RowsExceededException, WriteException, IOException, BiffException, InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WrapperMethods WM= new WrapperMethods(driver);
	WM.launchURL("https://login.salesforce.com/");
	String userEmail= WM.readXl(0,0);
	WM.setValueById("username", userEmail);
	String userpass= WM.readXl(1,0);
	WM.setValueById("password", userpass);
	WM.ClickLinkByclass("label");
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
	WM.ClickLinkByname("go");
	//This line of code is not working to handle alerts . Need to check why .. 
	//WM.ClickLinkByText("Delete");
	driver.findElement(By.linkText("Delete")).click();

	driver.switchTo().alert().accept();
	WM.logout();
	
	
	
}
	public static void main(String[] args) throws RowsExceededException, WriteException, BiffException, IOException, InterruptedException {
		
		// TODO Auto-generated method stub
		testcase5();
	}

}
