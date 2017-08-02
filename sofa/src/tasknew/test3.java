package tasknew;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		int x,y,temp;
		  Scanner s = new Scanner(System.in);
	        System.out.print("Enter number to swap:");
	        x = s.nextInt();
	        y = s.nextInt();
	        
	        System.out.println("Before swapping\nx = " +x+ "\ny = " +y);
	       temp = x;
	       x=y;
	       y= temp;
	       System.out.println("number swapped \nx = " +x+ "\ny = " +y);
	        

	}

}
