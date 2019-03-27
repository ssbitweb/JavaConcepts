package JavaPrograms;

import java.util.Arrays;

//Q. Print the array of string in reverse order.

public class Array_ReverseString {

	public static void main(String[] args) {


		String[] s = {"my", "name", "is", "sachin" };
		//revOrder = sachin is name my
		
		System.out.println(Arrays.toString(revOrder(s))); //[sachin, is, name, my]
		
	}
	
	public static String[] revOrder(String[] str) {
		
		for(int i=0; i<str.length / 2; i++) {
			String temp = str[i];
			str[i] = str[str.length-1-i];
			str[str.length-1-i] = temp;
		}
		return str;
	}

}
