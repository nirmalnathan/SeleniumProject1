package HomeWorks;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChrmDriver {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Test leaf\\Selenium Training\\Drivers\\chromedriver.exe");
		WebDriver Chrome1=new ChromeDriver();
		Thread.sleep(3000);
		Chrome1.get("http://www.ebay.in/");
		System.setProperty("webdriver.ie.driver","F:\\Test leaf\\Selenium Training\\Drivers\\IEDriverServer.exe");
		WebDriver D1=new InternetExplorerDriver();
		D1.get("https://google.com");
		

	}

}
