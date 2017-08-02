package oopsConcepts;

public class Methodscreations {
	
	
	public void nonstaticmethod(){
		System.out.println("this is a non-static method");
	}

	
	public void nonstatic_method(){
		System.out.println("this is a 2nd non-static method");
		nonstaticmethod();
	}
	
	
	public static void staticmethod(){
		System.out.println("this is a static method");
		
	}
	
	
	public static void main(String[] args) {
		Methodscreations mc= new Methodscreations();
		mc.nonstaticmethod();
		staticmethod();
		 	

	}
	
}
