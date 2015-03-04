package ClassWorks;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebTableSample {
public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://erail.in");
driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.TAB);
driver.findElement(By.id("txtStationTo")).sendKeys("TJ",Keys.TAB);
WebElement table= driver.findElement(By.xpath("//Table[@class ='DataTable TrainList']"));
List <WebElement> row = table.findElements(By.tagName("tr"));
List <WebElement> column= row.get(1).findElements(By.tagName("td"));
//Int rowsize = row.size();
//System.out.println(columnsize);
String text2 = column.get(8).getText();
System.out.println(text2);
//Fir clicking the link in a cell
/*System.out.println("Train name " + row.get(rowsize-1).fndElements(By.tagName("td")).get(1).getText());
row.get(rowsize-1).findElements(By.tagName("td")).get(1).findElement(By.tagName("a")).click();
//If the table column contain more than 1 link then use the below code 
String text1 = row.get(rowsize-1).findElements(By.tagName("td")).get(1).findElements(By.tagName("a")).get(0).getText();
System.out.println(text1);*/
	}

}
