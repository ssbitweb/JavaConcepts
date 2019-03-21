package OOPConceptsPart2.E_ExceptionHandling;

// why throws? --> try, catch for each exception statement is not good practices.. instead use throws declaration. 
//					and handle it in calling method.

// throws -- handle by JVM.
// throws -- throws used to declare an exception., and we can declare multiple Exceptions ,, Exception class
// throws -- declare in method signature -- i.e after method name..

// throw -- throw is used to throw an exception explicitly..,, one instance variable
// throw -- throw in method body.


public class B_ThrowsVsThrow {

	public static void main(String[] args) {
		
		B_ThrowsVsThrow  m = new B_ThrowsVsThrow();
		
		m.sum();
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Sachin's Exception");	//throw is used to throw an exception deliberately/explicitly..,, one instance variable 
		} catch (Exception e) {							//and should be surround with try catch block
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		

	}
	
	public void sum() {	 // handle in calling.
		try {
			div();
			
		}catch(ArithmeticException e) {	 // }catch(Exception e) {	--> handle all exception
										 // }catch(Error e) {		--> handle all error
		}								 // }catch(throwable e) {	--> handle error and exception -- its superclass of exception and error
		System.out.println("Execute Me");// }catch(Object e) {		--> handle all -- its super-most of all classes
	}
	
	public void div() throws ArithmeticException {	// throws used to declare an exception., and can declare multiple ,, Exception class
		
		int i = 9/0;					// causing exception
		throw new ArithmeticException();// throw is used to throw an exception explicitly..,, one instance variable
		
	
	}

}
