package loops;

import java.util.Scanner;

public class switchloop {
	public static void main(String[] args) {
		int a;
		String monthstring;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the integer");
		a= s.nextInt();
		System.out.println("you entered the number :" +a);
		
		switch (a){
		case 1 : monthstring = "Sunday"; break;
		case 2 : monthstring= "Monday"; break;
		case 3 : monthstring= "Tuesday";break;
		case 4 : monthstring= "wednesday";break;
		case 5 : monthstring= "Thursday";break;
		case 6 : monthstring= "Friday";break;
		case 7 : monthstring= "Saturday";break;
		default : monthstring="invalid month" ; break;
		}
			System.out.println(monthstring);
	}
}
