package mypack1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ebay_login {
	WebDriver driver;
	String url;
	@Before
	public void launchbrowser(){
		driver = new FirefoxDriver();
		url="http://www.snapdeal.com/";
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	}
	@Test
	public void snapdeal_login() throws InterruptedException{
		Actions oact = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//i [@class='sd-icon sd-icon-user']"));
		oact.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[contains(text(), 'login')]")).click();
		driver.switchTo().frame("iframeLogin");
		driver.findElement(By.xpath("//input [@id='userName']")).sendKeys("kuldipkumar169@gmail.com");
		driver.findElement(By.id("checkUser")).click();
		driver.findElement(By.xpath("//input[@id='j_password_login']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='signin_submit']")).click();
		}	
	
}
