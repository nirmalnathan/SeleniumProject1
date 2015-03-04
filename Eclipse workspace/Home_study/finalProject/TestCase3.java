package finalProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

public static void testcase3() throws BiffException, IOException, RowsExceededException, WriteException{
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WrapperMethods WM= new WrapperMethods(driver);
	WM.launchURL("https://login.salesforce.com/");
	String userEmail= WM.readXl(0,0);
	WM.setValueById("username", userEmail);
	String userpass= WM.readXl(1,0);
	WM.setValueById("password", userpass);
	WM.ClickLinkByclass("label");
	WM.ClickLinkByText("Campaigns");
	WM.ClickLinkByText("Create New View");
	WM.setValueById("fbPanelBar1", "Testing");
	WM.setValueById("fbPanelBox1", "Test");
	WM.ClickLinkByname("save");
	WM.logout();
	
}
	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException {
		// TODO Auto-generated method stub
		testcase3();
	}

}
