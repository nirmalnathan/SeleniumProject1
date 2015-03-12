package finalProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase7 {

public static void testcase9() throws RowsExceededException, WriteException, IOException, BiffException{
	
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
	WM.ClickLinkByID("createNewLabel");
	WM.ClickLinkByText("Campaign");
	WM.setValueById("cpn1","Testcamp7");
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
	WM.setValueById("cpn4","Testcamp1desc");
	WM.ClickLinkByname("save");
	WM.ClickLinkByText("Testcamp7");
	WM.ClickLinkByname("edit");
	WM.setValueById("cpn1","Testcamp1edited");
	WM.ClickLinkByname("save");
	WM.logout();
}
	public static void main(String[] args) throws RowsExceededException, WriteException, BiffException, IOException {
		testcase9();

	}

}
