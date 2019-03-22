package JavaPrograms;

// Q. Write a program to verify a number is perfect number
// Q. print first 5 perfect numbers and sum of first 5 perfect numbers from 1 to 10000.

// Perfect Number -- the number whose sum of all positive factors/divisors is equal to number itself , excluding the number.
// e.g 6 = 1+2+3
// 28 = 1+2+4+7+14

public class PerfectNumber {

	public static void main(String[] args) {
		
		if(isPerfectNumber(28)) {
			System.out.println("this is perfect no");
		}else {
			System.out.println("not perfect");
		}
//=======================================================
		int sum = 0;	
		int count = 0;
		for(int i =1; i <=10000; i++) {
			if(isPerfectNumber(i)) {
				System.out.println("The perfect no's are "+ i);
				count++;
				sum += i;
				if(count == 5) {
					System.out.println("the sum of 5 perfect number from 1 to 10000 are "+ sum);
					break;
				}
				
			}
		}

	}
	
	public static boolean isPerfectNumber(int n) {
		int sum = 0;
		for(int i =1; i<=n/2; i++) {
			if(n%i == 0) { // if n/2 return no remainder -- this is one positive factor
				sum += i; // sum of all positive factor
			}
			if(sum == n) {
				return true;
			}
		}
		return false;
	}

}
