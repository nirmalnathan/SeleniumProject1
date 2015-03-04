package ClassWorks;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;


public class SandBoxTest {
	
WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String user, String pass) throws InterruptedException {
	  
	  	  
	  driver.findElement(By.id("loginLink")).click();
	    driver.findElement(By.name("j_username")).clear();
	    driver.findElement(By.name("j_username")).sendKeys(user);
	    driver.findElement(By.name("j_password")).clear();
	    driver.findElement(By.name("j_password")).sendKeys(pass);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(10000);

  }

  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
      capabilities.setPlatform(Platform.WINDOWS);
      //capabilities.setCapability("version", "8");
      	driver = new RemoteWebDriver(new URL("http://nirmalnathan:e1d8ce84-a714-46c5-9d5c-ee283117e5dd@ondemand.saucelabs.com:80/wd/hub"), capabilities);
		driver.get("http://sandbox.checklist.com");
		
  }

  @AfterMethod
  
  public void afterMethod() {
	  
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    Object [] [] dp = {{"writetonirmalnathan@gmail.com","143555"}};
  return dp;
  }
  
  }

