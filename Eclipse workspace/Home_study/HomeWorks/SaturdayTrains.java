package HomeWorks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SaturdayTrains {

public static void trainsOnWed(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://erail.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("txtStationFrom")).sendKeys("ms");
	driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
	driver.findElement(By.id("txtStationTo")).sendKeys("tpj");
	driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
	WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList']")); 
	List<WebElement> WD = table.findElements(By.tagName("tr"));
		int i,j;
	int NOR=WD.size();
	
	
	for(i=0;i<NOR;i++){
		String Out1 = "";
			
 			String YesOrNoWed=WD.get(i).findElements(By.tagName("td")).get(11).getText();
 			if (YesOrNoWed.equalsIgnoreCase("Y"));
 			for (j=9;j<=15;j++)
			{
				
 				String YesOrNo=WD.get(i).findElements(By.tagName("td")).get(j).getText();
				Out1 = Out1+YesOrNo;
				if (Out1.equals("xxxxxYx")){
				String Tname=WD.get(i).findElements(By.tagName("td")).get(1).getText();
				System.out.println("Train that runs only on saturday " +Tname);
				}
					
	
			}
	}
}
	public static void main(String[] args) {
		trainsOnWed();

	}

}
