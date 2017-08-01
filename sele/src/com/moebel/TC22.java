package com.moebel;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC22 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		  options.addExtensions(new File("D:\\Training\\extension_5_10_1.crx"));
		  ChromeDriver driver = new ChromeDriver(options);
		
	}

}
