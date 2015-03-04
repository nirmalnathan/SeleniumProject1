package HomeWorks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class SandboxTasksort {
public static void task() throws InterruptedException{
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://sandbox.checklist.com/");
			driver.findElement(By.name("j_username")).sendKeys("writetonirmalnathan@gmail.com");
			driver.findElement(By.name("j_password")).sendKeys("143555");
			driver.findElement(By.name("login")).click();
//Create Checklist			
			driver.findElement(By.id("addNewCL")).click();
			driver.findElement(By.id("newCheckListName")).sendKeys("Chklist1");
			driver.findElement(By.linkText("Create")).click();
			Thread.sleep(3000);
//Create Task			
			driver.findElement(By.id("newTaskName")).clear();
			driver.findElement(By.id("newTaskName")).sendKeys("Task1");
			driver.findElement(By.id("addNewTask")).click();
			driver.findElement(By.id("newTaskName")).sendKeys("Task2");
			driver.findElement(By.id("addNewTask")).click();
			driver.findElement(By.id("newTaskName")).sendKeys("Task3");
			driver.findElement(By.id("addNewTask")).click();
			driver.findElement(By.id("newTaskName")).sendKeys("Task4");
			driver.findElement(By.id("addNewTask")).click();
//Getting the first element  			
			List <WebElement> L1 = driver.findElements(By.xpath("//span[@class='taskNameInline']"));
			String F1 = L1.get(0).getText();
			
//Sorting 
			List <WebElement> L2 = driver.findElements(By.xpath("//td[@class='drag']"));
			int j = L2.size();
			System.out.println(j);
			Actions action = new Actions(driver);
			action.click(L2.get(0));
			action.dragAndDrop(L2.get(0), L2.get(j-1)).build().perform();
//Verification of the proper sorting By comparing the first and last element  			
			List <WebElement> L3 = driver.findElements(By.xpath("//span[@class='taskNameInline']"));	
			int i =L3.size();
			String Last = L3.get(i-1).getText();
			if(F1.equalsIgnoreCase(Last))
			System.out.println("Hurrey !!!Properly sorted");
			else 
			System.out.println("Not properly sorted");
//Logout
			driver.findElement(By.xpath("//span[@Class='icons profile']")).click();
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
			
			

}

	
	public static void main(String[] args) throws InterruptedException {
			task();

	}

}
