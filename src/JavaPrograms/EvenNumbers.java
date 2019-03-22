package JavaPrograms;

// WAP to print sum of first 10 even numbers from 50 to 100

public class EvenNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		int count = 0;
		for(int i=50; i<=100; i++) {
			if(isEvenNumber(i)) {
				System.out.println("Even numver is "+ i);
				count++;
				sum += i;
				if(count == 10) {
					System.out.println("the sum of 10 even numbers from 50 to 100 are: "+ sum);
					System.out.println("total even numbers are "+ count);
					break; // once u find 10 even numbers stop there
				}
			}
		}
	}
	
	public static boolean isEvenNumber(int n) {
		if(n%2 == 0) {
			return true;
		}
		return false;
	}

}
