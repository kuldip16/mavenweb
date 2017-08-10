package PageObjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utility.Base;

public class Homepage_Testcase extends Base{

public static boolean TestHomepage() throws ClientProtocolException, IOException, InterruptedException{
	
	boolean status = true;	
	
		try{
			//Inserting all elements with tag name "a" in list
			List<WebElement> al = driver.findElements(By.tagName("a"));
		//store the size of list in integer
		 int i = al.size();
	     System.out.println("No of links are : " + i);
	     //Run the loop i times
	     for(WebElement we : al){
	    	 //if element is present
	    	 if(we != null){
	    		 //get the url
	    		 String url = we.getAttribute("href");
	    		 // if url is not empty and not contains "javascript" in url
	    		 if (url != null && !url.contains("javascript")) {
	    		 	 // call the function and passing the url as in string 
	    			 links(url);
	    		 }
	    		 //if url is blank or javascript is present
	    		 else{
	    			 
	    			 
	    			 System.out.println(url+" : link is broken");
	    			
	    		 }
	    	 
	    			 
	    	 }
	     }
	}
		catch(Exception e){
	    e.printStackTrace();
	    System.out.println(e.getMessage());
	    status = false;
		}
		status =  homepage_images();
		return status;
	}

public static boolean homepage_images() throws ClientProtocolException, IOException, InterruptedException{
	boolean status = false;
	
    // store all the images in list and check images are broken or not
		List<WebElement> el = driver.findElements(By.tagName("img"));
		String url;
	    int i = el.size();
		System.out.println("No of images : " + i);
		try{
			
		for(WebElement we : el){
			
			url = we.getAttribute("src");
			String clss = we.getAttribute("class");
			
		
			if(url.equalsIgnoreCase("") || clss.equalsIgnoreCase("lazy")){
				
				System.out.println("Lazy image is Invalid");
				
			}
			else{
				
				links(url);
				 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", we);
				    if (!ImagePresent)
				    {
				         System.out.println("Image not displayed.");
				    }
				    else
				    {
				        System.out.println("Image displayed.");
				    }
				}
						
		}
		}
		catch(Exception e){
			e.printStackTrace();
			status = false;
		}
	return status;
		
	}

/*public static boolean verifyblock() throws InterruptedException{
	Thread.sleep(5000);
	Assert.assertTrue(elementPresentOrNot(topnavblk_e));
	Assert.assertTrue(elementPresentOrNot(categoryblk_e));
	Assert.assertTrue(elementPresentOrNot(logoheaderblk_e));
	Assert.assertTrue(elementPresentOrNot(topcategoryblk_e));
	for(int i = 1 ; i<10 ; i++){
		String str = Integer.toString(i);
		Assert.assertTrue(elementPresentOrNot(teaserblk_e(str)));
	}
	return false;
}*/

	public static void links(String URL) throws ClientProtocolException, IOException{
	  	   try{
		//Method to verify link is broken or not
	  		   System.out.println(URL);
		  HttpClient client = HttpClientBuilder.create().build();
		  HttpGet request = new HttpGet(URL);
		  HttpResponse response = client.execute(request);
			
		  if (response.getStatusLine().getStatusCode() != 200){
			//if link is broken
			System.out.println(URL +" : Invalid link");
			}
		  
			else{
		//if link is not broken then print the url and statment

				System.out.println(URL + " : link is not broken ");
		
			 }
		  		  
	  	  }
	  	   catch(Exception e){
	  		  e.printStackTrace();
	  	   }
	    
	    
	}
	
}
