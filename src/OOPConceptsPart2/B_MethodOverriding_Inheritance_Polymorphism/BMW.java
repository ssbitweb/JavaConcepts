package OOPConceptsPart2.B_MethodOverriding_Inheritance_Polymorphism;

// Inheritance -- child class inherits the properties of parent class is called inheritance.
// using extends keyword.
// parent class can not inherits child class.. 
// like one child can not have two parents. --( so multiple inheritance not possible)


// MethodOverriding -- when same method is present in parent class as well as in child class 
//					   with same name and same number of parameter is called method overriding.



// child class or sub-class					
public class BMW extends Car{	// HAS-A relationship , // inheritance 
	
	public void start() {		// method overriding - start() method is already present in parent class(Car).
		System.out.println("BMW--start"); // preference will be given to child method.
	}
	
	public void theftSafety() {
		System.out.println("BMW--theftSafety");
	}

}
