package ClassWorks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import finalProject.ExcelReporter;

public class TestSuite {


public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		WebDriver driver = new FirefoxDriver();
		ExcelReporter er = new ExcelReporter();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		er.createWorkSheet();
		er.addHeader();
		driver.get("http://test.jiatro.com/mhs");
		String Title = driver.getTitle();
			if (Title.equalsIgnoreCase("MyHealthSocial : Build Your Community of Health Support Groups Online to Seek or Provide Health Advice"))
			er.repotstep("LaunchURL", "Pass");
			else
			er.repotstep("LaunchURL", "Fail");
		driver.findElement(By.id("land_username")).sendKeys("babu@testleaf.com");
		driver.findElement(By.name("txtPassword")).sendKeys("test@123");
		driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
		String Title1 = driver.getTitle();
			if (Title1.equalsIgnoreCase("Home"))
			er.repotstep("Login", "Pass");
			else
			er.repotstep("Login", "Fail");

		
		driver.findElement(By.linkText("Logout")).click();
			String Title3 = driver.getTitle();
			if (Title3.equalsIgnoreCase("MyHealthSocial : Build Your Community of Health Support Groups Online to Seek or Provide Health Advice"))
			er.repotstep("Logout", "Pass");
			else
			er.repotstep("Logout", "Fail");
		er.createResultFile();		
	}

}
