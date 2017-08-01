package com.moebel;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC21 {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			  
			  driver= new ChromeDriver();
			  String url= "https://www.moebel.de/betatesting.php";
			  
			  driver.get(url);
			  driver.manage().window().maximize();
			  WebElement drpdwn= driver.findElement(By.xpath("html/body/div[1]/select"));
			  
			  Select sl= new Select(drpdwn);
			  sl.selectByValue("qa1");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("html/body/div[1]/font[2]/a[1]")).click(); 
			  
			 
			// Switching to New tab: home page
			       Set<String> tab_handles = driver.getWindowHandles();
			        int number_of_tabs = tab_handles.size();
			    
			        int new_tab_index = number_of_tabs-1;
			        
			        driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
			        System.out.println("Title of Home Page is: "+driver.getTitle());
			        
			        WebDriverWait wait = new WebDriverWait(driver, 20);
			        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='sb-nav-close']"))).click();
			        System.out.println("popup closed");
			        Thread.sleep(1500);
			Cookie name = new Cookie("clickout", "allow");
			driver.manage().addCookie(name);
			driver.navigate().to("https://www.moebel.de/lokale-suche");
			driver.findElement(By.id("postal_searchKeyword")).sendKeys("92331");
			driver.findElement(By.id("postal_searchKeyword")).sendKeys(Keys.ENTER);
			driver.navigate().to("https://www.moebel.de/wohnen/hocker");
	}

}
