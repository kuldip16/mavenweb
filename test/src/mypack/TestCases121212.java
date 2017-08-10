package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCases121212 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Training\\geckodriver\\geckodriver-v0.11.1-win64");
		WebDriver driver;
		driver = new FirefoxDriver();
		String url = "http://demo.guru99.com/V4/";
		driver.get(url);
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("alert closed");
				

	}

}
