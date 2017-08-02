package Registration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ng {

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
		driver.findElement(By.id("search-critea")).click();
		driver.findElement(By.id("Marken")).click();
		driver.findElement(By.id("keyword")).sendKeys("sof");
		driver.findElement(By.id("keyword")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("keyword")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("keyword")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.id("keyword")).sendKeys(Keys.ENTER);
	}
	@After
	public void closebroser(){
		driver.quit();
	}
}

