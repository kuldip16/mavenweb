package demo;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Essen {
	WebDriver driver;
	String url;
	private int i;
	@Before
	public void launchbrowser(){
		driver = new FirefoxDriver();
		url = "https://www.moebel.de/betatesting.php";
		driver.manage().window().maximize();
	}
	@Test
	public void essen() throws InterruptedException{
		driver.get(url);
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/essen']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='essen']/ul"));  
		int web = ct.findElements(By.tagName("li")).size(); 
		System.out.println("Total number of sub categories Of Essen = " + web);
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='essen']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of Essen = " + value);
			i=i+1;
		}
	}
	@After
	public void closebroser(){
		driver.quit();
	}

}