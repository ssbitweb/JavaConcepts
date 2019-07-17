package OOPConceptsPart2.C_Polymorphism;

// Polymorphism - poly means many, morphism means -taking forms
// Polymorphism means ability to take many forms.


public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism -- compile-time polymorphism. /or MethodOverloading
		B_BMW b = new B_BMW(); // child class object is referred by child class reference variable
		b.start();	// BMW--start
		b.stop();	// Car--stop  --> From Car class
		b.refuel();	// Car--refuel --> From Car class
		b.theftSafety(); // BMW--theftSafety -- > from BMW Class
		b.engine(); // Vehicle--engine --> From Vehicle class
		
		//------------------------------------------------------------------
		
		A_Car c = new A_Car();
		c.start();	// Car--start
		c.stop();	// Car--stop
		c.refuel();	// Car--refuel
		
//		c.theftSafety(); --> ERROR --not accessible because present in BMW
		
		
		//----------------------------------------------------------------------
		
		// Top casting	 --dynamic polymorphism -- run time polymorphism. /or MethodOverriding
		A_Car c1 = new B_BMW(); // child class object can be referred by parent class reference variable -- dynamic polymorphism
		c1.start();	// BMW--start -- > method overriding.
		c1.stop();	// Car--stop
		c1.refuel(); // Car--refuel
		c1.engine(); // Vehicle--engine
		
//		c1.theftSafety()  --> ERROR -- object is BMW but reference variable c1 is of Car class - so not accessible.
		
		//-------------------------------------------------------------------------
		
		// down casting -- parent class object is referred by child class refrence variables--
//		BMW b1 = (BMW) new Car();	// ERROR - ClassCastException  in run time
	
	}

}
