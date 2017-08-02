package java_know;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter the two numbers: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z= x+y;
		System.out.println("sum of enetered integers ="+z);
	}
}
