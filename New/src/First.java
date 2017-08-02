import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64");
		WebDriver driver =new FirefoxDriver();
		String url="https://www.facebook.com";
		driver.get(url);
		String title= driver.getTitle();
		int titleLength= driver.getTitle().length();
		System.out.println("tiltle of the page is " +title);
		System.out.println("length of the page is " +titleLength);
		String actualUrl= driver.getCurrentUrl();
		if (actualUrl.equals(url))
		{
			System.out.println("verification successfully");
		
		} else{
			System.out.println("verification failed");
			System.out.println("actual url is " +actualUrl);
			System.out.println("expected url is " +url);
			
		}
		
		//String pageSource = driver.getPageSource();
		int pageSourceLength = driver.getPageSource().length();
		System.out.println("length of the page source is " +pageSourceLength);
		//System.out.println(" the page source is " +pageSource);
			
		driver.quit();
		
	}

}
