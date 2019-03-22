package JavaPrograms;

public class SumOfDigits {

	public static void main(String[] args) {

		System.out.println(sumDigit(12345)); //15

	}
	
	public static int sumDigit(int n) {  // 12345
		int sum = 0;
		while(n > 0) {
			int digitNumber = n % 10;  	// dropping last digit
			sum += digitNumber;			// sum of all digit
			n /= 10; 	// n = n/10;	// dropping zero
		}
		return sum;
	}

}
