package HomeWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SandboxChecklistSort {

public static void sortchecklist() throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://sandbox.checklist.com/");
	driver.findElement(By.name("j_username")).sendKeys("writetonirmalnathan@gmail.com");
	driver.findElement(By.name("j_password")).sendKeys("143555");
	driver.findElement(By.name("login")).click();
//Create Checklist			
	int i ;
		for(i=1;i<=4;i++)
	{
				int k=i;
				String A = Integer.toString(k); 
				String Val =(A+"checklist");
				Thread.sleep(5000);
				driver.findElement(By.id("addNewCL")).click();
				driver.findElement(By.id("newCheckListName")).sendKeys(Val);
				WebElement E = driver.findElement(By.linkText("Create"));
				if (E.isEnabled())
				driver.findElement(By.linkText("Create")).click();
				else
				Thread.sleep(3000);
				System.out.println(Val);
	}
	driver.findElement(By.id("newTaskName")).clear();
	driver.findElement(By.id("newTaskName")).sendKeys("Task1");
	
}
	public static void main(String[] args) throws InterruptedException 
	{
		sortchecklist() ;

	}

}

