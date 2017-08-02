package mypack1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class dummy {
	WebDriver driver;
	String url;
	@Before
	public void invokebrowser(){
		driver = new FirefoxDriver();
		url = "https://www.moebel.de/betatesting.php";
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		}
    @Test
    public void test(){
    	
    }
}
