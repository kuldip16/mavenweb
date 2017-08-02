package links;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {
public static void main(String[] args) {
		
	    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuldip\\Downloads\\chromedriver\\chromedriver.exe" );
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.moebel.de");
		driver.manage().window().maximize();
		
	}

}
