package OOPConceptsPart1;

// **class and Objects Concept**

// Class --class is the blueprint for creating an objects. which has states and behavior.(entities).
// variable --> represents the states..
// methods -->  represents the behavior..
// Object--objects are the instances of class.

public class _01_Classes_And_Objects {
	
	int speed;		// instance/global variable or class variable
	int wheels;

	public static void main(String[] args) {

		//new _01_Classes_And_Objects() --> this is object of class Vehicles
		//new keyword is used to create object.
		//bike,car,train --> this is object reference variable of class Vehicles
		
//		speed = 10; // we cannot access class variable without creating objects.
		
		_01_Classes_And_Objects bike = new _01_Classes_And_Objects();		// creating objects.  why? --> to access class variables. i.e Vehicle variable
		_01_Classes_And_Objects car = new _01_Classes_And_Objects();
		_01_Classes_And_Objects train = new _01_Classes_And_Objects();
		_01_Classes_And_Objects aeroplane = new _01_Classes_And_Objects();
		
		
		bike.speed = 25;
		car.speed = 50;
		train.speed = 100;
		aeroplane.speed = 1000;
		
		bike.wheels = 2;
		car.wheels = 4;
		train.wheels = 450;
		aeroplane.wheels = 3;
		
		
		System.out.println("The speed of bike is " + bike.speed + " km/h");  // 25
		System.out.println(bike.wheels);
		
		System.out.println(car.speed);		// 50
		System.out.println(car.wheels);
		
		System.out.println(train.speed);
		System.out.println(train.wheels);
		
		System.out.println(aeroplane.speed);
		System.out.println(aeroplane.wheels);
		
		
		
		
		//shifting reference
		bike = car;
		car = train;
		train = aeroplane;
		
		// after shifting reference
		System.out.println(car.speed);		// 100 
		System.out.println(train.speed); 	// 1000
		
		

	}

}
