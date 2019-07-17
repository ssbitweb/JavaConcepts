package OOPConceptsPart2.D_Abstraction;

public class TestBank extends DCBBank {

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();

		hb.credit(); // Bank--credit
		hb.debit();  // Bank--debit
		hb.loan(); 	 // HDFC--loan mathod

		Bank b = new HDFCBank();

		b.credit();  // Bank--credit
		b.debit(); 	 // Bank--debit
		b.loan(); 	 // HDFC--loan mathod
		
		TestBank tb = new TestBank();
		tb.credit();  // DCB--credit --> 0% abstraction

	}

}
