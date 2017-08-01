package com.amazon;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02 {
	@BeforeMethod
	public void openbrowser() {
				System.out.println("open the broser  12");
	}
	@Test
	public void login() {
		System.out.println("demo test 112");
	}

	@Test
	public void login1() {
		WebDriver driver;
		//boolean test= false;
		System.setProperty("webdriver.chrome.driver", "chrdddddomedriver.exe");
		driver = new ChromeDriver();
		System.out.println("demo test 211" + driver);
	}

	@Test(dependsOnMethods = "login1")
	public void depends() {
		
		System.out.println("depends upon method 12");
	}

	@Test(timeOut = 5000)
	public void timeout() {
		System.out.println("sleep the thread 12");
	}

	@AfterMethod
	public void closebrowser1() {
		System.out.println("close broser aftre method 12");
	}
}
