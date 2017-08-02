package testngFiles;

import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	  public void openbrowser() 
	{
		  System.out.println("openbrowser");
	  
	}
	  

	  @Test(dependsOnMethods={"gotourl"})
	 
	 public void closebrowser() 
	{
		  System.out.println("closebrowser");
	 
	 }
	 
	 
	  @Test(dependsOnMethods={"openbrowser"})
	 
	 public void gotourl() 
	{
		  
		  System.out.println("gotourl");

	  }
//@Test(enabled=false)
	  // @Test(dependsOnMethods={"openbrowser"},alwaysRun=true)

//@Test(timeOut=45000)
}
