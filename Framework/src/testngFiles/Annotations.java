package testngFiles;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
@Test
	
	public void test1()
	{
		
		System.out.println("this is method1");

		
		
	}
	//run before the test execution starts 
	
@BeforeTest
	
	public void openbrowser()
	
	{
		
		System.out.println("this is openbrowsermethod");
		
		
	}
	
@AfterTest
	
	public void close()
	
	{
		
		System.out.println("this is close");
		
		
	}

}
