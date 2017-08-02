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

public class Bad {
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
	public void attest() throws InterruptedException{
		driver.get(url);
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/bad']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='bad']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of bad = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='bad']/ul/li/ul"));
        for (WebElement ele : List)
        {
            ele = List.get(i);
            String value = ele.getText();
            System.out.println("sub categories = " + value);
             i=i+1;
        }
		}
	@Test
	public void test(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/baumarkt']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='baumarkt']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of baumarkt = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='baumarkt']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of baumarkt =" + value);
			i=i+1;
    }
    }
	@After
	public void closebroser(){
	driver.quit();
	}

}