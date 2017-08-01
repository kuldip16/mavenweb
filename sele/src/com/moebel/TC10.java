package com.moebel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("browser launched");
		List<WebElement> otag = driver.findElements(By.tagName("a"));
		int x= otag.size();
		System.out.println("total links on page " +x);
		for(int i = 1;i<x ;i++){
			System.out.println(otag.get(i).getText());
		}
	}
}
