package ClassWorks;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.j2bugzilla.*;





import com.thoughtworks.selenium.Selenium;
public class WindowHandling {
	public static void main (String args[]) throws InterruptedException
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.crystalcruises.com");
		driver.findElement(By.linkText("GUEST CHECK-IN")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String win : windows)
		{
			driver.switchTo().window(win);
			if (win.equals("Crystal Cruises"))
					break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("nrFirstName")).sendKeys("name");
		driver.findElement(By.id("nrLastName")).sendKeys("Lname");
		driver.findElement(By.id("nrEmailAddress")).sendKeys("nameemail");
		driver.findElement(By.linkText("Review")).click();
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.getTitle();
		driver.close();
	}
}
