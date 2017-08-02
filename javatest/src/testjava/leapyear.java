package testjava;

public class leapyear {

	public static void main(String[] args) {
		int i= 2016;
		
		if((i %400==0  || i%4==0 )&& (i%100!=0))
			{
			System.out.println("is leap year");
			}
		else
			
			System.out.println("not a leap year");
	}
	
}
