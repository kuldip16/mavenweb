package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kontakt1 {

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
		driver.findElement(By.id("emailAddress")).sendKeys("test@testrest.com");
		driver.findElement(By.id("nachricht")).sendKeys("testest");
		driver.findElement(By.xpath(".//*[@class='submit']")).click();
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath(".//*[@id='successFullySent']"));
	    String sucess = we.getText();
	    System.out.println(sucess);
		if(sucess.contains("Die Nachricht wurde erfolgreich übermittelt."))
		{
			System.out.println("successfully submitted");
		}
		else
			System.out.println("not succesful");
		
	}

}
