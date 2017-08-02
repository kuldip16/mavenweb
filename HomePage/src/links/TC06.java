package links;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC06 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://staging.homesofa.de/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//header [@id='header']/div[2]/div/div/div[2]/div[3]/div/a/b")).click();
		// To scroll down the page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000)");
		String title  = driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().contains("Bestellung - homesofa"))
		{
		System.out.println("Test case passed");}
		else
		{ 
		System.out.println("test case failed");}
       driver.quit();
	}
	
}
