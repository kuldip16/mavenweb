package com.moebel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC09 {

	public static void main(String[] args) {
		WebDriver driver;
		// boolean test= false;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zkoss.org/zkdemo/input/radio_button");
		System.out.println("browser launched");
		// List<WebElement> olist =
		// driver.findElements(By.cssSelector("//id[@type='radio']"));
		List<WebElement> olist = driver.findElements(By.xpath("//input/div[@type='radio']"));
		int x = olist.size();
		System.out.println(x);
		for (int i = 0; i < x; i++) {
			System.out.println(olist.get(i).getText());
		}
	}
}
