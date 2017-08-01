package com.moebel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC12 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		//boolean test= false;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.google.com");
		driver.get("http://www.facebook.com");
		System.out.println("browser launched");
		//List<WebElement> otag = driver.findElements(By.tagName("a"));
		int x= 12;
		System.out.println(x);
		for(int i = 0;i<x;i++){    
			driver.findElement(By.xpath("//div [@id='pageFooter']"));
			driver.findElements(By.tagName("a")).get(i).getText();
			driver.findElements(By.tagName("a")).get(i).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.navigate().back();
			Thread.sleep(4000);
		}
	}
}
