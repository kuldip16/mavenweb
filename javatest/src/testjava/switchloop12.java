package testjava;

public class switchloop12 {
	public static void main(String[] args) {
		int a = 2;
		int b= 2;
		int c= 6;
		//swicth is not taking the comparison
		switch(a)
		{
			case 1  : System.out.println("hello");break;
			case 2 : System.out.println("hello2");break;
			default : System.out.println("default");break;
		}
		System.out.println("bye bye");
	}
}