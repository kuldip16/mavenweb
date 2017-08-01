package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zkoss.org/zkdemo/input/date_and_time_picker");
		System.out.println("browser launched");
        driver.findElement(By.xpath("//i[@class= 'z-datebox-icon z-icon-calendar']")).click();
        driver.findElement(By.xpath(".//*[@id='_z_0-w1']/td[4]")).click();	
	}

}
