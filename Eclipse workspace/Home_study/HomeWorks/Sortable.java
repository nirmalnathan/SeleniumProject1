package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

public static void sort(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://jqueryui.com/sortable/");
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	Actions action = new Actions(driver);
	WebElement E1= driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
	//WebElement E2= driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
	action.dragAndDropBy(E1, 100, 50);
	//action.dragAndDrop(E1, E2).build().perform();
}
	public static void main(String[] args) {
		sort();

	}

}
