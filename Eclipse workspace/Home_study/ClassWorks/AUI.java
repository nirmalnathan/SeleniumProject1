package ClassWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AUI {


	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();

driver.get("http://jqueryui.com/selectable/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
Actions action = new Actions(driver);
WebElement E1 =driver.findElement(By.xpath("//ol[@id='selectable']/li[2]"));
WebElement E2 =driver.findElement(By.xpath("//ol[@id='selectable']/li[4]"));
action.keyDown(Keys.CONTROL).click(E1).click(E2).keyUp(Keys.CONTROL).build().perform();
	}

}
