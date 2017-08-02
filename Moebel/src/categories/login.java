package categories;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class login {
	WebDriver driver;
	String url;
	@Before
	public void launchbrowser(){
		driver = new FirefoxDriver();
		url = "https://www.moebel.de/betatesting.php";
		driver.manage().window().maximize();
	}
	@Test
	public void attest() throws InterruptedException {
		driver.get(url);
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("aws-a-desktop01 {Desktop}");
		driver.get("https://www.moebel.de/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Anmelden zu Ihrem Kundenbereich']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'Hier einloggen')]")).click();
		driver.findElement(By.id("login_email")).sendKeys("Kuldip"+System.currentTimeMillis()+"@gmail.com");
		driver.findElement(By.id("login_pwd")).sendKeys("moebel123");
		driver.findElement(By.xpath("//input[@value= 'Einloggen']")).click();
		String s1= driver.findElement(By.id("form_msg")).getText();
		String s2= "E-Mail-Adresse oder Passwort nicht bekannt";

		if(s1.equals(s2)){
			System.out.println("Error in login");
		}
		else{ 
			System.out.println("successfuly logged in ");
		}
		}
	@After
	public void closebrowser() throws Exception{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\demo\\ss3.jpg");
		FileUtils.moveFile(srcFile, destFile);
		driver.quit();
			}
	}
