package applicationUtility;

import org.openqa.selenium.By;

import Utility.Base;

public class RegistrationLogin extends Base {
	
	private static String vorname = ".//*[@id='customer_firstname']";
	private static String nachname = ".//*[@id='customer_lastname']";
    private static String emailAdresse = ".//*[@class='account_creation']/div[3]/input[@id='email']";
    private static String ihrPasswort = ".//*[@class='account_creation']/div[4]/div/input[@id='passwd']";
    private static String weiter = ".//*[@id='submitAccount']";
    private static String ihrKundenbereich = ".//*[@id='center_column']/div[1]/h1";
    private static String loginEmail =".//*[@id='login_form']/div[2]/div[1]/input[@id='email']";
    private static String loginPassword = ".//*[@id='login_form']/div[2]/div[2]/input[@id='passwd']";
    private static String loginSubmit = ".//*[@id='login_form']/div[2]/p[2]/button";
    private static String loginError = ".//*[@class='alert alert-danger']/li";
    
   
    
    
    
    public static void enterVorname(String firstname){
    	driver.findElement(By.xpath(vorname)).sendKeys(firstname);
    }
    
    public static void clearVorname(){
    	driver.findElement(By.xpath(vorname)).clear();
    }
    
    public static void enterNachname(String lastname){
    	driver.findElement(By.xpath(nachname)).sendKeys(lastname);
    }
    
    public static void clearNachname(){
    	driver.findElement(By.xpath(nachname)).clear();
    }
    
    public static void enterEmailAdresse(String email){
    	driver.findElement(By.xpath(emailAdresse)).sendKeys(email);
    }
    
    public static void clearEmail(){
    	driver.findElement(By.xpath(emailAdresse)).clear();
    }

    public static void enterIhrPasswort(String password){
    	driver.findElement(By.xpath(ihrPasswort)).sendKeys(password);
    }
    
    public static void clickWeiter(){
    	driver.findElement(By.xpath(weiter)).click();
    }
    
    public static String getTextIhrKundenbereich(){
    	String text=null;
    	text = driver.findElement(By.xpath(ihrKundenbereich)).getText();
    	
    	return text;
    }
    
    
    public static void enterLoginEmail(String email){
    	driver.findElement(By.xpath(loginEmail)).sendKeys(email);
    }
    
    public static void clearLoginEmail(){
    	driver.findElement(By.xpath(loginEmail)).clear();
    }
    
    public static void enterLoginPassword(String password){
    	driver.findElement(By.xpath(loginPassword)).sendKeys(password);
    }
    
    public static void loginSubmit(){
    	driver.findElement(By.xpath(loginSubmit)).click();
    }
    
    public static String verifyLoginErrorMsg(){
    	String loginErrorMsg = null;
    	loginErrorMsg = driver.findElement(By.xpath(loginError)).getText();
    	return loginErrorMsg;
    }
}
