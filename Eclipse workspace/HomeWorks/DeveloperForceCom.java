package HomeWorks;




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DeveloperForceCom 
{
	
				
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver1 = SuperClass.driver;
		driver1.get("http://developer.force.com/");
		SuperClass.clickLink("JOIN NOW");
		SuperClass.setTextBox("first_name","Nirmal");
		SuperClass.selectListById(driver1.findElement(By.id("job_role")),3);
		Thread.sleep(15000);
		SuperClass.snap();
		
		SuperClass.snap();
		SuperClass.setTextBox("last_name","Nathan");
		SuperClass.snap();
		SuperClass.setTextBox("email","nirmal@gmail.com");
		SuperClass.snap();
		SuperClass.setTextBox("company","Jamcracker");
		SuperClass.snap();
		SuperClass.setTextBox("postal_code","614903");
		SuperClass.snap();
		SuperClass.setTextBox("username","nirmalnathan");
		SuperClass.snap();
		SuperClass.selectListById(driver1.findElement(By.id("job_role")),3);
		SuperClass.snap();
		SuperClass.selectListByName(driver1.findElement(By.id("country")), "United Kingdom");
		SuperClass.snap();
		SuperClass.clickId("eula");
		SuperClass.snap();
		SuperClass.clickId("submit_btn");
		SuperClass.snap();
		driver1.close();
	}
}
	
	