package OOPConceptsPart1;

// local variables-- are the black level variables..scope is within the block.
// global Variables-- are the class level variables.. scope is throughout the class.

public class _02_LocalVsGlobalVariables {
	
	String s = "sachin";	// s global/instance variables-- scope -- throughout the class
	int age = 25;			// age - global variable.

	public static void main(String[] args) {
		
		_02_LocalVsGlobalVariables m = new _02_LocalVsGlobalVariables();	// m local variables scope -- within main method.
		String name = m.s;											// name - local variable
		System.out.println(name);
		System.out.println(m.s);
		
		int result = m.sum();
		System.out.println(result);
		
		boolean boo = m.isEvenNumber(m.age);
		System.out.println(boo);
		
		
	}
	
	public int sum() {
		int i = 10;					// i local variables -- scope -- within that method i.e (sum).
		int j = 20;
		int c = i+j;
		
		return c;
		
	}
	
	public boolean isEvenNumber(int n) {
		if( n% 2 == 0) {			// n local variable -- scope -- within method.
			return true;
		}
		return false;
	}


}
