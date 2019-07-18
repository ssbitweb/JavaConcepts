package OOPConceptsPart2.D_Abstraction;

// Abstraction -- Hiding implementation logic and only defining prototype method(only method signature) i.e without method body.

// Abstract class -- abstract class can have abstract as well as non abstract(CONCRETE) method.

// partial abstraction - at least one abstract method
// 100% abstraction -- all abstract method. e.g Interface
// 0% abstraction --  class defined as abstract but no abstract method.
// can not create the object of abstract classes.
// final method can not be overridden..

public abstract class Bank {

	public abstract void loan(); // abstract method  -- no method body
											
	public void credit() {	// non abstract method -- simple method
		System.out.println("Bank--credit");
	}
	
	public void debit() {
		System.out.println("Bank--debit");
	}
}
