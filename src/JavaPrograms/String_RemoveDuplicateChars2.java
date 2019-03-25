package JavaPrograms;

// Q. WAP to remove duplicate chracters from string

public class String_RemoveDuplicateChars2 {

	public static void main(String[] args) {


		String s ="sachiiiiiin";
		
		removeDupChar(s); // sachin
	}
	
	public static void removeDupChar(String str) {
		String chars[] = str.split("");
		for(int i=0; i<chars.length; i++) {
			for(int j= i+1; j<chars.length; j++) {
				if(chars[i].equals(chars[j])) {
					chars[j] = "0";
				}
			}
		}
		for(int k=0; k<chars.length; k++) {
			if(chars[k] != "0") {
				System.out.print(chars[k]);
			}
		}
		
	}

}
