package OOPConceptsPart2.F_ExceptionHandling;

// Exception -- Exception is an event that occur during execution of program, that disrupt the normal flow of program.
//
// Hierarchy-->
//                Object
//                  |	
//               throwable
//                  |
// Exception------------------------------Error
//    |                                      |
// RuntimeException	  IOError  AWTError	VirtualMachineError AssertionError
//	 --ArithmaticException					|							
//	 --NullpointerException					--StackOverflowError
//	 --uncheckedException					--OutOfMemoryError
//	       --IndexOutOfBoundException														
//	              --ArrayIndexOutofBoundException
//	              --StringIndexOutOfBoundException
//		IOException
//			--InterruptedIOException
//			--FileNotFoundException
//		SQLException
//		InterruptedException
//		AWTException
//		CheckedException	
//----------------------------------------------------------------------------------------------------------

public class A_Try_Catch {
	
	int i = 10;

	public static void main(String[] args) {
		
		// uncaught/unchecked/runtime exception
//		int i = 9/0;
//		System.out.println(i);	// ArithmeticException -- / by zero
		
		// caught/checked/compile-time exception
//		Thread.sleep(2000);
		
		A_Try_Catch m = new A_Try_Catch();
//		m = null;
//		System.out.println(m.i);  // NullPointerException -- > without reference i.e we define ref as null.
		
//----------------------------------------------------------------------------------------------------------------------
		
		// Exception Handling
		// 1. Try catch block
		
		try {
			int i = 9/0;	// this code will throw an exception.
		}
		catch(ArithmeticException e) {	// this code/block catch/handle an exception. 
		e.printStackTrace(); 			// this code print why/what type of exception u getting	
		System.out.println(e.getMessage());	// this print message of why?
		}
		System.out.println("Execute Me");
		
		// 2 . using throws declaration.

	}

}
