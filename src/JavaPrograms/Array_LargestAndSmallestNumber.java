package JavaPrograms;

import java.util.Arrays;

public class Array_LargestAndSmallestNumber {

	public static void main(String[] args) {

		int numbers[] = { -10, 24, 50, -88, 9876556 };

		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i = 1; i<numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}else if(numbers[i] < smallest) {
				smallest = numbers[i];
			}
			
		}
		System.out.println("Given array is"+ Arrays.toString(numbers)); //[-10, 24, 50, -88, 9876556]
		System.out.println("largest "+ largest); //9876556
		System.out.println("smallest "+ smallest); //-88
		
	}

}
