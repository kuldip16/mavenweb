package mypack1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1_f_login {
	WebDriver driver;
	String url;
	@Before
	public void launchbrowser(){
		driver = new FirefoxDriver();
		url="http://www.flipkart.com/";
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	}

	@Test
	public void flipkart_login(){
		driver.findElement(By.xpath("//a[contains(text(), 'Log In')]")).click();
		driver.findElement(By.xpath("//input[@class='fk-input login-form-input user-email']")).sendKeys("kuldipkumar169@gmail.com");
		driver.findElement(By.xpath("//input[@class='fk-input login-form-input user-pwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@class='submit-btn login-btn btn']")).click();
	}


}
