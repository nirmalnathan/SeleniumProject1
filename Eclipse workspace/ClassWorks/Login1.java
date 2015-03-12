package ClassWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login1 {


	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		String user[]= {"babu@testleaf.com","cynthia@testleaf.com","pradeep@testleaf.com"};
		int i ;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://test.jiatro.com/mhs");
		for (i=0;i<=3;i++)
		{
		driver.findElement(By.id("land_username")).sendKeys(user[i]);
		driver.findElement(By.name("txtPassword")).sendKeys("test@123");
		driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
		
		}

	}

}
