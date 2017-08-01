package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC16 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		System.out.println("browser launched");
	
		Actions oact = new Actions(driver);
		WebElement ele45 = driver.findElement(By.xpath("html/body/div[1]/header/div/div[3]/div[2]/div/a[1]/span[1]"));
		oact.moveToElement(ele45).build().perform();
		WebElement ele46= driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[4]/div[6]/div[3]/a[10]/span"));
		oact.contextClick(ele46).build().perform();
		
//		driver.switchTo().alert();
//		driver.findElement(By.xpath(""))
		
		System.out.println("done");
		
	}

}
