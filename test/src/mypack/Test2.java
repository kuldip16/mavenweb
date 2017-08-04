package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

   public static void main(String[] args)
   {
	   WebDriver driver= new FirefoxDriver();
	   driver.get("https://www.moebel.de/");
	   driver.findElement(By.className("login-text")).click();
	   driver.findElement(By.xpath(".//[conains(text,'Mit E-Mail-Adresse anmelden')]"));
	   driver.findElement(By.name("reg_email")).sendKeys("ankush@gmail.com");
	   System.out.println("test");
   }
	
}
