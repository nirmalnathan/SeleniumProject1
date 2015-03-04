package ClassWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreadClass 

{
	public static void main(String[] args) 
	{
		/*Runnable R1 = new FF();
		Runnable R2= new FF1();*/
		FF f = new FF();
		Thread T0 = new Thread(f);
		Thread T1 = new Thread();
		//T0.start();	
		T0.run();
		T1.start();
	}	
	
}

	class FF extends Thread //implements Runnable

	{
		@Override
		public void run()
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("http://test.jiatro.com/mhs");
			driver.findElement(By.id("land_username")).sendKeys("cynthia@testleaf.com");
			driver.findElement(By.name("txtPassword")).sendKeys("test@123");
			driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
			try 
			{
				Thread.sleep(5000);
			} catch (InterruptedException e) 
			
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.linkText("Logout")).click();
			try 
			{
				Thread.sleep(5000);
			} catch (InterruptedException e) 
			
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}
	
	}
class FF1 implements Runnable

	{
		 @Override
		 public void run()
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("http://test.jiatro.com/mhs");
			driver.findElement(By.id("land_username")).sendKeys("babu@testleaf.com");
			driver.findElement(By.name("txtPassword")).sendKeys("test@123");
			driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
			driver.close();
			try 
			{
				Thread.sleep(5000);
			} catch (InterruptedException e) 
			
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
			try 
			{
				Thread.sleep(5000);
			} catch (InterruptedException e) 
			
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}
		
		
	}
		



	 
	


