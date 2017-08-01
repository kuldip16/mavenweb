package com.amazon;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test {
   int count=0;
 @Test
 public void test() throws InterruptedException{
  WebDriver driver;
  String url= "https://www.moebel.de/betatesting.php";
  System.setProperty("webdriver.gecko.driver","D://workspace//sel_project//geckodriver.exe");
  driver= new FirefoxDriver();
  driver.get(url);
  
  WebElement element= driver.findElement(By.xpath("html/body/div/select"));
  Select osel = new Select(element);
  osel.selectByValue("qa1");
  System.out.println("testing page switch");
  driver.findElement(By.xpath("html/body /div[1]/font[2]/a[1]")).click();
  Thread.sleep(1000);
 
   Set<String> tab_handles = driver.getWindowHandles();
      int number_of_tabs = tab_handles.size();
      int i = number_of_tabs-1;
      driver.switchTo().window(tab_handles.toArray()[i].toString());
      System.out.println(driver.getTitle());
         
      Thread.sleep(2000);
  
      String[] exp ={"WOHNEN","SCHLAFEN","ESSEN","BAD","KINDER","FLUR","BÜRO","GARTEN","LAMPEN","HEIMTEXTILIEN","DEKORATION","BAUMARKT","SALE","|","WOHNIDEEN"};
   System.out.println(exp.length);
   List<WebElement> t = driver.findElements(By.xpath(".//*[@class='nav navbar-nav']"));
      for(WebElement ele: t)
      {
       for (int j=0; j<exp.length; j++)
       {
              if (ele.getText().equals(exp[j]))
              {
              count++;
               
              }
          }
  }
      if(count==exp.length){
       System.out.println("Matched");
      }
      else{
       System.out.println("Not mathced");
      }
      driver.quit();
 }}