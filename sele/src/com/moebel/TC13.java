package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC13 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		System.out.println("browser launched");
		//file upload
		//driver.findElement(By.cssSelector("input[photo='photo'])")).sendKeys("C:\\Users\\Kuldip\\Desktop\\baur_logo_114x50_neu.gif");
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Kuldip\\Desktop\\baur_logo_114x50_neu.gif");

	}

}
