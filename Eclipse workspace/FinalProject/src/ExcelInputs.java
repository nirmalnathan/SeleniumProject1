package finalProject;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelInputs {
public static void main(String[] args) throws BiffException, IOException, InterruptedException {
WebDriver driver = new FirefoxDriver();
File F = new File("F:\\Book2.xls");
Workbook wd = Workbook.getWorkbook(F);
Sheet s1 = wd.getSheet(0);
int i;
driver.get("http://test.jiatro.com/mhs/");
for (i=1;i<=2;i++)
{
String A= s1.getCell(0,i).getContents();
String B = s1.getCell(1,i).getContents();
driver.findElement(By.id("land_username")).sendKeys(A);
driver.findElement(By.name("txtPassword")).sendKeys(B);
driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(5000);
}
driver.close();
}
}
