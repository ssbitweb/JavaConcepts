package OOPConceptsPart2.D_Interface;

// if class implementing Interface the it must define/override all the methods of interface

public class HSBCBank extends Finance implements USBank, BrazilBank{ 	// **we are now achieving multiple inheritance
	// IS-A relationship
	
	// from finance class
	@Override
	public void stock() {		// this overriding
		System.out.println("HSBC--stock");
		
	}
	
	// overriding from USBank
	@Override
	public void debit() {		// this implementing
		System.out.println("HSBC--debit");
		
	}

	@Override
	public void credit() {
		System.out.println("HSBC--credit");
		
	}
	
	@Override
	public void transferMoney() {
		System.out.println("HSBC--transferMoney");		
	}
	
	// seperate HSBC method
	public void educationLoan() {
		System.out.println("HSBC--edu loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC--car loan");
	}

	// overriding from BrazilBank
	@Override
	public void mutualFund() {
		System.out.println("HSBC--mutualFund");
		
	}

}
