package loops;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		float a;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number :");
		a= s.nextInt();
		System.out.println("entered number is : " + a);
		
		if(a<40 || a<=40){
			System.out.println("reattempt the exam");}
		else if(a>=50 && a<60){
			System.out.println("pass in second division");
		}
		else if (a >=60 && a<80){
			System.out.println("First division");
		}
		else if (a>=80 && a<=100){
			System.out.println("first division with distinction"); }
		
			else{
		System.out.println("enter valid input");
		}
	}

}
