package HomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("testing",Keys.RETURN);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
driver.close();

	}

}
