package finalProject;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
/*import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import jxl.Cell;*/
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


//import com.sun.mail.pop3.POP3Store;

public class WrapperMethods  {
//Mail server initialization
int screenshotcount=1;	
public WebDriver driver;
ExcelReporter eR = new ExcelReporter();
String Filename = "C:\\Project1\\data\\Testcasefile.xls";
	
public WrapperMethods(WebDriver driver1){
	driver=driver1;
	
	}

public  void launchURL (String URL){
	driver.get(URL);
	
}
public WebElement findEle(String  byVal, String byTex){

		WebElement ele = null;
		try 
		{
			switch (byVal) {
			case "id": 
				ele = driver.findElement(By.id(byTex));
				break;
			case "name" :
				ele = driver.findElement(By.name(byTex));
				break;
			case "Xpath" :
				ele = driver.findElement(By.xpath(byTex));
				break;
			case "Linktext" :
				ele = driver.findElement(By.linkText(byTex));
				break;
			case "Class" :
			ele = driver.findElement(By.className(byTex));
							}
				
		} 
		
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			
		}
		return ele;
		
	}
public boolean setValue (WebElement ele, String value) throws IOException, RowsExceededException, WriteException{
		try {
			ele.clear();
			ele.sendKeys(value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			takeSnap();
			return false;
		}
	}
public void setValueById(String val, String text) throws IOException, RowsExceededException, WriteException

{
		try {
		
			WebElement elee = findEle("id", val);
			setValue(elee, text);
			} catch (Exception e) {
			e.printStackTrace();
			takeSnap();
		}
	}
public boolean setValueByName(String val, String text) throws IOException, RowsExceededException, WriteException
{
		WebElement elee = findEle("name", val);
		setValue(elee, text);
		return false;
	}
public boolean setValueByXpath(String val, String text) throws IOException, RowsExceededException, WriteException
{
		WebElement elee = findEle("Xpath", val);
		setValue(elee, text);
		return false;
	}
public Select findListbyid(String Value) throws RowsExceededException, WriteException, IOException
	{
	try 
			{
				WebElement ele = findEle("id",Value);
				Select dropdwn= new Select(ele);
				return dropdwn;		
			} 
		catch (Exception e) 
			{
				System.out.println(e);
				takeSnap();
				return null;		
			}
	}
public Select findListByName(String Value) throws RowsExceededException, WriteException, IOException
{
try 
		{
			WebElement ele = findEle("name",Value);
			Select dropdwn= new Select(ele);
			return dropdwn;		
		} 
	catch (Exception e) 
		{
			System.out.println(e);
			takeSnap();
			return null;		
		}
}
public boolean selectListByIndex(String id,int index) throws  WriteException, IOException{
		try {
			Select drpdwn= findListbyid(id);
			drpdwn.selectByIndex(index);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			takeSnap();
			return false;
		}
		
}
public boolean selectListByValue(String ID,String Value,String svalue) throws RowsExceededException, WriteException, IOException{

	try {
		Select drpdwn= findListbyid(Value);
		drpdwn.selectByValue(svalue);
		return true;
	} catch (Exception e) {
		System.out.println(e);
		takeSnap();
		return false;
	}
	
}
public boolean selectListByVisibleTxt(String ID,String Value,String svvalue) throws RowsExceededException, WriteException, IOException{
	try {
		Select drpdwn= findListbyid(Value);
		drpdwn.selectByValue(svvalue);
		return true;
	} catch (Exception e) {
		System.out.println(e);
		takeSnap();
		return false;
	}
	
}
public boolean SelectCheckBox(WebElement ele) throws RowsExceededException, WriteException, IOException{
	try {
		ele.click();
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		takeSnap();
		return false ;
		
	}
}
public boolean SelectCheckBoxByID(String Value) throws RowsExceededException, WriteException, IOException{
	try {
		WebElement elee = findEle("id", Value);
		SelectCheckBox(elee);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		takeSnap();
		return false;
	}
	
}
public boolean SelectCheckBoxByName(String name, String Value){
	try {
		WebElement elee = findEle("name", Value);
		SelectCheckBox(elee);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	
}
public boolean ClickLink(WebElement Cli) throws RowsExceededException, WriteException, IOException{
try {
	Cli.click();
	return true;
} catch (Exception e) {
	takeSnap();
	e.printStackTrace();
	return false;
}
}

public boolean ClickLinkByclass(String value) throws IOException{
	try {
		WebElement elee = findEle("Class" , value);
		ClickLink(elee);
		return true;
	} catch (Exception e) {
		takeSnap();
		e.printStackTrace();
		return false;
	}
}

public boolean ClickLinkByText(String value) throws IOException{
	
	try {
		WebElement elee = findEle("Linktext" , value);
		ClickLink(elee);
		return true;
	} catch (Exception e) {
		takeSnap();
		e.printStackTrace();
		return false;
	}
}

public boolean ClickLinkByname(String value) throws IOException{
	try {
		WebElement elee = findEle("name" , value);
		ClickLink(elee);
		return true;
	} catch (Exception e) {
		takeSnap();
		e.printStackTrace();
		return false;
	}
}
public boolean ClickLinkBynameExpHandle(String value) throws IOException{
	try {
		WebElement elee = findEle("name" , value);
		ClickLink(elee);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}

public void alertAccept() {
	driver.switchTo().alert().accept();
}

public void alertDismiss() {
	driver.switchTo().alert().dismiss();
}
public boolean ClickLinkByID(String value) throws IOException{
	try {
		WebElement elee = findEle("id" , value);
		ClickLink(elee);
		return true;
	} catch (Exception e) {
		takeSnap();
		e.printStackTrace();
		return false;
	}
}

public void takeSnapremote() throws IOException, RowsExceededException, WriteException{
		//Take snap
    File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src1, new File("D:\\sandbox"+ eR.Rowcount+".png"));
}
public void takeSnap() throws IOException{
		//Take snap
		int screenshotcount=1 ;
	    File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src1, new File("D:\\sandbox"+screenshotcount+".png"));
	    screenshotcount++;
	    	    
	}
public  String readXl(int i,int j,String Filename) throws BiffException, IOException{
	
	//File F = new File("F:\\Book2.xls");
	
	File F = new File(Filename);
	Workbook wd = Workbook.getWorkbook(F);
	Sheet s1 = wd.getSheet(0);
	String xlInput =s1.getCell(i,j).getContents();
	return xlInput;
}

public  String readXl(int i,int j) throws BiffException, IOException{
	
	File F = new File(Filename);
	Workbook wd = Workbook.getWorkbook(F);
	Sheet s1 = wd.getSheet(0);
	String xlInput =s1.getCell(i,j).getContents();
	return xlInput;
}


public boolean verifytextpresentbyid(String id,String verificationtext){
	String Element = findEle("id", id).getText();
	if (Element.equalsIgnoreCase(verificationtext))
	return true;
	else
	return false;	
	
	
	
}

public void logout() throws IOException{

	try {
		ClickLinkByID("userNavLabel");
		ClickLinkByText("Logout");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		takeSnap();
		e.printStackTrace();
	}
}
public void login () throws RowsExceededException, WriteException, IOException, BiffException {
	
	Filename= "C:\\Project1\\data\\TestDataForProject.xls";
	String userEmail= readXl(0,0,Filename);
	setValueById("username", userEmail);
	String userpass= readXl(1,0);
	setValueById("password", userpass);
	ClickLinkByclass("label");
	
}

public int getlistboxsizebyid(String listboxid){
	WebElement Selectboxele = findEle("id",listboxid);
	Select view = new Select(Selectboxele);
	List <WebElement> l1= view.getOptions();
	int numberoflistele = l1.size();
	return numberoflistele;
}

public void implicitwait(int unitsinsec){
	
	driver.manage().timeouts().implicitlyWait(unitsinsec,TimeUnit.SECONDS);
}

public WebElement selecttablebyclass(String classNameOfTable){
	WebElement table = findEle("Class", classNameOfTable);
	return table;
		
}






//wrappper Class close
}

	


