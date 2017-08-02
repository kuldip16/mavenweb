package contact_edit_12974;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class TC02 {
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
		driver.findElement(By.xpath("//a[@href ='//www.moebel.de/wohnideen/editprofile-contact']")).click();
		boolean s2 =driver.getPageSource().contains(" Ja, ich möchte per E-Mail darüber informiert werden, wenn sich der Preis eines der Produkte auf meinem Merkzettel geändert hat. ");
		if(s2){
			System.out.println("Text present on the page");
			System.out.println("Test Case Failed");
		}
		else{
			System.out.println("Text absent on the page");
			System.out.println("Test Case Passed");}
	}
	/*@AfterTest
	public void aftertest(ITestResult result) throws Exception{
		if(!result.isSuccess()){
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File("D:\\TC01\\abc.jpg");
			FileUtils.moveFile(srcFile, destFile);}
		}*/
	@After
	public void closebroser() throws Exception{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\Suite\\TC02\\ss.jpg");
		FileUtils.moveFile(srcFile, destFile);
		driver.quit();
	}

}

