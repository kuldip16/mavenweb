package demo;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class linksbytag {
	WebDriver driver;
	String url;

	@Before
	public void launchbrowser(){
		driver = new FirefoxDriver();
		url = "https://www.moebel.de/betatesting.php";
		driver.manage().window().maximize();
		driver.get(url);
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void noOfLinks(){
		
		int links = driver.findElements(By.tagName("a")).size();	
		System.out.println("Number of link on a page is "+ links);
		List<WebElement> List = driver.findElements(By.tagName("a"));
		for(WebElement details : List)	{
			System.out.println("Link Text is"   + details.getText() + "  and the link is " + details.getAttribute("href"));
		}
	}

	@After
	public void closebroser(){
		driver.close();
	}
}

