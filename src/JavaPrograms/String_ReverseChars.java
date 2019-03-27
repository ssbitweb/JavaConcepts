package JavaPrograms;

// Q. Write a program to reverse the String.

public class String_ReverseChars {

	public static void main(String[] args) {

		String s1 = "sachin bhagat";

		System.out.println(reversedString(s1)); //tagahb nihcas
		
		//check if palindrome
		String original = "bob";
		String reversed = reversedString(original);
		if(original.equals(reversed)) {		// do not use ==
			System.out.println("palindrome string");
		}else {
			System.out.println("not palindrome");
		}
		

		//2. using StringBuffer class
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse()); // tagahb nihcas
			
		
	}
	
	// 1. using for loop
	public static String reversedString(String s) {
		int len = s.length();
		String rev = "";
		for(int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
