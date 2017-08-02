package tasknew;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		  int x,y;
		  Scanner s = new Scanner(System.in);
	        System.out.print("Enter number to swap:");
	        x = s.nextInt();
	        y = s.nextInt();
	        
	        System.out.println("Before swapping\nx = " +x+ "\ny = " +y);
	        x=x+y;
	        y=x-y;
	        x=x-y;
	        
	        System.out.println("after  swapping\nx = " +x+ "\ny = " +y);
	}
	
} 