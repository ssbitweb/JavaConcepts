package JavaPrograms;

//Q. A string is given, remove white space , reverse it and print only odd position character of string.

public class String_RevPrintOddPosChar {

	public static void main(String[] args) {

		String s1 = "	SachinBhagat		";
		String reversed = reversedString(s1).trim();  // reversed and removes white space
		System.out.println(reversed);	 			  // tagahBnihcaS
		
		for(int i = 0; i<reversed.length(); i++) {
//			if(i%2 == 0) {	 // even position
//				System.out.print(reversed.charAt(i)); // tghnha
//			}
			
			if(i%2 != 0) {  // odd position
				System.out.print(reversed.charAt(i)); // aaBicS
			}
		}
		
	}
	public static String reversedString(String s) {
		int len =s.length();
		String rev = "";
		for(int i=len-1; i>= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
