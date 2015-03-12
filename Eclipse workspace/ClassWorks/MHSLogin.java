package ClassWorks;

import java.net.MalformedURLException;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;


public class MHSLogin {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String user, String pass) throws InterruptedException {
	  	  
		driver.findElement(By.id("land_username")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);

  }

  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
      capabilities.setPlatform(Platform.WINDOWS);
      //capabilities.setCapability("version", "8");
       driver = new RemoteWebDriver(new URL("http://nirmalnathan:e1d8ce84-a714-46c5-9d5c-ee283117e5dd@ondemand.saucelabs.com:80/wd/hub"), capabilities);
       driver.get("http://test.jiatro.com/mhs");
 }

  @AfterMethod
  
  public void afterMethod() {
	  
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
//	  String userEmail= WM.readXl(0,0);
    Object [] [] dp = {{"babu@testleaf.com","test@123"}};
  return dp;
  }
  
  }

