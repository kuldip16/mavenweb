 package com.moebel;


	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
	public class TC19 {
		public static void main(String[] args) throws InterruptedException{

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://book2.spicejet.com/"); 
			driver.manage().window().maximize();
			Thread.sleep(3000);
			List<WebElement> footer = driver.findElements(By.xpath(".//*[@href='GetPage.aspx?pg=http://www.spicejet.com/CorporateOverview.aspx']"));  // Get Footer element which contains all footer links
			/*int size = footer.findElements(By.tagName("a")).size();
			System.out.println("total number of links ="+ size) ; 

			int i = size; //number of links
			for(int j = 0;j<i;j++){    //create loop based upon number of links to traverse all links 
				System.out.println(j);
				footer= driver.findElement(By.xpath("//div [@id='footerTable']"));   // We are re-creating "footer" webelement as DOM changes after navigate.back()
				footer.findElements(By.tagName("a")).get(j).getText();
				footer.findElements(By.tagName("a")).get(j).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				if(driver.getTitle().contains("404")) {
					System.out.println("404 Found");
				} 
	            driver.navigate().back();
				Thread.sleep(4000);
			}*/
			
		for(WebElement w : footer)
				{System.out.println(w.getText());
			
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("404")) {
				System.out.println("404 Found");
			} 
            driver.navigate().back();
				
				}
			/*footer.click();
			
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("404")) {
				System.out.println("404 Found");
			} 
            driver.navigate().back();
		*/
			
		}
	}

	
	