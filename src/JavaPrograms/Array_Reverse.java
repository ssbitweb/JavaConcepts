package JavaPrograms;

// Write a program to print array in reverse order.

import java.util.Arrays;

public class Array_Reverse {

	public static void main(String[] args) {


		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		
		int b[] = { 1, 5, 6, 64, 45, 7, 485 };
		
		
		for(int i=0; i<a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
		System.out.println("after reverse "+ Arrays.toString(a)); //[7, 6, 5, 4, 3, 2, 1]
		
		
		
		//===========================================================
		
		System.out.println("after reverse "+ Arrays.toString(reversedArray(b))); //[485, 7, 45, 64, 6, 5, 1]
		
	}
	
	public static int[] reversedArray(int[] a) { // creating method
		for(int i=0; i<a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		return a;
		
	}
	

}
