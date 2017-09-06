package pack;

class demo6 {
	static void test() {
		System.out.println("running");
	}
}

public class Super extends demo6 {
	public static void main(String[] args) {
		test();
	}
}
