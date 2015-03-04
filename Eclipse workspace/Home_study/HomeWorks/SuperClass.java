package HomeWorks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SuperClass 
{
	public static int i=1;
	public static WebDriver driver = new FirefoxDriver();

public static void main(String[] args)


 {
	driver.get("https://events.developerforce.com/signup?d=70130000000EjHb");
setTextBox("first_name","nirmal");
}

public static void clickname(String name)
{
driver.findElement(By.name(name)).click();
}
public static void clickLink(String webel)
	{
	driver.findElement(By.linkText(webel)).click();
	}
public static void clickId(String id2)

{
	
driver.findElement(By.id(id2)).click() ;	
}
public static void clickXpath(String classname)
{
driver.findElement(By.xpath(classname)).click();

}
public static void setTextBox(String id1,String value)
	{		
	driver.findElement(By.id(id1)).sendKeys(value);
	}
public static void setTextBoxbyname(String name1,String value)
{		
driver.findElement(By.name(name1)).sendKeys(value);
}
public static void selectListById(WebElement id , int ind)

{
	System.out.println(driver);
	Select dropdown1 = new Select(id) ;
	dropdown1.selectByIndex(ind);
}		
public static void selectListByName(WebElement id , String ctry)
{
	
	Select dropdown2 = new Select(id);
	dropdown2.selectByVisibleText(ctry);
}
public static void snap () throws IOException, InterruptedException
	{
	Thread.sleep(5000);
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,  new File("D:\\test"+i+".png"));
	i++;	
	}	
}			

