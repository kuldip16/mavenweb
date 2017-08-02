import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dpdwn {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64");
		WebDriver driver =new FirefoxDriver();
		String url="https://www.facebook.com";
		driver.get(url);
	//WebElement a=driver.findElement(By.id("day"));
Select object=new Select(driver.findElement(By.className("_5dba")));

	object.selectByVisibleText("1");;
		object.selectByVisibleText("jan");

	}

}
