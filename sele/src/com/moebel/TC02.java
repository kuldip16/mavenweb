package com.moebel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementLocation;
import org.openqa.selenium.remote.server.handler.html5.GetLocationContext;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;



public class TC02 {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver;
		// webdriver.firefox.marionette for 32 bit operating system
		// System.setProperty("webdriver.gecko.driver","true");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		System.out.println("browser launched");
		Thread.sleep(5000);
		//driver.findElement(By.id("identifierId")).sendKeys("kuldipkumar169");
		//System.out.println(p);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    //jse.executeScript("arguments[0].ScrollIntoView(true);", p);
	    //System.out.println(p.getText());

		jse.executeScript("scroll(0, 1200)");
		
	
		/*driver.findElement(By.id("identifierId")).sendKeys("kuldipkumar169");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("kuldeep");
		// driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		String t = driver.getTitle();
		System.out.println(t);
		System.out.println("password is wrong");
		driver.quit();*/
		
		
		//span[@class='RveJvd snByac'][contains(text(),'Next')]
		//span[@class='RveJvd snByac' and contains(text(),'Next')]
	}

}