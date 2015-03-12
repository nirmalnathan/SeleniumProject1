package ClassWorks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.browserlaunchers.Sleeper;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingElement {

	
	public static void main(String[] args) {
	
	
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	Sleeper s = new Sleeper ();
		List<WebElement> el =driver.findElements(By.cssSelector("*"));
		for(WebElement web: el)
				{
		String name = web.getText();
				System.out.println(name);
	}
		driver.close();	
	}
}
