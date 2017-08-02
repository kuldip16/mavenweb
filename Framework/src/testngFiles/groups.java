package testngFiles;

import org.testng.annotations.Test;

public class groups
{
 
@Test(groups={"a"})

public void test1()
{
	  System.out.println("test1");

 }
 


@Test(groups={"b"})
 

public void test2() 
{
	  
	  System.out.println("test2");

 }
 
 

 @Test(groups={"a"})
 
public void test3() 
{
	  System.out.println("test3");

}
 


@Test(groups={"b"})

public void test4()
{
	  System.out.println("test4");
 }

}


