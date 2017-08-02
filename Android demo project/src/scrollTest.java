import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\Trainer\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Trainer\\Downloads\\Appium\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
//		driver.get("http://www.jqueryui.com/");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		//((JavascriptExecutor)driver).executeScript("scroll(0,800)");
//		((JavascriptExecutor)driver).executeScript("alert('Hello.. How are you?')");
//		//System.out.println("Scrolled in the middle");
		
		
		
			  System.setProperty("webdriver.chrome.driver", "D:\\workspace_trunk\\chromedriver.exe");
			  WebDriver driver = new FirefoxDriver();
			  
			  //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			  TimeUnit tu = TimeUnit.SECONDS;
			  driver.manage().timeouts().implicitlyWait(40, tu);
			  driver.get("http://newtours.demoaut.com");
			  WebElement uname = driver.findElement(By.name("userName"));
			  uname.clear();
			  uname.sendKeys("mercury");
			  WebElement pwd = driver.findElement(By.name("password"));
			  pwd.clear();
			  pwd.sendKeys("mercury");
			  driver.findElement(By.name("login")).click();
			  String title = driver.getTitle();
			  System.out.println(title);


	}

}
