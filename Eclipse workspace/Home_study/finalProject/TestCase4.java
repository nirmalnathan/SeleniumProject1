package finalProject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase4 {

public static void testcase4() throws BiffException, IOException, RowsExceededException, WriteException, InterruptedException{
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
		else
		System.out.println("item not found");
		
	}
	S1.selectByIndex(j);
	WM.ClickLinkByname("go");
	WM.ClickLinkByText("Edit");
	WM.setValueById("fname","Testing1");
	WM.setValueById("devname","Test2");
	WM.ClickLinkByname("save");
	WM.logout();
}
	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
testcase4();
	}

}
