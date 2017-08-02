package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

	
	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		   driver.get("https://www.moebel.de/");
		   driver.findElement(By.className("login-text")).click();
		   
		   driver.findElement(By.xpath(".//[conains(text,'Mit E-Mail-Adresse anmelden')]")).click();
		   driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		   driver.findElement(By.name("reg_email")).sendKeys("ankush@gmail.com");
		   
		//driver.findElement(By.xpath(".//[conains(text,'Mit E-Mail-Adresse anmelden')]")).click();
		}
}
