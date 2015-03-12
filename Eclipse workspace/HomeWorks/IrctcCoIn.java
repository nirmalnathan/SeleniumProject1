package HomeWorks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class IrctcCoIn 
{
	
public static void main(String[] args) throws IOException, InterruptedException {
	
			
		WebDriver driver2 = SuperClass.driver;
		driver2.get("https://www.irctc.co.in/");
		Thread.sleep(10000);
		SuperClass.clickLink("Signup");
		SuperClass.snap();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SuperClass.setTextBoxbyname("userName", "Nirmal");
		SuperClass.selectListById(driver2.findElement(By.name("question")),1);
		SuperClass.snap();
		SuperClass.setTextBoxbyname("answer","dog");
		SuperClass.snap();
		SuperClass.setTextBoxbyname("firstName", "Nirmal");
		SuperClass.snap();
		SuperClass.setTextBoxbyname("lastName", "Nathan");
		SuperClass.snap();
		SuperClass.selectListById(driver2.findElement(By.name("gender")),1);
		SuperClass.selectListById(driver2.findElement(By.name("maritalStatus")),1);
		SuperClass.setTextBoxbyname("email", "Nathan@mail.com");
		SuperClass.setTextBoxbyname("mobile", "9789815716");
		SuperClass.selectListById(driver2.findElement(By.name("day")),7);
		SuperClass.selectListById(driver2.findElement(By.name("month")),5);
		SuperClass.selectListById(driver2.findElement(By.name("year")),5);
		SuperClass.selectListByName(driver2.findElement(By.name("occupation")),"Public");
		SuperClass.selectListByName(driver2.findElement(By.name("nationality")),"India");
		
		SuperClass.snap();
		SuperClass.setTextBoxbyname("resAddress1", "add1");
		SuperClass.snap();
		SuperClass.setTextBoxbyname("resAddress2", "add2");
		SuperClass.snap();
		SuperClass.setTextBoxbyname("resAddress3", "add3");
		SuperClass.snap();
		SuperClass.selectListByName(driver2.findElement(By.name("resCountry")),"India");
		SuperClass.setTextBoxbyname("resPinCode", "614903");
		driver2.findElement(By.name("resPinCode")).sendKeys(Keys.TAB);
		driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		SuperClass.snap();
		Thread.sleep(5000);
		SuperClass.selectListById(driver2.findElement(By.name("resCity")),1);
		SuperClass.setTextBoxbyname("resPhone", "9789815716");
		SuperClass.clickId("rdresyes");
		SuperClass.clickXpath("//input[@name='newsRadio' and @value='1']");
		SuperClass.clickXpath("//input[@name='speRadio' and @value='1']");
		SuperClass.clickXpath("//input[@name='telRadio' and @value='0']");
		SuperClass.snap();
	}

}
