

package UnitTests;
 
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Application.MathProvider;
 
public class JunitMathProvider2 {
		MathProvider provider;	
 
	public JunitMathProvider2(){
		provider = new MathProvider();
	};
 
	@Test
	public void multiply()
	{
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	    int firstNumber = 10;
	    int secondNumber = 20;
		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
}