package OOPConceptsPart2.C_Polymorphism;

// Polymorphism-- Polymorphism is ability to take many form
// poly means many and Morph means Form

// There are two types of Polymorphism.

// 1. Compile Time Polymorphism/( Method Overloading) / Static polymorphism/ 
// 2. Runtime Polymorphism / ( Method Overriding) / Dynamic Polymorphism

// 1. Method Overloading-- same method name with diff types of parameter, or 
//    different number of parameter or different order of parameter is called as method overloading.

// 2. Method Overriding -- method in child class which is already present in parent class having 
//    same name, same number and same order of parameter. i.e parent class method is overridden by child class method
//    is called method overriding.

public class A_Car extends Vehicle { // parent class

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
