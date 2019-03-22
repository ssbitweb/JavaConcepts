package JavaPrograms;

//Q. WAP to find Fibonacci series from 1 to 10.

//Fibonacci series -- next number is the sum of previous two numbers, first two numbers are 0 and 1.

public class Fibonacci {

	public static void main(String[] args) {

		int t1 = 0;
		int t2 = 1;
//		int n = 10;
		
		for(int i = 1; i<=10; ++i) {
			
			System.out.println(t1 );
			
			int sum = t1+ t2; // sum of first two no's --> 0+1
			t1 = t2 ; // 0 = 1 --> 1
			t2 = sum; // 1 = 0+1 --> 1 
			
			//System.out.println(t1 );
		}
		
	}
	
}
