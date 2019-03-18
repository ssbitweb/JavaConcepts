package javaBasicsPart1;

public class SumOf_20_EvenNumbers_1To100 {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		for(int i = 1; i<=100; i++) {
			if(isEvenNumber(i)) {
				System.out.println("The Even Numbers are: " + i + " " );
				count++;
				sum += i;
				if(count == 20) {
					System.out.println("The sum of all 20 Even Numbers From 1 to 100 are :" + sum);
					break;
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
