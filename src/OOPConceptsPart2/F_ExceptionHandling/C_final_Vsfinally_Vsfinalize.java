package OOPConceptsPart2.F_ExceptionHandling;

// final -- is keyword is used to define constant values
// final -- used to prevent inheritance
// final -- used to prevent method overriding.

// finally -- finally is block , always used with try catch block.
// finally -- block is executes always even after exception.

// finalize -- finalize is method , related to garbage collection
//	--that clean up the memory..how? -- can call manually-- System.gc();
// 	-- when finalize method is called the garbage collector is called and 
//	gc destroyed all the objects that don't have any reference or null reference..


public class C_final_Vsfinally_Vsfinalize {

	public static void main(String[] args) {
		
		final int i = 10;	// final value -- constant.
		
//		i = 20;	// changed value of i to 20
		
//		i = 30;
		
		System.out.println(i); 	// 10
		
//----------------------------------------------------------
		
//		test1();
//		test2();
		division();

		
	}
	
	public static void test1() {
		try {
			System.out.println("inside-- test1 method");
			throw new RuntimeException();	
		}catch(Exception e) {
			System.out.println("inside -- catch block");
		}
		
		finally {
			System.out.println("No matter what this block is executed");
		}
		
	}
	
	public static void test2() {
		try {
			System.out.println("Inside --test2");
		}
		finally {
			System.out.println("Finally code in test2");
		}
	}
	
	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int j = i/0;				 // gives exception --> ArithmeticException
		}catch(NullPointerException e) { // not handled properly-- arithmetic exception and u provide NullPointerException
			System.out.println("inside -- catch block");
			System.out.println("/ by zero error");
		}
		finally{
			System.out.println("execute this code even after exception--");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	

}
