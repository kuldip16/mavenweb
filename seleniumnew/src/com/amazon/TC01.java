package com.amazon;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
	@BeforeMethod
	public void openbrowser() {
				System.out.println("open the broser");
	}
	@Test
	public void login() {
		System.out.println("demo test 1");
	}

	@Test
	public void login1() {
		WebDriver driver;
		//boolean test= false;
		System.setProperty("webdriver.chrome.driver", "chrdddddomedriver.exe");
		driver = new ChromeDriver();
		System.out.println("demo test 2" + driver);
	}

	@Test(dependsOnMethods = "login1")
	public void depends() {
		
		System.out.println("depends upon method");
	}

	@Test(timeOut = 5000)
	public void timeout() {
		System.out.println("sleep the thread");
	}

	@AfterMethod
	public void closebrowser1() {
		System.out.println("close broser aftre method");
	}
}
