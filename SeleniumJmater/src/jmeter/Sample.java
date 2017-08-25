package jmeter;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	
	@Test
	
	public void testjeter(){
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		
		driver.get("https://www.google.co.in");
		
		System.out.println(driver.getTitle());
		
		
	}
}
