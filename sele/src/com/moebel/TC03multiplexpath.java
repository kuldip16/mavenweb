package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03multiplexpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//multiple condition in Xpath
		//span[@class='RveJvd snByac'][contains(text(),'Next')]
		//span[@class='RveJvd snByac' and contains(text(),'Next')]
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		System.out.println("browser launched");
		driver.findElement(By.id("identifierId")).sendKeys("kuldipkumar169");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("kuldeep");
		//driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(text(),'Next')]")).click();
		String t = driver.getTitle();
		driver.getPageSource();
		driver.getCurrentUrl();
		System.out.println(t.length());
		System.out.println(t);
		System.out.println("password is wrong tttttttttt");
		driver.quit();
	}
}