package Registration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Open_Pro_Lis_Page {
	WebDriver driver;
	String url;
	@Before
	public void launchbrowser(){
		driver = new FirefoxDriver();
		url = "https://www.moebel.de/betatesting.php";
		driver.manage().window().maximize();
	}
	@Test
	public void attest() throws InterruptedException{
		driver.get(url);
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='http://www.moebel.de/wohnen']"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.xpath("//a [@href='http://www.moebel.de/wohnen']")).click();
		WebElement wohnen= driver.findElement(By.xpath("//div [@class='category_navigation_bg normalscreenView']"));  
		System.out.println(wohnen.findElements(By.tagName("a")).size()) ; 

		 int i = wohnen.findElements(By.tagName("a")).size(); //Get number of links
		for(int j = 0;j<i;j++){    //create loop based upon number of links to traverse all links 
			wohnen= driver.findElement(By.xpath("//div [@class='category_navigation_bg normalscreenView']"));   // We are re-creating "footer" webelement as DOM changes after navigate.back()
			wohnen.findElements(By.tagName("a")).get(j).getText();
			wohnen.findElements(By.tagName("a")).get(j).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("404")) {
				System.out.println("404 Found");
			} 
            driver.navigate().back();
			Thread.sleep(4000);
		}
	}
	@After
	public void closebroser(){
	//driver.quit();
	}

}
