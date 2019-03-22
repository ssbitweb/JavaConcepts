package JavaPrograms;

// Q. WAP to print SUM of First 20 odd numbers from 1 to 100

public class OddNumbers_sum {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;		// counter
		for(int i = 1; i<100; i++ ) {
			if(isOddNumber(i)) {
				System.out.println("the odd number is :" + i);
				count++;
				sum += i;	// sum of all
				if(count == 20) {
					System.out.println("The Sum of all 20 odd numbers from 1 to 100 :"+ sum);
					break;
				}
			}
			
		}
		
		
	}
	
	public static boolean isOddNumber(int n) {
		if(n%2 != 0) {
			return true;
		}
		return false;
	}

}
