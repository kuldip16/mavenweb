package com.moebel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC20 {

	
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver;
		// webdriver.firefox.marionette for 32 bit operating system
		// System.setProperty("webdriver.gecko.driver","true");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book2.spicejet.com/");
		System.out.println("browser launched");
		Thread.sleep(5000);
		
		//first method
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1']"));
		Select oele= new Select(dropdown);
		oele.selectByIndex(5);
		oele.selectByValue("IXA");
driver.findElement(By.xpath("(.//*[@value='IXA'])[1]")).click();
		System.out.println("janab done eeeeeeeeeeeeeeeee");
		
		driver.findElement(By.xpath("//*[@value='IXC']")).click();
		
}
}