package pack;

abstract class demo1 implements demo2 {
	demo1() {
		System.out.println("abstract constructor");
	}

	void jog() {
		System.out.println("Jogging");
	}

	abstract void walk();

	public void sleep() {
		System.out.println("Sleeping");
	}
}

interface demo2 {
	/*
	 * demo2(){ System.out.println("interface constructor"); }
	 */
	void run();

	void sleep();
}

public class AbstractionInterface extends demo1 {
	public void run() {
		System.out.println("Running");
	}

	public void walk() {
		System.out.println("Walking");
	}

	public static void main(String[] args) {
		demo2 obj = new AbstractionInterface();
		obj.run();
		obj.sleep();
		demo1 obj2 = new AbstractionInterface();
		obj2.jog();
		obj2.walk();
	}
}
