package JavaPrograms;

// Q. Write a program to print occurrence of each character in string.

public class String_OccuranceOfChar {

	public static void main(String[] args) {
		
		String s = "HelloWorld";
		
		System.out.println("Occurance of H : " + occurranceOfChar(s, 'H')); //1
		System.out.println("Occurance of e : " + occurranceOfChar(s, 'e')); //1
		System.out.println("Occurance of l : " + occurranceOfChar(s, 'l')); //3
		System.out.println("Occurance of o : " + occurranceOfChar(s, 'o')); //2
		System.out.println("Occurance of W : " + occurranceOfChar(s, 'W')); //1
		System.out.println("Occurance of r : " + occurranceOfChar(s, 'r')); //1
		System.out.println("Occurance of d : " + occurranceOfChar(s, 'd')); //1
		
	}
	public static int occurranceOfChar(String str, char c) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
