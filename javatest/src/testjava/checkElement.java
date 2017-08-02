package testjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkElement {
	WebDriver driver; 
	static String url= "http://www.gmail.com";
	public static void main(String[] args) throws Exception {
		checkElement ce= new checkElement();
		ce.launchbrowser(url);
		ce.checkElementmethod();
		ce.closebrowser();
	}
	public  void launchbrowser(String url)
	{
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void checkElementmethod() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("lst-ib")).sendKeys("WebDriver"); 
		if(driver.findElements(By.name("btnK")).size() != 0 )
		{
			 driver.findElement(By.name("btnK")).click();  
		     System.out.println("element exists");    
		}
		Thread.sleep(5000);
	}
	public  void closebrowser()
	{
		driver.close();
	}

}
