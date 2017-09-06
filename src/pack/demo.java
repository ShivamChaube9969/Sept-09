package pack;

public abstract class demo implements demo3 {
	
	public static void main(String[] args) {
		System.out.println("working without implementing any method");
	}
}

interface demo3 {
	void walk();

	void run();

	void sleep();
}
