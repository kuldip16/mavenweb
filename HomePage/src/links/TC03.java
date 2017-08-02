package links;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03 {


	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://staging.homesofa.de/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div [@id='TopItems']/div/div/nav/ul/li[2]/ul/li[3]/a")).click();
		// To scroll down the page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000)");
		String title = driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().contains("Lieferung - homesofa"))
		{
		System.out.println("Test Case Passed");}
		else 
		{
		System.out.println("Test Case Failed");}
		driver.quit();
		}


}
