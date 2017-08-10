package PageObjects;

import UtilityMobile.BaseMobile;



public class HomePage extends BaseMobile {
	
	public static String homeSofaLogo = "//div[@class='comp-logo']/a[@title='Homesofa.de']";
	public static String menu = ".//*[@id='header']/div[1]";
	public static String menuCountXpath = "//span[@class='jq-wishlist-menu-count']";
	public static String productImages = "//div[@class='product-container']/div/a/img";
	public static String productNames = "//div[@class='product-container']/../..//h5";
	public static String productPrices = "//div[@class='product-container']/../..//div[@class='content_price']";
	public static String productCategories = "//div[@class='product-container']/../..//a[@class='cate-name prd-cat-clk']";
	
	
	

}
