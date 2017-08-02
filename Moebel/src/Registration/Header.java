package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Header {
 public static void main(String[] args) throws InterruptedException{
 
  WebDriver driver = new FirefoxDriver();
  driver.get("https://www.moebel.de/betatesting.php");
	driver.manage().window().maximize();
	new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node Devel1 {Development}");
  driver.get("https://www.moebel.de/"); 
 
WebElement header= driver.findElement(By.xpath("//div[@class='shopping-sale']"));  // Get Footer element which contains all footer links
  System.out.println(header.findElements(By.tagName("a")).size()) ; 
  
  int i = header.findElements(By.tagName("a")).size(); //Get number of links
 
  for(int j = 0;j<i;j++){    //create loop based upon number of links to traverse all links 
	  header= driver.findElement(By.xpath("//a[contains(@title, 'Shopping')]"));   // We are re-creating "footer" webelement as DOM changes after navigate.back()
	  header.findElements(By.tagName("a")).get(j).getText();
	  header.findElements(By.tagName("a")).get(j).click();
      Thread.sleep(3000);
   System.out.println(driver.getTitle());
      if(driver.getTitle().contains("404")) {
       System.out.println("404 Found");
      } 
       driver.navigate().back();
       Thread.sleep(4000);
  }
 }
}