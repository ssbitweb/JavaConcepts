package JavaPrograms;

public class String_Reverse {

	public static void main(String[] args) {

		
		String s = "one two three four five six seven";

		System.out.println(reverse(s)); //seven six five four three two one 
		
		
		
//		String a ="sachin"; 	//--split without space
//		System.out.println(reverse(a)); //nihcas
	

	}
	
	public static String reverse(String str) {
		String reversed = "";
		String[] original = str.trim().split(" ");
		for(String words : original) {
			reversed = words + " " + reversed;
			//System.out.println(reversed);
		}
		return reversed;
	}

}
