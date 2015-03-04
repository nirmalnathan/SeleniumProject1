package finalProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {
	
	
	public static void testcase1() throws RowsExceededException, WriteException, IOException, BiffException{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WrapperMethods WM= new WrapperMethods(driver);
		WM.launchURL("http://www.developerforce.com/events/regular/registration.php");
		WM.setValueById("first_name", "Nirmal");
		WM.setValueById("last_name", "Nathan");
//read user name from xl file
		String userEmail= WM.readXl(0,0);
		WM.setValueById("email", userEmail);
		WM.selectListByIndex("job_role", 1);
		WM.setValueById("company", "Jamcracker");		
		WM.selectListByIndex("country", 1);
		WM.setValueById("postal_code", "614903");
		WM.setValueById("username", userEmail);
		WM.SelectCheckBoxByID("eula");

		}

	
	public static void main(String[] args) throws RowsExceededException, WriteException, BiffException, IOException {
			testcase1();

	}

}
