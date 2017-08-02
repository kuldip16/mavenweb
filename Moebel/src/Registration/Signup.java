package Registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {


	public static void main(String[] args) {
		
		 //launch the chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuldip\\Downloads\\chromedriver\\chromedriver.exe" );
	   	WebDriver driver = new ChromeDriver();
		driver.get("https://www.moebel.de/betatesting.php");
		driver.manage().window().maximize();
		// to select the mode for testing
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {Staging}");
		// Open the link
		driver.get("https://www.moebel.de/");
		//click to open the notepad layer
		driver.findElement(By.xpath("//a[@title='Anmelden zu Ihrem Kundenbereich']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// click on link to open the sign up form
		driver.findElement(By.xpath("//a[contains(@class, 'Roboto-Light-11-orange MT10')]")).click();
		// To fill the from for Signup
		driver.findElement(By.xpath("//input [@id='reg_email']")).sendKeys("kuldip.kumar@webvirtue.com");
		driver.findElement(By.xpath("//input [@id='conf_email']")).sendKeys("kuldip.kumar@webvirtue.com");
		driver.findElement(By.xpath("//input [@id='reg_pwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//input [@id='conf_pwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//input [@id='f_name']")).sendKeys("test");
		driver.findElement(By.xpath("//input [@id='l_name']")).sendKeys("test");
		driver.findElement(By.id("Mann")).click();
		driver.findElement(By.id("reg_zip")).sendKeys("11111");
		driver.findElement(By.xpath("//form [@id='registrationform']/div/div[11]/input")).click();
		
		String s2= driver.findElement(By.xpath("//div [@id='Registration_L']")).getText();
		String s1  ="Bitte prüfe jetzt Dein E-Mail-Postfach! Wir haben Dir eine Aktivierungs-E-Mail geschickt. Bitte klicke den darin enthaltenen Link, um Deine Registrierung zu bestätigen.";
		System.out.println(s2);
		System.out.println(s1);
		if(s2.equals(s1))
		{
			System.out.println("Test case passed");
		}
		else
		{ 
			System.out.println("test case failed");
		}
 		driver.quit();	
	}

}
