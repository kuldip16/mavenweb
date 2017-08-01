package com.moebel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC28 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.moebel.de/";
		driver.get(url);
		driver.manage().window().maximize();
		String a1 = driver.getTitle();
		System.out.println("Title of Home Page is: " + a1);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/ol/li[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='tag_content_bilboard_5258']/div")).click();
		String t = driver.getPageSource();
		if (t.contains("ZUM SHOP"))
		{
			System.out.println("ZUM SHOPc button is present");
		}
		else
		{
		System.out.println("zum shop button is absent");	
		}
		driver.findElement(By.xpath(".//*[@id='center_column']/div[3]/div/div/div/div[6]/div/a")).click();
		Set<String> tab_handles = driver.getWindowHandles();
        int number_of_tabs = tab_handles.size();
        int new_tab_index = number_of_tabs-1;
        driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
        WebDriverWait wait = new WebDriverWait(driver, 15); 
		wait.until(ExpectedConditions.titleContains("Kettler Siero Gartenmöbelset eisengrau 7-teilig - Garten"));
        String a2 = driver.getTitle();
        System.out.println("Title of Home Page is :" +a2);
		if(a1.equals(a2))
		{
			System.out.println("title is same");
		}
		else
			System.out.println("title is different");
		
	}
     
}
