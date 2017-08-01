package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC06 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		System.out.println("browser launched");
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.partialLinkText("DEPRECA")).click();
		System.out.println("click");
	}
}
