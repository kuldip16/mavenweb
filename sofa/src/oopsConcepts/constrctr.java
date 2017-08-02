package oopsConcepts;

public class constrctr {
	int i;
	float b;
	String c;
	
	constrctr(){
		
		System.out.println("test constrctr");
		System.out.println(i);
		System.out.println(b);
		System.out.println(c);
	}
	
constrctr(int k){
		
		System.out.println(k);
	}
	public static void main(String[] args) {
		
		constrctr cnt= new constrctr();
		constrctr cnts= new constrctr(10);
		
	}

}
