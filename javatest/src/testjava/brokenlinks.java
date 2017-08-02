package testjava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brokenlinks {
	private static int statusCode;

	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++)
		{
			// remove null and empty links
			
				if (links.get(i).getAttribute("href").contains("http")) 
				{
					// Find HTTP Status-Code
					statusCode = getResponseCode(links.get(i).getAttribute("href").trim());
					//System.out.println(statusCode);
				// Check broken link
					if (statusCode == 404)
					{
						System.out.println("Broken of Link# " + i + " " + links.get(i).getAttribute("href"));
					} 
					else
						System.out.println("ok " + links.get(i).getAttribute("href"));
				}
			
		}
		driver.close();
	}

	public static int getResponseCode(String urlString) throws MalformedURLException, IOException {
		URL u = new URL(urlString);
		HttpURLConnection huc = (HttpURLConnection) u.openConnection();
		huc.setRequestMethod("GET");
		huc.connect();
		return huc.getResponseCode();
	}
}
