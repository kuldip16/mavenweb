package task;

import java.util.Scanner;

public class printodd {

	public static void main(String[] args) {
		int a;
		  Scanner s= new Scanner(System.in);
		  System.out.println("enter the number");
		  a= s.nextInt();
		  System.out.println("print the odd number between 1 and "+a);
		         for (int i = 1;i<=a;i++){
		          if(i % 2 != 0)
		          {
		           System.out.println(i);
		          }
		         }
		         
		 }
	}