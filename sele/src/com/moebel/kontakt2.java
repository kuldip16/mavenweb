package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kontakt2 {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.moebel.de/kontakt";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("herrId")).click();
		driver.findElement(By.id("vorname")).sendKeys("test");
		driver.findElement(By.id("name")).sendKeys("name");
		driver.findElement(By.id("emailAddress")).sendKeys("test@testres");
		driver.findElement(By.id("nachricht")).sendKeys("testest");
		driver.findElement(By.xpath(".//*[@class='submit']")).click();
        String t = driver.findElement(By.xpath(".//*[@id='popup_title']")).getText();
		System.out.println(t);
		System.out.println("please enter the mandatory fields");
		driver.findElement(By.id("popup_ok")).click();
		String t1 = driver.findElement(By.id("emailInValid")).getText();
		System.out.println(t1);
		if(t1.contains("Veuillez")){
			System.out.println("email not entered");
		}
		else
			System.out.println("oops");
		
		
	}
}
