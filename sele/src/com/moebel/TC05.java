package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC05 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("browser launched");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		//driver.get("https://www.gmail.com");
		Thread.sleep(3000);
	    System.out.println(driver.getTitle());
		driver.navigate().back();
		 System.out.println(driver.getTitle());
		driver.navigate().forward();
		 System.out.println(driver.getTitle());
		driver.navigate().refresh();
		 System.out.println(driver.getTitle());
		driver.navigate().to("https://www.gmail.com");
		 System.out.println(driver.getTitle());
		System.out.println("keep it up");
		driver.quit();
	}
}
