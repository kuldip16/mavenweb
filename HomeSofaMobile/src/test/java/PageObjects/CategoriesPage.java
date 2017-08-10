package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;

public class CategoriesPage extends BaseMobile {
	
	public static String firstProductInListXpath = "//div[@class='product-container']/div[1]/a/img";
	public static String addToWishlistXpath = "//div[@class='product-container']/div[2]/div[2]/button[@class='home_button wishlist-warp wishlist_prod addFav']";
	public static String removeFromWishlistXpath = "//div[@class='product-container']/div[2]/div[2]/button[@class='home_button wishlist-warp wishlist_prod removeFav']";
	

	public static String BurgerMenuXpath = ".//*[@id='header']/div[1]/i";
	public static String SubCategoriesXpath ="//div[@class = 'top-categories']/ul/li/figure/figcaption/a";
	public static String CategoryFilterBtnXpath = ".//*[@id='cat_search_result']/button";
	
	public static String productcategorynameXpath = "//div[@class = 'prduct-detail']/p/a";
	public static String dropdown2= ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[2]/i";
	public static String dropdown1= ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[1]/i";
	public static String dropdown3= ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[3]/i";
	
	public static boolean status = false;
	public static int count=0;
	
	
	public static boolean categroy() throws InterruptedException{
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on burger menu" );
		utilMobile.clickevent(BurgerMenuXpath);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the given subcategory name" );
		utilMobile.getelement(utilMobile.getTestData("wohnlandschaft"),SubCategoriesXpath);
		//Thread.sleep(100000);
		System.out.println("category page loaded");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying on the category page " );
		utilMobile.MatchElement(utilMobile.getTestData("uppercasewohnlandschaft"), productcategorynameXpath);
		//return true;
		return SearchPage.searchfilterfunc(CategoryFilterBtnXpath);
		
	}
	
	
	public static boolean category(String subcategory, String uppercasesubcate) throws InterruptedException{
		
		  try{
			
			if(count == 0){
				count++;
			}
			else{
				
				System.out.println("2nd category name");
				burgermenu(subcategory);
			}
			
			    System.out.println("In category func");
				utilMobile.getelement(subcategory,SubCategoriesXpath);
				//Thread.sleep(100000);
				System.out.println("category page loaded");
				ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying on the category page category name is correct or not" );
				status = utilMobile.MatchElement(uppercasesubcate, productcategorynameXpath);
				if (status){
					ExtentTestManager.getTest().log(LogStatus.PASS, "The product's category name are same as selected category as "+ subcategory );
				}
				else
				{
					ExtentTestManager.getTest().log(LogStatus.FAIL, "The product's category has different category name in the list of records it is not same as expected "+ subcategory );
				}
				//return true;
				ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying filter functionality on the category page" );
				status = SearchPage.searchfilterfunc(CategoryFilterBtnXpath);
				if (status){
					ExtentTestManager.getTest().log(LogStatus.PASS, "Filter functionality of caetgory "+ subcategory+" is working properly");
				}
				else
				{
					ExtentTestManager.getTest().log(LogStatus.FAIL, "Filter functionality of caetgory "+ subcategory+" is working properly" );
				}
				
		}
		catch(Exception e){
			System.out.println("not found "+ e.getMessage());
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Filer functionality is not working properly" );
		}
		return status;
			}
			
			public static boolean allcategories() throws InterruptedException{
				try{
				
				ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the name of subcategories" );
				int j=0;
				String[] names = new String[20];
				 List<WebElement> drop = driver.findElements(By.xpath(SubCategoriesXpath));
				 java.util.Iterator<WebElement> i = drop.iterator();
				
				 while(i.hasNext()){
					
					WebElement row = i.next();
					String  str = row.getText();
					//System.out.println("allcategories "+str);
					
					if(str.equalsIgnoreCase("")){
						System.out.println(str);
					}
					else{
					     System.out.println(str);
						 names[j]=str;
						//category(str, str.toUpperCase());
						j++;
					}
					//category(str, str.toUpperCase());
					
					
					}
				 for(j=0; j<names.length;j++)
				 {
					 System.out.println(names[j]+" final names");
					ExtentTestManager.getTest().log(LogStatus.INFO, "Storing the names in array");
					if(names[j]!=null){
						
					 ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the subcategory "+ names[j]);	
					status = category(names[j], names[j].toUpperCase());
					if (status){
						ExtentTestManager.getTest().log(LogStatus.PASS, names[j] +" category is working fine" );
					}
					else
					{
						ExtentTestManager.getTest().log(LogStatus.FAIL, names[j] + " category is displaying wrong data" );
					}
					
		    	   }
				}
				 count = 0;
			}
				catch(Exception e){
					ExtentTestManager.getTest().log(LogStatus.FAIL, "Element is not fetching properly of subcategroy" );
					System.out.println("Elment Not found"+e.getMessage());
					
				}
				return status;
		  }
			public static void burgermenu(String str) throws InterruptedException{
				
				
				if("Relaxliege".contains(str)||"Schlafsofa".contains(str)||"2-Sitzer".contains(str)||"3-Sitzer".contains(str)||"Bigsofa".contains(str)){
					ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the subcategoryies of Einzelsofas");
					System.out.println("entered in loop");
					ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking burger menu" );
					utilMobile.clickevent(BurgerMenuXpath);
					Thread.sleep(4000);
					ExtentTestManager.getTest().log(LogStatus.INFO, "Expanind the category menu" );
					utilMobile.clickevent(dropdown2);
				}
				
				else if("Ecksofa".contains(str)||"Wohnlandschaft".contains(str)){
					ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the subcategoryies of Ecksofas & Wohnlandschaften");
					System.out.println("entered in 2nd loop");
					ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking burger menu" );
					utilMobile.clickevent(BurgerMenuXpath);
					Thread.sleep(4000);
					//utilMobile.clickevent(dropdown2);
					
				}

				else if("Loungesessel".contains(str)||"XXL-Sessel".contains(str)||"Chesterfieldsessel".contains(str)||"Ohrensessel".contains(str)||"Hocker".contains(str)){
					
					ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the subcategoryies of Sessel & Hocker");
					System.out.println("entered in 3nd loop");
					ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking burger menu" );
					utilMobile.clickevent(BurgerMenuXpath);
					Thread.sleep(4000);
					ExtentTestManager.getTest().log(LogStatus.INFO, "Expanind the category menu" );
					utilMobile.clickevent(dropdown3);
					
				}
				
				else{
					
					ExtentTestManager.getTest().log(LogStatus.FAIL, "Caetgory Name is wrong" );
					System.out.println("not in loop");
				}
				
			}
			
			public static boolean clickingdropdown() throws InterruptedException{
				
				System.out.println("dropdown");
				ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on burger menu" );
				utilMobile.clickevent(BurgerMenuXpath);
				//Thread.sleep(5000);
				utilMobile.clickevent(dropdown1);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the given subcategory name" );
				utilMobile.clickevent(dropdown2);
				Thread.sleep(4000);
				
				status = allcategories();
				if (status){
					ExtentTestManager.getTest().log(LogStatus.PASS, "Einzelsofas category is working fine" );
				}
				else
				{
					ExtentTestManager.getTest().log(LogStatus.FAIL, "Einzelsofas category is displaying wrong data" );
				}
				
				ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on burger menu" );
				Thread.sleep(4000);
				utilMobile.clickevent(BurgerMenuXpath);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the given subcategory name" );
				//utilMobile.clickevent(dropdown1);
				status = allcategories();
				if (status){
					ExtentTestManager.getTest().log(LogStatus.PASS, "Ecksofas & Wohnlandschaften category is working fine" );
				}
				else
				{
					ExtentTestManager.getTest().log(LogStatus.FAIL, "Ecksofas & Wohnlandschaften category is displaying wrong data" );
				}
				
				ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on burger menu" );
				utilMobile.clickevent(BurgerMenuXpath);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the given subcategory name" );
				utilMobile.clickevent(dropdown3);
				status = allcategories();
				if (status){
					ExtentTestManager.getTest().log(LogStatus.PASS, "Sessel & Hocker category is working fine" );
				}
				else
				{
					ExtentTestManager.getTest().log(LogStatus.FAIL, "Sessel & Hocker category is displaying wrong data" );
				}
				
				return status;
			}

		}





