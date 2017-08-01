package com.amazon;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03 {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("browser launched");
        File scrnFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
        	FileUtils.copyFile(scrnFile, new File ("D:\\test\\"+System.currentTimeMillis()+" .png"));
        }
        catch(IOException e){
        	
        }
     
       
 	}

}
