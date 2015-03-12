package HomeWorks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrainsAfter6PM {

	public static void trainsWithTime(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://erail.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
		driver.findElement(By.id("txtStationTo")).sendKeys("tpj");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList']")); 
		List<WebElement> WD = table.findElements(By.tagName("tr"));
		int Rowcnt=WD.size(),i;
		System.out.println(Rowcnt);
				
		for (i=0;i<Rowcnt;i++)
		{
				String timing=WD.get(i).findElements(By.tagName("td")).get(4).getText();
				String trainName=WD.get(i).findElements(By.tagName("td")).get(1).getText();
				double arivaltime = Double.parseDouble(timing); 
				if (arivaltime>=18){
					System.out.println("Trains that start after 6 Pm are " + "  " + trainName);
				}
				
		}
	} 
	public static void main(String[] args) {
	
		trainsWithTime();
	}

}
