package ClassWorks;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crystalcruises {

	
	public static void main(String[] args) {
	int z;
	FirefoxDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.crystalcruises.com/Calendar.aspx");	
	List<WebElement> q = driver.findElementsByLinkText("Get-a-Quote");
	String E = q.get(0).getText();
	z=q.size();
	System.out.println("No of times get quote is aailable is " + z+ E );
	
driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
driver.switchTo().alert().getText();

	}

}
