package task;

import java.util.Scanner;

public class reversefifty {
	public static void main(String[] args) {
		
		int a;
		  Scanner s = new Scanner(System.in);
		  a = s.nextInt();
		  System.out.println("enter the value from 1 to " + a);
		  for (int i = a; i >= 1; i--) {
		   System.out.println(i);
		  }
		 }
	
	}
