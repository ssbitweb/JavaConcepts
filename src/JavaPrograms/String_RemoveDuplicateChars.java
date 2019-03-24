package JavaPrograms;

// write a program to remove duplicate character from string

public class String_RemoveDuplicateChars {

	public static void main(String[] args) {
		
		String s = "heeeelloooo";
		
		System.out.println(s.replaceAll("(.)\\1{1,}", "$1")); // helo
		System.out.println(removeDuplicate(s)); // helo
		
		//1. using regular expression
		// "(.)\\1{1,}" --> means any character (added to group 1) followed by itself at least once.
		// "$1" --> is reference content of group 1
		
	}
	
	public static String removeDuplicate(String str) {
		String res ="";
		for(int i=0; i<str.length(); i++) {
			if(!res.contains("" + str.charAt(i))) {
				res += "" + str.charAt(i);
			}
		}
		return res;
	}
	
	
}
