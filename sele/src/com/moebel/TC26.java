package com.moebel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC26 {

 public static void main(String[] args) throws InterruptedException {
  // TODO Auto-generated method stub
  WebDriver driver;
  String url = "https://www.moebel.de/betatesting.php";
  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
  driver = new FirefoxDriver();
  driver.get(url);
  driver.manage().window().maximize();

  WebElement element = driver.findElement(By.xpath("html/body/div/select"));
  Select osel = new Select(element);
  osel.selectByValue("qa1");
  System.out.println("testing page switch");
  driver.findElement(By.xpath("html/body/div[1]/font[2]/a[1]")).click();
  Thread.sleep(1000);
  
  Set<String> tab_handles = driver.getWindowHandles();
  int number_of_tabs = tab_handles.size();
  int i = number_of_tabs - 1;
  driver.switchTo().window(tab_handles.toArray()[i].toString());
  System.out.println(driver.getTitle());
  

  Thread.sleep(5000);
  System.out.println("test title");
  
    Actions action = new Actions(driver);
    WebElement we = driver.findElement(By.xpath(".//*[@id='nav_wohnen']/a"));
    action.moveToElement(we).build().perform();
    Thread.sleep(5000);
    driver.findElement(By.xpath(".//*[@id='sofas']")).click();
    
    
    Actions action1 = new Actions(driver);
    WebElement we1 = driver.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/div[2]/div/div[1]"));
    action1.moveToElement(we1).build().perform();
    driver.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/div[2]/div/div[3]/ul/li[1]")).click();
 }

}