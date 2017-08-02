package de;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Training\\geckodriver.exe");
		System.out.println("hello  firefox");
		WebDriver driver;
		System.out.println("launching firefox");
		driver = new FirefoxDriver();
		System.out.println("maximize teh window");
		driver.manage().window().maximize();
		System.out.println("open the gogole home page");
		driver.get("http://www.google.com");
		System.out.println("firefox opened");
	}

}
