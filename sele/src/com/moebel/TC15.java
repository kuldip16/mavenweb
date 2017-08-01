package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("browser launched");
		driver.findElement(By.id("email")).sendKeys("kuldeep1");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(Keys.BACK_SPACE);
		driver.manage().window().getPosition();
		

	}

}
