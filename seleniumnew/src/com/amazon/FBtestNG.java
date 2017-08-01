package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBtestNG {
 
 WebDriver driver;
 
 @BeforeTest
 
 void Open_facebook()
 {
  
  System.setProperty("Webdriver.gecko.driver", "E:\\Selenium_workspace\\Facebook\\geckodriver.exe");
  driver= new FirefoxDriver();
  String url= "https://www.facebook.com/";
  driver.get(url);
  driver.manage().window().maximize();
  System.out.println(driver.getTitle());
  
 }
 
@BeforeMethod
 
 void page_refrsh() throws InterruptedException
 {
  
  Thread.sleep(5000);
  System.out.println("wait for 5 secs");
  
 }
 
 @Test(priority=0)
 void login() throws InterruptedException{
  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ishan.mittal@webvirtue.com");
  driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("moebel123");
  driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
}
 
 @Test(enabled= false)
 void signUp() throws InterruptedException{
  
  driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("ishan");
  driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("mittal");
  driver.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys("9999888887");
  driver.findElement(By.xpath(".//*[@id='u_0_d']")).sendKeys("test123");
  
  WebElement day= driver.findElement(By.xpath(".//*[@id='day']"));
  WebElement month= driver.findElement(By.xpath(".//*[@id='month']"));
  WebElement year= driver.findElement(By.xpath(".//*[@id='year']"));
  
  Select dd= new Select(day);
  Select dm= new Select(month);
  Select dy= new Select(year);
  
  dd.selectByIndex(7);
  dm.selectByVisibleText("Jan");
  dy.selectByValue("1989");
  Thread.sleep(2000);
  
  driver.findElement(By.xpath(".//*[@id='u_0_h']")).click();
  driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
  
  String msg= driver.findElement(By.xpath(".//*[@id='reg']/div/div")).getText();
  
  System.out.println(msg);
 }
  
  @Test(priority=1)
  void newpost() throws InterruptedException{
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1mf _1mj']"))).click();
	  System.out.println("wait");
   //driver.findElement(By.className("_1mf _1mj")).sendKeys("Hello moebel");
  // driver.findElement(By.xpath(".//*[@id='js_5x']/div[2]/div[3]/div/div[2]/div/button")).click();
   //driver.findElement(By.className("_1mf7 4jy0 4jy3 4jy1 51sy selected _42ft")).click();
   Thread.sleep(5000);
   //System.out.println("post uploaded");
   
  }
  
  
  @Test(enabled= false)
  void imageupload() throws InterruptedException{
   
   driver.findElement(By.xpath(".//*[@id='js_64']")).click();
   driver.findElement(By.xpath(".//*[@id='js_so']")).sendKeys("C:\\Users\\Ishan\\Desktop\\testing.jpeg");
   WebDriverWait wait = new WebDriverWait(driver, 45);
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='js_1c0']/div[2]/div[3]/div/div[2]/div/span[2]/button"))).click();
   System.out.println("post uploaded");
   
  }
  
  @Test(enabled= false)
  void logout() throws InterruptedException{
   
   driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
   Thread.sleep(5000);
   driver.findElement(By.name("fb_dtsg")).click();
   
   System.out.println("logout done");
   
  }
  
  @AfterTest(enabled= false)
  void closebrowser() throws InterruptedException{
   
   driver.quit();
   
  }
  
  
  
 
}