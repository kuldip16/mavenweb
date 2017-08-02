package com.maven.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01 
{
	WebDriver driver;
	@BeforeTest
	void Open_facebook()
	{
		System.setProperty("Webdriver.gecko.driver", "E:\\Selenium_workspace\\Facebook\\geckodriver.exe");
		driver = new FirefoxDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	@Test
	void login()
	{
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ishan.mittal@webvirtue.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("moebel123");
		driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
	}
}
