package finalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
	WebDriver driver = null;
	public WebDriver selectBroswer(String browserName){
		
		switch(browserName){
		case("Firefox"):
		driver = new FirefoxDriver();
		break;
		case ("Chrome"):
			System.setProperty("webdriver.chrome.driver","F:\\Test leaf\\Selenium Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		case ("IE"):
			System.setProperty("webdriver.chrome.driver","F:\\Test leaf\\Selenium Training\\Drivers\\IEDriverServer.exe");
		driver = new ChromeDriver();
		break;
		}
		return driver;
	}
}
