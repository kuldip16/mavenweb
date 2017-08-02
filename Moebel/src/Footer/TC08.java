package Footer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC08 {

	
	public static void main(String[] args) {
		//Über moebel.de----Partner werden Link in footer
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuldip\\Downloads\\chromedriver\\chromedriver.exe" );
			    //launch the chrome
				WebDriver driver = new ChromeDriver();
			   // launch the url
				driver.get("https://www.moebel.de");
				//to maximize the window
			    driver.manage().window().maximize();
				// to scroll down the page
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("scroll(0, 5000)");
				driver.findElement(By.xpath("//a[@title='Partner werden']")).click();
				//To get the title of the page
				String title  = driver.getTitle();
				System.out.println(title);
				//verify that launched page exist or not
				if(driver.getTitle().contains("Partner von moebel.de werden und schnell von vielen Vorteilen profitieren"))
				{
					System.out.println("Test case passed");}
				else
				{ 
					System.out.println("test case failed");}
		        //To close the browser  
				driver.quit();

	}

}
