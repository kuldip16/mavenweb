package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.LeftNavigationMenu;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.BaseMobile;
import UtilityMobile.utilMobile;

public class VerifyHomePage extends BaseMobile{
	
  @Test (enabled=false)
  public void verifyCategoryLinks() {
	  
	  String expectedPageHeading = "HomeSofa";
	  List <String> actualCategoryText = new ArrayList<String>();
	  List <String> pageTitle = new ArrayList<String>();
	  
	  utilMobile.clickByXpath(HomePage.menu);
	  actualCategoryText.add(utilMobile.getText(LeftNavigationMenu.ecksofasWohnlandschaftenXpath));
	  utilMobile.clickByXpath(LeftNavigationMenu.ecksofasWohnlandschaftenXpath);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  actualCategoryText.add(utilMobile.getText(LeftNavigationMenu.einzelsofasXpath));
	  utilMobile.clickByXpath(LeftNavigationMenu.einzelsofasXpath);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  actualCategoryText.add(utilMobile.getText(LeftNavigationMenu.sesselHockerXpath));
	  utilMobile.clickByXpath(LeftNavigationMenu.sesselHockerXpath);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  
	  for(int i=0;i<pageTitle.size();i++){
			 String pageT = pageTitle.get(i);
			 
			 if(pageT.equalsIgnoreCase(expectedPageHeading)){
				 ExtentTestManager.getTest().log(LogStatus.PASS, "Following link: "+pageT+"is working fine.");
			 }else{
				 ExtentTestManager.getTest().log(LogStatus.ERROR, "Following link: "+pageT+"is broken.");
			 }
		  }
	
	  for(int i=0;i<actualCategoryText.size();i++){
	
		 String categoryText = actualCategoryText.get(i);
	  
	  if(categoryText.equalsIgnoreCase(utilMobile.getTestData("category1"))
			  && categoryText.equalsIgnoreCase(utilMobile.getTestData("category2")) 
			  && categoryText.equalsIgnoreCase(utilMobile.getTestData("category3"))){
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Category linkText for: "+categoryText+"is correct.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.ERROR, "Category linkText for: "+categoryText+"is incorrect."); 
	  }  
	  
	  }
  }
  
  @Test (enabled=true)
  public void verifySubCategoryLinks() throws InterruptedException{
	  
	  List <String> actualSubCategoryText = new ArrayList<String>();
	  List <String> pageTitle = new ArrayList<String>();
	  String expectedPageHeading = "HomeSofa";
	  
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryEcsofaXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryWohnlandschaftXpath));
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown2Xpath);
	  
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryRelaxliegeXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategorySchlafsofaXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategory2SitzerXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategory3SitzerXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryBigsofaXpath));
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown3Xpath);
	  
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryLoungesesselXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryXXLSesselXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryChesterfieldsesselXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryOhrensesselXpath));
	  actualSubCategoryText.add(utilMobile.getText(LeftNavigationMenu.subCategoryHockerXpath));
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryLoungesesselXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Loungesessel.");
	 
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown3Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryXXLSesselXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on XXLSessel.");
	 
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown3Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryChesterfieldsesselXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Chesterfieldsessel.");
	  
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown3Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryOhrensesselXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Ohrensessel.");
	  
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown3Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryHockerXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Hocker.");
	  Thread.sleep(3000);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryEcsofaXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Ecsofa.");
	  Thread.sleep(3000);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryWohnlandschaftXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Wohnlandschaft.");
	  Thread.sleep(3000);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown2Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryRelaxliegeXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Relaxliege.");
	  Thread.sleep(3000);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown2Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategorySchlafsofaXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Schlafsofa.");
	  Thread.sleep(3000);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown2Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategory2SitzerXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on 2Sitzer.");
	  Thread.sleep(3000);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown2Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategory3SitzerXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on 3Sitzer.");
	  Thread.sleep(3000);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  utilMobile.clickByXpath(HomePage.menu);
	  
	  utilMobile.clickByXpath(LeftNavigationMenu.dropDown2Xpath);
	  utilMobile.clickByXpath(LeftNavigationMenu.subCategoryBigsofaXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Bigsofa.");
	  Thread.sleep(3000);
	  pageTitle.add(utilMobile.getAttribute("title",HomePage.homeSofaLogo));
	  
	  
	  for(int i=0;i<actualSubCategoryText.size();i++){
		 String linkText =  actualSubCategoryText.get(i);
		 
		 if(linkText.equalsIgnoreCase(utilMobile.getTestData("ecksofa")) || linkText.equalsIgnoreCase(utilMobile.getTestData("wohnlandschaft"))
				  || linkText.equalsIgnoreCase(utilMobile.getTestData("Relaxliege")) || linkText.equalsIgnoreCase(utilMobile.getTestData("Schlafsofa")) 
				  || linkText.equalsIgnoreCase(utilMobile.getTestData("2Sitzer")) || linkText.equalsIgnoreCase(utilMobile.getTestData("3Sitzer"))
				  || linkText.equalsIgnoreCase(utilMobile.getTestData("Bigsofa")) || linkText.equalsIgnoreCase(utilMobile.getTestData("Loungesessel"))
				  || linkText.equalsIgnoreCase(utilMobile.getTestData("XXLSessel")) || linkText.equalsIgnoreCase(utilMobile.getTestData("Chesterfieldsessel"))
				  || linkText.equalsIgnoreCase(utilMobile.getTestData("Ohrensessel")) || linkText.equalsIgnoreCase(utilMobile.getTestData("Hocker"))){
			
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Category linkText for:"+linkText+"is correct."); 
			 
		 }else{
			 ExtentTestManager.getTest().log(LogStatus.ERROR, "Category linkText for:"+linkText+"is incorrect."); 
		 }
	  }
	  
	  for(int i=0;i<pageTitle.size();i++){
		 String pageT = pageTitle.get(i);
		 
		 if(pageT.equalsIgnoreCase(expectedPageHeading)){
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Following link: "+pageT+"is working fine.");
		 }else{
			 ExtentTestManager.getTest().log(LogStatus.ERROR, "Following link: "+pageT+"is broken.");
		 }
	  }
	  
  }
  
  @Test (enabled=false)
  public void verifyProductList(){
	  List <WebElement> productImg = new ArrayList<WebElement>();
	  List <WebElement> productPrice = new ArrayList<WebElement>();
	  List <WebElement> productName = new ArrayList<WebElement>();
	  List <WebElement> productCategory = new ArrayList<WebElement>();
	  
	  productImg = utilMobile.getElements(HomePage.productImages);
	  productPrice = utilMobile.getElements(HomePage.productPrices);
	  productName = utilMobile.getElements(HomePage.productNames);
	  productCategory = utilMobile.getElements(HomePage.productCategories);
	  
	  if(productImg.size() == productPrice.size() && productPrice.size() == productCategory.size()
			  && productCategory.size() == productName.size() && productName.size() >= 10){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "All product's price , names , image and categories are visible and count is equal or greater than 10."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "For any product either price , name , image or category is not visible or product count on homepage is less than 10"); 
	  }
	  
	  for(int i=0;i<productCategory.size();i++){
		 WebElement prodCategory = productCategory.get(i);
		 String productCat = prodCategory.getText();
		 
		 if(productCat.equalsIgnoreCase(utilMobile.getTestData("ecksofa")) || productCat.equalsIgnoreCase(utilMobile.getTestData("wohnlandschaft"))
				  || productCat.equalsIgnoreCase(utilMobile.getTestData("Relaxliege")) || productCat.equalsIgnoreCase(utilMobile.getTestData("Schlafsofa")) 
				  || productCat.equalsIgnoreCase(utilMobile.getTestData("2Sitzer")) || productCat.equalsIgnoreCase(utilMobile.getTestData("3Sitzer"))
				  || productCat.equalsIgnoreCase(utilMobile.getTestData("Bigsofa")) || productCat.equalsIgnoreCase(utilMobile.getTestData("Loungesessel"))
				  || productCat.equalsIgnoreCase(utilMobile.getTestData("XXLSessel")) || productCat.equalsIgnoreCase(utilMobile.getTestData("Chesterfieldsessel"))
				  || productCat.equalsIgnoreCase(utilMobile.getTestData("Ohrensessel")) || productCat.equalsIgnoreCase(utilMobile.getTestData("Hocker"))){
			 
			 ExtentTestManager.getTest().log(LogStatus.PASS, "All listed product's categories are valid."); 
		 }else{
			 ExtentTestManager.getTest().log(LogStatus.FAIL, "Product with incorrect category is: "+productCat);
		 }
	  }
  }
  
}
