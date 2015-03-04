package HomeWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropable {

public static void drop(){
	WebDriver driver = new FirefoxDriver();

	driver.get("http://jqueryui.com/droppable/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	Actions action= new Actions(driver);

	WebElement item1 = driver.findElement(By.id("draggable"));

	WebElement item4 = driver.findElement(By.id("droppable"));

	action.dragAndDrop(item1, item4).build().perform();
	//clickAndHold(item1).dragAndDrop(item1, item4).build().perform();
}
	public static void main(String[] args) {
		drop();

	}

}
