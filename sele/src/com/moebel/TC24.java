package com.moebel;

import java.awt.image.BufferedImage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC24 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("http://moebel.de");
		  
		  
		  List<WebElement> buttons = driver.findElements(By.id("footer"));
		     for(WebElement ele: buttons){
			 System.out.println(ele.getText());
		 }
	}

}
