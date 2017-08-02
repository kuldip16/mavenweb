package UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.MathProvider;

public class JunitMathProvider1 {
	MathProvider provider;
	public JunitMathProvider1(){
		provider= new MathProvider();
	}
	
@Test
public void add1()
{System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
int firstNumber = 10;
int secondNumber = 20;
assertEquals(firstNumber + secondNumber, provider.Add(firstNumber, secondNumber));
System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
}


    @Test
	public void subtract()
	{
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	    int firstNumber = 10;
	    int secondNumber = 20;
		assertEquals(firstNumber - secondNumber, provider.Substract(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
}

