package myPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		//process  from starting to last page when user is not already registered.
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dev.homesofa.de/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@id='block_top_menu']/div[2]/div/nav/ul/li/a")).click();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("scroll(0, 600)");
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//div[@id='block_top_menu']/div[2]/div/nav/ul/li/a"));
		action.moveToElement(we).build().perform();
		
	}
}
