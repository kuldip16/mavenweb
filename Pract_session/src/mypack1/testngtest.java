package mypack1;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testngtest {
WebDriver driver;
String url;

	@Test
public void TestA(){
	driver = new  FirefoxDriver();
	url = "https://www.gmail.com";
	driver.get(url);
	driver.manage().window().maximize();
	String ptitle = driver.getTitle();
	Assert.assertEquals(ptitle, "gmail");
	}
	@Test
	public void testB(){
		
	}
}
