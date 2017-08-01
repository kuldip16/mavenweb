package com.moebel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC11 {

	public static void main(String[] args) {
		WebDriver driver;
		//boolean test= false;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println("browser launched");
		/*List<WebElement> olist = driver.findElements(By.xpath("//input[@type= 'radio']"));
		int x= olist.size();
			System.out.println(x);
		for(int i = 0;i<x;i++){
			System.out.println(olist.get(i).getText());
		}*/
		List<WebElement> list=driver.findElements(By.xpath("//*[@href or @src]"));

		for(WebElement e : list){
			String link = e.getAttribute("href");
			if(null==link)
				link=e.getAttribute("src");
			System.out.println(e.getTagName() + "=" + link);
		}
		
		
		driver.quit();
	}
}