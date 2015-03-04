package HomeWorks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import finalProject.ExcelReporter;

public class HandsOn {


	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException, InterruptedException {
 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("testing",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL,"X");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("test",Keys.ENTER);

		
		driver.manage().window().maximize();
						
		//File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //FileUtils.copyFile(src1, new File("D:\\sandbox"+"google111"+".png"));
	    //driver.close();
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);*/
		/*File F = new File("C:\\Project1\\Results\\Results.xls");
		Workbook wd = Workbook.getWorkbook(F);
		Sheet s1 = wd.getSheet(0);
		int Rowcount=s1.getRows();
		String A = s1.getCell(3,6).getContents();
		System.out.println(A);*/
		/*ExcelReporter ER = new ExcelReporter();
		ER.createWorkSheet();
		ER.addHeader();
		ER.repotstep("test", "fail");
		WritableWorkbook wwb;
		WritableSheet wws;
		wwb = Workbook.createWorkbook(new File ("D:\\test1.xls")) ;
		wws = wwb.createSheet("Results", 0);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Label l1 = new Label(0,0,"WWW.google.com");
		wws.addCell(l1);
		wwb.write();
		wwb.close();
		
*/		

	}

}
