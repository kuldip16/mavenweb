package com.moebel;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC27
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		String url = "https://in.bookmyshow.com/";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='inp_RegionSearch_top']")).sendKeys("gur");
		driver.findElement(By.xpath(".//*[@id='inp_RegionSearch_top']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='inp_RegionSearch_top']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		try 
		
		{
			driver.findElement(By.id("wzrk-cancel")).click();
		} 
		
		catch (Exception e)
		
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='view-more-link']")).click();
		Thread.sleep(2000);
		List<WebElement> oelelist = driver.findElements(By.className("mv-row"));
		
		for (WebElement e1 : oelelist)
		{
              System.out.println(e1.getText());

		}

	}

}