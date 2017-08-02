package Footer;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dummy {
	WebDriver driver;
	String url;
	@Before 
	public void launchbrowser()
	{
		driver.get("https://www.moebel.de/betatesting.php");
		driver.manage().window().maximize();
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {Staging}");
	    driver.get("https://www.moebel.de/");
	}
	@Test
	 public void homepage_links() throws ClientProtocolException, IOException{
	       List<WebElement> el = driver.findElements(By.tagName("a"));
	  String url;
	     int i = el.size();
	  System.out.println("No of images : " + i);
	  for(WebElement we : el){
	   url = we.getAttribute("src");
	   if(we != null){
	    
	    links(url);
	  }
	  }
	  }
	 public void links(String URL) throws ClientProtocolException, IOException{
	       try{
	  //Method to check page is opening without any error.
	    HttpClient client = HttpClientBuilder.create().build();
	    HttpGet request = new HttpGet(URL);
	    HttpResponse response = client.execute(request);
	   if (response.getStatusLine().getStatusCode() != 200){
	   
	   System.out.println(URL +" : Invalid link");
	   }
	   else{
	    System.out.println(URL + " : Page is successfully loaded ");
	    //System.out.println(URL);
	   }
	       }
	       catch(Exception e){
	        e.printStackTrace();
	       }

	}
	}
