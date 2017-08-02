package myPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.homesofa.de/authentifizierung?back=my-account");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='center_column']/div/div/div/form/div/div/input")).sendKeys("kuldip_kumar27@rediffmail.com");  //login
		//driver.findElement(By.xpath("//input[@id='email'][0]")).sendKeys("kuldip_kumar27@rediffmail.com");
		//driver.findElement(By.id("next")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='center_column']/div/div/div/form/div/div[2]/input")).sendKeys("kuldeep16");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		String title =  driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().contains("Mein Konto - homesofa"))
		{
			System.out.println("Test case passed");}
		else
		{ 
			System.out.println("test case failed");}
		//driver.quit();

	}

	}

