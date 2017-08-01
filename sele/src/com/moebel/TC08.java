package com.moebel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC08 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("browser launched");
		
		
		WebElement oele= driver.findElement(By.id("day"));
	    Select osel= new Select(oele);
	    osel.selectByIndex(8);
	    WebElement oele1=	driver.findElement(By.id("month"));
	    Select osel1= new Select(oele1);
	    osel1.selectByVisibleText("Mar");
        WebElement oele2= driver.findElement(By.id("year"));
	    Select osel2= new Select(oele2);
	    osel2.selectByIndex(3);
	    driver.findElement(By.id("u_0_h")).click();
	    Thread.sleep(3000);
	    if((driver.findElement(By.id("u_0_g")).isSelected())){
	    	System.out.println("radio button selecetd");
	    	driver.findElement(By.id("u_0_h")).click();
	    }
	    else 
	    {
	    	System.out.println("not selected");}
	        driver.findElement(By.id("u_0_g")).click();
         }
} 
