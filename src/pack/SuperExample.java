package pack;

class Animal {
	Animal() {
		System.out.println("animal is created");
	}

	String color = "white";

	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	Dog() {
		super();
		System.out.println("dog is created");
	}

	@Override
	void eat() {
		System.out.println("dog is eating bread...");
	}

	void bark() {
		System.out.println("dog is barking...");
	}

	void work() {
		super.eat();
		eat();
		bark();
	}

	String color = "black";

	void printColor() {
		System.out.println("dog's color is " + color);// prints color of Dog
														// class
		System.out.println("animal's color is " + super.color);// prints color
																// of Animal
																// class
	}
}

public class SuperExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
		d.work();
	}
}