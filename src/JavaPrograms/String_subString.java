package JavaPrograms;

//Q. Write a program to print substring of a string

// substring - khan, not, etc

public class String_subString {

	public static void main(String[] args) {

		String s = "My name is khan and i am not a terrorist";
		
		// substring -- khan
		// substring -- i am not a terrorist
		System.out.println(s.length());//40
		System.out.println(s.indexOf('k')); //11
		System.out.println(s.indexOf('n', 4));//14
		System.out.println(s.indexOf('i', 9));//20
		
		System.out.println(s.substring(11, 15)); //khan
		System.out.println(s.substring(20));//i am not a terrorist
	}

}
