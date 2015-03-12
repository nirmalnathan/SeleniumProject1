package ClassWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributesCss {


	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.irctc.co.in/cgi-bin/bv60.dll/irctc/services/register.do?click=true");
driver.findElement(By.name("userName")).sendKeys("nial85");
driver.findElement(By.name("userName")).sendKeys(Keys.TAB);
driver.findElement(By.linkText("Check Availability")).click();
WebElement R =driver.findElement(By.id("result"));
System.out.println(R);
System.out.println(R.getCssValue("color"));
/*System.out.println(Clr);*/




	}

}
