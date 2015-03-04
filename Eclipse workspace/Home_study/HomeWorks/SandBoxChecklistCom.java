package HomeWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SandBoxChecklistCom {


	public static void main(String[] args) {
		
		WebDriver driver3 = SuperClass.driver; 
		driver3.get("http://sandbox.checklist.com");
		driver3.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		SuperClass.clickLink("Register");
		SuperClass.setTextBox("email", "Nirmal@gmail.com");
		SuperClass.setTextBox("pass", "Root123");
		SuperClass.setTextBox("name", "Nirmal");
		SuperClass.selectListById(driver3.findElement(By.id("country")), 1);
		SuperClass.clickname("reg");

	}

}
