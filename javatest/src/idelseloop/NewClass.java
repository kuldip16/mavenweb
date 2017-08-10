package idelseloop;

import java.lang.reflect.Method;


public class NewClass {

	public static void main(String[] args)
	{
		System.out.println(Method.class);
		NewClass nc= new NewClass();
		nc.test();
	    
	}
	public void test()
	{
	    //System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
		System.out.println();
	}

}
