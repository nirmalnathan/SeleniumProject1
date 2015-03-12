package HomeWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GoogleLogout {
public static void googleout() throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://gmail.com");
	driver.findElement(By.id("Email")).sendKeys("writetonirmalnathan");
	driver.findElement(By.id("Passwd")).sendKeys("goldfilter");
	driver.findElement(By.id("signIn")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[@class='gb_K gbii']")).click();
	}
public static void main(String[] args) throws InterruptedException {
	googleout();
	}
}
 