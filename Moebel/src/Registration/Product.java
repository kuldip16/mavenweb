package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class Product {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.moebel.de/betatesting.php");
		driver.manage().window().maximize();
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 
		WebElement header = driver.findElement(By.xpath("//div [@id ='header-menu-container']"));  
		System.out.println(header.findElements(By.tagName("a")).size()) ;
		int i = header.findElements(By.tagName("a")).size();
		for(int j = 0;j<i;j++){
			header= driver.findElement(By.xpath("//div [@id ='header-menu-container']"));  
			header.findElements(By.tagName("a")).get(j).getText();
			header.findElements(By.tagName("a")).get(j).click();
			Thread.sleep(4000);
			System.out.println(driver.getTitle());	
			if(driver.getTitle().contains("404")) {
				System.out.println("404 Found");
			} 
            driver.navigate().back();
			Thread.sleep(4000);
		}
	}
}




