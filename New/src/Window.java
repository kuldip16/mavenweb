import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64");
		WebDriver driver =new FirefoxDriver();
		String url="https://www.facebook.com";
		driver.get(url);
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
