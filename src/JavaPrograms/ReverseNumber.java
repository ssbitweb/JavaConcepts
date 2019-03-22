package JavaPrograms;

//Q. write a program to reverse a number

public class ReverseNumber {

	public static void main(String[] args) {

		//1.using algorithm
		long num = 12345; // 54321
		long rev =0;
		
		while(num != 0) {
			rev = rev * 10 + num % 10; 	// 0+5 --> next time 5*10 + 4 -- >removing 5
			num = num / 10;				//1234-->next time 123	-- removing 0			// OR num /= 10;
			
						
		}
		System.out.println("Reversed Num is "+ rev);
		
		//2. using StringBuffer method
		long num1 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		//==================================================================
		
		System.out.println(reverseNumber(12345)); // invoking direct in main
		
	}
	
	public static int reverseNumber(int n) {  //OR creating method
		int rev = 0;
		while(n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
		
	}

}
