package de;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ishan {
	public static void main(String[] args) {

	
		WebDriver driver;
		System.out.println("launching firefox");
		driver = new FirefoxDriver();
		System.out.println("maximize the window");
		driver.manage().window().maximize();
		System.out.println("open the gogole home page");
		driver.get("http://www.google.com");
		System.out.println("firefox opened");
	}

}

