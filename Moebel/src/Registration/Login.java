package Registration;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

 public static void main(String[] args) {
  //To launch the chrome
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuldip\\Downloads\\chromedriver\\chromedriver.exe" );
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.moebel.de/betatesting.php");
  driver.manage().window().maximize();
  // to select the mode for testing
  new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
  // Open the link
  driver.get("https://www.moebel.de/");
  //click to open the Notepad layer
  driver.findElement(By.xpath("//a[@title='Anmelden zu Ihrem Kundenbereich']")).click();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  // click on link to open the sign up form
  driver.findElement(By.xpath("//a[contains(text(), 'Hier einloggen')]")).click();
  //Fill the login form
  driver.findElement(By.id("login_email")).sendKeys("kuldip.kumar@webvirtue.com");
  driver.findElement(By.id("login_pwd")).sendKeys("123456");
  //Click to login
  //driver.findElement(By.tagName("Input")).click();
  driver.findElement(By.xpath("//input[@value= 'Einloggen']")).click();
  // To get the title of page.
  String title  = driver.getTitle();
  System.out.println(title);
  //verify that user is logged in or not
  if(driver.getTitle().contains("moebel.de - Größte Auswahl der Möbel Onlineshops"))
  {
   System.out.println("User is Successfully Logged in");}
  else { 
	 System.out.println("Invalid Id Passowrd");}
 //To close the browser  
 driver.quit();
}
}