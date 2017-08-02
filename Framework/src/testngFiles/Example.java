package testngFiles;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Example  {



@Test

public void verifyHomePageTitle() throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        
        Thread.sleep(2000);
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!"); 

        // Now submit the form. WebDriver will find the form for us from the element
        //driver.findElement(By.id("sbtninput")).click();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        

    }

}
