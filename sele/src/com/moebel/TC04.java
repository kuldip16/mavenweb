package com.moebel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("browser launched");
		String t = driver.getTitle();
		String s="facebook - Log In or Sign Up";
		System.out.println(t);
		if(t.equals(s)){
			System.out.println("fcaebook  hoem page opened");
		}
		else
			System.out.println("error in facebook page");
		//driver.getPageSource();
		String fb= driver.getCurrentUrl();
		String tb = "https://www.Facebook.com/";
		System.out.println(fb);
		if(fb.equalsIgnoreCase(tb) ){
			System.out.println("correct url ");
			System.out.println("ss");
		}
		else
		System.out.println("bad luck");
		System.out.println(t.length());
		System.out.println(fb.length());
		System.out.println(t);
		int len= driver.getPageSource().length();
		System.out.println(len);
		driver.quit();
	}
}