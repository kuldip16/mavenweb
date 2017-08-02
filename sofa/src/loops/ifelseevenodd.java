package loops;

import java.util.Scanner;

public class ifelseevenodd {

	public static void main(String[] args) {
		float a;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number :");
		a = s.nextFloat();
		System.out.println("you entered the number :" + a);
		if (a % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}
}
