package loops;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		int a;
		Scanner s= new Scanner(System.in);
        System.out.println("enter the number ");
        a= s.nextInt();
        System.out.println("you entered the number is :"  +a);
		
		if(a>12){
			System.out.println("a is gretaer");
			System.out.println("if statement covered");
			System.out.println("else ignored");
		}
		else if(a<12){
			System.out.println("entered number is smaller");
			 System.out.println("else if statement covered");
		}
				else {
				System.out.println("else statement covered");
				System.out.println("entered number is equal to 12");
			   	}
	}
}
