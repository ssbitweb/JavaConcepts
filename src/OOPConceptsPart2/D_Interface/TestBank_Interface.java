package OOPConceptsPart2.D_Interface;

public abstract class TestBank_Interface {

	public static void main(String[] args) {
		
		System.out.println(USBank.minBalance);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan(); 
		hs.carLoan();
		hs.stock();
		
		// dynamic polymorphism
		// child class object is referred by parent Interface reference variable
		
		USBank ub = new HSBCBank();
		ub.credit();
		ub.debit();
		ub.transferMoney();
//		ub.carloan();		 // ERROR -- car loan is HSBC's own method cant access.
//		ub.ecucationLoan();	 // Error -- not possible coz parent ref var trying to access Brazil's method.

	}

}
