package mypack1;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch {

	WebDriver driver;
	String url;
	@Before
	public void launchbrowser(){
		driver = new FirefoxDriver();
		url = "https://www.google.co.in/";
		driver.manage().window().maximize();
		driver.get(url);
		}
	@Test 
	public void attest()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		driver.findElement(By.xpath("//button [contains(@value,'Search')]")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	
		try{
			Thread.sleep(3000);
			for( String winhandle : driver.getWindowHandles());
			{
			driver.switchTo().window("winhandle");	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
