package Profile_edit_12971;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC01 {
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
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node Devel1 {internal}");
		driver.get("https://www.moebel.de/wohnideen/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Anmelden zu Ihrem Kundenbereich']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'Hier einloggen')]")).click();
		driver.findElement(By.id("login_email")).sendKeys("ishan.mittal@webvirtue.com");
		driver.findElement(By.id("login_pwd")).sendKeys("moebel123");
		driver.findElement(By.xpath("//input[@value= 'Einloggen']")).click();
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("dein_profil"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.xpath("//a[contains(text(), 'Profil editieren')]")).click();
		Thread.sleep(2000);
		
		
}
}