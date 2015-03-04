package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipKartKidsShirt {
	public static void kidsshirt() throws InterruptedException{
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://flipkart.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Baby & Kids']")))
		.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'hp_nmenu_sub_baby-kids_0_Shirts')]")))
		.click().build().perform();
		WebElement E = driver.findElement(By.x path("//span[@class='items']"));
		System.out.println("Total Number of shirt available" +"   " + E.getText());
		WebElement S1=driver.findElement(By.id("sort-dropdown"));
		Select S = new Select(S1);
		S.selectByIndex(1);		
		Thread.sleep(3000);
		String A;
		A = driver.findElement(By.xpath("//a[@class='fk-display-block']")).getText();
		System.out.println("The name of costly shirt is "+ "  "+ A);
		driver.close();
		
		
		
	} 
	public static void main(String[] args) throws InterruptedException {
		kidsshirt();
	}

}
