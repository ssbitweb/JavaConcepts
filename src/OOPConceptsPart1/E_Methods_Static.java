package OOPConceptsPart1;

public class E_Methods_Static {

	// if method declare as static we do not need to create Object of that class to access the method.
	
	public static void main(String[] args) {			
		
//		Methods_static m = new Methods_static();			// creating object and storing in ref var m.
//		boolean boo = m.isOddNumber(3);						// storing result in boolean var boo.
//		System.out.println(boo);							// printing result.
		
		boolean boo = isOddNumber(3);
		System.out.println(boo);		// true
		
	}
	
	public static boolean isOddNumber(int n) {
		if(n%2 != 0) {
			return true;				// returning result
		}
		return false;					// boolean by-default return false
	}

}
