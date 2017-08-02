import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelemnets_cmds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64");
		WebDriver driver =new FirefoxDriver();
		//String url="https://www.facebook.com";
		//driver.get(url);
		//WebElement element=driver.findElement(By.id("email"));
		//element.sendKeys("bharti");
	//	boolean status=element.isDisplayed();
	//	boolean status=element.isEnabled();
//		boolean status=element.isSelected();
		//.submit
		//.gettext()
		//get size
		//get location
		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");

	}

}
