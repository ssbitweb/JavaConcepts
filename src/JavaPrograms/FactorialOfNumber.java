package JavaPrograms;

// Write a program to find factorial of number

// Factorial e.g 10! = 10*9*8*7*6*5*4*3*2*1  = 3628800

public class FactorialOfNumber {

	public static void main(String[] args) {

/*		int n =10;
		int factorial = 1;
		for(int i= 1; i<=n; i++) {
			factorial *= i;
		}
		System.out.println("The factorial of "+ n+ " is "+ factorial); // 3628800
		
*/
		// OR factorial of first 10 to 20 ==================================================
		for(int i= 10; i<=20; i++) {
			factorialOf(i);
		}
		
		//factorialOf(17); -- shows in negative because size of int is 2147483647 positive -- so use long
		
		
	}
	
	public static long factorialOf(int n) {
		
		long factorial = 1L;
		for(int i= 1; i<=n; i++) {
			factorial *= i;
		}
		System.out.println("The factorial of "+ n + ": is "+ factorial);
		return factorial;
	}
	
	
	

}
