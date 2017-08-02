package oopsConcepts;

public class Variables {
	int j=10;
	static String name;
	String comp;
	
	void staticvariables(){
		int i;
		
		//System.out.println(i);
		System.out.println(j);
		name= "ishan";
		comp= "web";
	}
	

	public static void main(String[] args) {
		
		Variables sv= new Variables();
		sv.staticvariables();
		name= "ishan";
		System.out.println(name);
		
		
		
		
		
		
		
		
	}

}
