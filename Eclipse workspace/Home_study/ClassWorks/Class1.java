package ClassWorks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Class1 {
	
	public static void main(String[] args) throws IOException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	//Screen shot	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,  new File("D:\\1.png"));
	driver.findElement(By.name("q")).sendKeys("Nirmal");
	driver.close();

	}

}
