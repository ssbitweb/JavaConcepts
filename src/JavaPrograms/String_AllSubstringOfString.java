package JavaPrograms;

public class String_AllSubstringOfString {

	public static void main(String[] args) {
		
		String s = "sachin";
		subStringOfString(s);
		
	}
	
	public static String subStringOfString(String str) {
		
		for(int i=0; i<str.length(); i++) {
			for(int j = i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
		return str;
	}

}
