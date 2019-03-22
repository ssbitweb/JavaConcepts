package JavaPrograms;

// Q. WAP to print How many? and sum of all odd numbers from 1 to 100 

public class OddNumbers {

	public static void main(String[] args) {
		
		int how = 0;
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(isOddNumber(i)) {
				how++;
				sum += i;
				System.out.println("the odd number is "+ i);
				if(i==99) {
					System.out.println("There are " + how + " Odd Number in 1 to 100");
					System.out.println("The sum of all odd numbers from 1 to 100 are "+ sum);
				}
			}
		}
		
	}
	
	public static boolean isOddNumber(int n) { // static method to access directly in main
		if(n%2 !=0) {
			return true;
		}
		return false;
	}

}
