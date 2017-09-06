package pack;

public class CovariantReturnType {
	
	public static void main(String[] args) {
		Vehicle obj1 = new Vehicle();
		obj1.engine();
		Car obj2 = new Car();
		obj2.engine();
	}
}
class Machine{
	
}
class ElectricMachine extends Machine{
	
}
class Vehicle{
	public Machine engine(){
		return new Machine();
	}
}
class Car extends Vehicle{
	public ElectricMachine engine(){
		return new ElectricMachine();
	}
}
