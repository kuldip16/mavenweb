package oopsConcepts;

public class staticblocks {
	
	static{
		System.out.println("open browser");
	}

	public static void main(String[] args) {
		System.out.println("move to login page");

	}
	
	static{
		System.out.println("visit website home page");
	}

}
/*A class has to be loaded in main memory before we start using it. Static block is executed during class loading. 
This is the reason why a static block executes before the main method.*/