import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */

/**
 * @author nnathan
 *
 */


public class RegisterJsdn {
	
	
	
	
	
	
	public static void selectlistboxbyid(String elementId,int idToSelectInList){
	
		
	}
	public static void register() throws InterruptedException  	{

		WebDriver driver = new FirefoxDriver();		
		driver.get("https://nigact.mtnmkt.com/jsdn/guest/storeHome.action");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,10);		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("REGISTER")));
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("email")).sendKeys("admin@test.com");
		driver.findElement(By.id("contactPhone")).sendKeys("21323");
		driver.findElement(By.id("companyName")).sendKeys("test");
		driver.findElement(By.id("address1")).sendKeys("test");
		driver.findElement(By.id("address2")).sendKeys("test");
		driver.findElement(By.id("phone")).sendKeys("12345");
		WebElement L = driver.findElement(By.id("country")); 
		Select countrylistbox = new Select(L);
		countrylistbox.selectByIndex(1);
		WebElement L1 = driver.findElement(By.id("state")); 
		Select statelistbox = new Select(L1);
		statelistbox.selectByIndex(2);
		driver.findElement(By.id("city")).sendKeys("test");
		driver.findElement(By.id("zip")).sendKeys("1234");
		WebElement L2 = driver.findElement(By.id("timeZone")); 
		Select timezonelist= new Select(L2);
		timezonelist.selectByIndex(1);
		driver.findElement(By.id("i_agree")).click();
				
	} 
		
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		register();

	}
}
