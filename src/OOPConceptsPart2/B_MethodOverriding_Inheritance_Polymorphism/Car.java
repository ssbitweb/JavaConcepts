package OOPConceptsPart2.B_MethodOverriding_Inheritance_Polymorphism;

// parent class or super class

public class Car extends Vehicle {

	public void start() {
		System.out.println("Car--start");
	}
	
	public void stop() {
		System.out.println("Car--stop");
	}
	
	public void refuel() {
		System.out.println("Car--refuel");
	}
	
}
