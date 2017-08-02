package loops;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int a;
		String monthstring;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the integer");
		a= s.nextInt();
		System.out.println("you entered the number :" +a);
		switch (a){
		//break missing case
		case 1 : monthstring = "Sunday"; 
		case 2 : monthstring= "Monday"; 
		case 3 : monthstring= "Tuesday";
		case 4 : monthstring= "wednesday";break;
		case 5 : monthstring= "Thursday";break;
		case 6 : monthstring= "Friday";break;
		case 7 : monthstring= "Saturday";break;
		default : monthstring="invalid month" ; break;
		}
		if(monthstring.isEmpty()){
			System.out.println("invalid input");
		}
		//or you can use else
		if(monthstring.contains(monthstring))
			{
			System.out.println(monthstring);
	}
		}
	}
