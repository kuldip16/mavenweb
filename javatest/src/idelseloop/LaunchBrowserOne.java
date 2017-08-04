package idelseloop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserOne {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "https://www.moebel.de/betatesting.php";
		driver.manage().window().maximize();
		driver.get(url);

	}

}
