package finalProject;

import java.util.List;
import java.io.IOException;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenaio1 {

public static void scenarioone() throws RowsExceededException, WriteException, BiffException, IOException{
	WebDriver driver = new FirefoxDriver();
	WrapperMethods WM= new WrapperMethods(driver);
	WM.implicitwait(30);
	WM.launchURL("https://login.salesforce.com/");
	WM.login();
	WM.ClickLinkByText("Campaigns");
	int i = WM.getlistboxsizebyid("fcf");
	System.out.println(i);
	WM.selectListByIndex("fcf",i-2);
	WM.ClickLinkByText("Campaigns");
	WebElement table = WM.selecttablebyclass("list");
	List <WebElement> row = table.findElements(By.tagName("tr"));
	int rowsize = row.size();
	for (i=1;i<=rowsize-1;i++)
	{
	List <WebElement> column = row.get(i).findElements(By.tagName("th"));
	String Campname = column.get(0).getText();
	System.out.println(Campname);
	}
	
	
	
	
	
	
	
	
	
} 
	public static void main(String[] args) throws RowsExceededException, WriteException, BiffException, IOException {
		scenarioone() ;
		

	}

}
