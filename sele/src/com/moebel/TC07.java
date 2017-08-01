package com.moebel;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC07 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jsbin.com/usidix/1");
		System.out.println("browser launched");
		driver.findElement(By.xpath("//input[@value= 'Go!']")).click();
		Alert t = driver.switchTo().alert();
		String y = t.getText();
		System.out.println(y);
		t.accept();
		System.out.println("best " + y);
		driver.quit();
	}
}
