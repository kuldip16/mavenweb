package packTwo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	
	public void method()
	{System.out.println("first method");
	
	}
	@BeforeMethod
	public void print()
	{
		System.out.println("This is method");
		
	}

}
