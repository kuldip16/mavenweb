package com.moebel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kontakt {
	public static void main(String[] args) throws Exception 
	{
		
		String url = "https://www.moebel.de/kontakt";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@class='submit']")).click();
		String t = driver.findElement(By.xpath(".//*[@id='popup_title']")).getText();
		
		System.out.println(t);
		System.out.println("please enter the mandatory fields");
		  driver.findElement(By.id("popup_ok")).click();
	}
	
}

