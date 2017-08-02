package myPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC02 {

	
	public static void main(String[] args) {
		//process  from starting to last page when user is not already registered.
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dev.homesofa.de/")	;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='block_top_menu']/div[2]/div/nav/ul/li/a")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 600)");
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//div [@id='proudct_816']/div[1]/div[1]/div[2]/div/p"));
		action.moveToElement(we).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//img [@id='mainhover_816']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button [@id='addtocart_btn']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		
		
		//driver.findElement(By.id("addtocart_btn")).click();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//driver.findElement(By.id("user_cart_id")).click();
					

	}

}
