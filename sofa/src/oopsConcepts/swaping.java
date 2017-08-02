package oopsConcepts;

public class swaping {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		System.out.println("before swap\n ="+ i+"\n="+j);
		i= i+j;
		j= i-j;
		i=i-j;
		System.out.println("after swap\n ="+ i+"\n="+j);		

	}

}
