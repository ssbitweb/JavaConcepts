package OOPConceptsPart2.E_Interface;

// In Interface we define only method definition/prototype , not method body
// In Interface we declare variables, and variables by default static in nature
// variable value will not changed its final in nature
// no static method in interface
// no main method in interface
// can not create constructor.
// we can not create object of interface
// Interface is abstract in nature
// Implements keyword is used
// 100 % abstraction.


public interface USBank {
		
	int minBalance = 100;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	
	
	/*	public USBank() {			// ERROR - interface can not have constructor
	
	}
	*/

}
