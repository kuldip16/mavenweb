package oopsConcepts;

public class Objects {
	
	int id;
	String name, location;
	
	
	void qainfo(String name, String profile){
		System.out.println(name+","+ profile);
		
	}
	
	void area(int length, int width){
		System.out.println("Area is="+ length*width);
		
	}

	public static void main(String[] args) {
	
		// Creating Object of class
		Objects qa1= new Objects();
		System.out.println(qa1.id);
		System.out.println(qa1.name);
		
		// Initializing Objects through reference
		
		  qa1.id= 100;
		  qa1.name= "Ishan";
		  qa1.location= "gurgaon";
		  
		  System.out.println(qa1.id);
		  System.out.println(qa1.name);
		  System.out.println(qa1.location);
		  
		// Initializing Multiple Objects
		  Objects qa2= new Objects();
		  qa1.id= 100;
		  qa2.id= 101;
		 
		  System.out.println(qa1.id);
		  System.out.println(qa2.id);
		  
		  // Initializing Objects through methods
		  
		  qa1.qainfo("ishan", "qa-inspire");
		  qa2.qainfo("kuldip", "qa-hybris");
		  
		  
		  qa1.area(10, 5);
		  
		  
		  //real time banking program 
		  	  
	}

}
