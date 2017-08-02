package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class links {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.moebel.de/betatesting.php");
		driver.manage().window().maximize();
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 
		Thread.sleep(5000L);
		WebElement we= driver.findElement(By.xpath("//div [@id='page']"));  
		System.out.println(we.findElements(By.tagName("a")).size()) ; 
		int i = we.findElements(By.tagName("a")).size(); 
		for (int j = 1; j<i; j++){
			we= driver.findElement(By.xpath("//div [@id='page']"));   // We are re-creating "footer" webelement as DOM changes after navigate.back()
			we.findElements(By.tagName("a")).get(j).getText();
			we.findElements(By.tagName("a")).get(j).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("404")) {
				System.out.println("404 Found");
			} 
			driver.navigate().back();
            Thread.sleep(4000);
 		}
 	}
}
 
