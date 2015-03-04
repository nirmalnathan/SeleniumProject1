package finalProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

public static void testcase2() throws RowsExceededException, WriteException, IOException, BiffException{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WrapperMethods WM= new WrapperMethods(driver);
	WM.launchURL("https://login.salesforce.com/");
	String userEmail= WM.readXl(0,0);
	WM.setValueById("username", userEmail);
	String userpass= WM.readXl(1,0);
	WM.setValueById("password", userpass);
	WM.ClickLinkByclass("label");
	if (WM.verifytextpresentbyid("userNavLabel", "nirmal nathan")==true) System.out.println("pass");
	else
	System.out.println("fail");
	WM.logout();
	
		
}
	public static void main(String[] args) throws RowsExceededException, WriteException, BiffException, IOException {

		testcase2() ;
	}

}
