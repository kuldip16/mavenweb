package te;

public class TC01 {
	int i = 5;

	public static void main(String[] args) {
		TC01 ct = new TC01();
		ct.test();
	}

	void test() {
		int i = 7;
		System.out.println(this.i);
	}
}
