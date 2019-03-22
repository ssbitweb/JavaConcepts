package JavaPrograms;

// Q. WAP to find 15 prime numbers from 1 to 100

// prime numbers -- the numbers that are divisible by 1 and itself and other that 1.

public class PrimeNumber {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		for(int i = 1; i<100; i++) {
			if(isPrime(i)) {
				System.out.println("The prime numbers are : "+ i);
				count++;
				sum += i;
				if(count == 15) {
					System.out.println("sum of all prime no's are " + sum);
					break;
				}
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if(n== 1) {
			return false;	// if 1 return false
		}
		
		for(int i=2; i <= n/2; i++ ) {
			if(n % i == 0) {  // if n/2 remainder is 0 then false
				return false;
			}
		}
		return true; // else true
	}

}
