package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableJqry {

public static void resizeelement(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://jqueryui.com/resizable/");
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	Actions action = new Actions(driver);
	action
	.dragAndDropBy(driver.findElement(By.xpath("//div[@Class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")), 100, -50).build().perform();
	
}
	public static void main(String[] args) {
		resizeelement();

	}

}
