package myPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC04 {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://staging.homesofa.de/ecksofa/816-barbara.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button [@id='addtocart_btn']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div [@id='common-popuu-data']/div[1]/a/span")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div [@id='center_column']/div[2]/div/div[2]/div[3]/button")).click();
		//driver.findElement(By.id("customer_firstname")).sendKeys("QA");
		//driver.findElement(By.id("customer_lastname")).sendKeys("QA");
		//driver.findElement(By.id("email")).sendKeys("qa@qa.com");
		//driver.findElement(By.id("passwd")).sendKeys("123456");
		//driver.findElement(By.id("company")).sendKeys("qa");
		//driver.findElement(By.id("address1")).sendKeys("aaa 123");
		//driver.findElement(By.id("postcode")).sendKeys("12345");
		//driver.findElement(By.id("city")).sendKeys("55555");
		//driver.findElement(By.id("phone")).sendKeys("55555555");
		//driver.findElement(By.id("submitAccount")).click();
		//driver.findElement(By.id("cgv")).click();
		//driver.findElement(By.id("final_checkout")).click();
		
		
	}

}
