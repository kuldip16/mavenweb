package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		// webdriver.firefox.marionette for 32 bit operating system
		// System.setProperty("webdriver.gecko.driver","true");
		System.setProperty("webdriver.gecko.driver", "D:\\Training\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		System.out.println("browser launched");

		driver.findElement(By.id("identifierId")).sendKeys("kuldipkumar169");
		;
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("kuldeep");
		// driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		System.out.println("password is wrong");
		driver.quit();
	}

}
