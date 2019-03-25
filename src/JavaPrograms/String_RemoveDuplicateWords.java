package JavaPrograms;

public class String_RemoveDuplicateWords {

	public static void main(String[] args) {

		String s = "Welcome to the company welcome welcome welcome";
		String[] words = s.toLowerCase().split(" ");
		int count = 1;
		for(int i= 0; i<words.length; i++ ) {
			for(int j = i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					count = count +1;
					words[j] = "0";
				}
			}
			if(words[i] != "0") {
				System.out.println("The count of : " +words[i] + " = " + count);
				count =1;
			}
			
		}
		for(int k =0; k<words.length; k++) {
			if(words[k] != "0") {
				System.out.println(words[k]);
			}
		}
		
		//================================================
		String s1 = "hello my name is sachin sachin sachin";
		removeDuplicateWords(s1);
		

	}
	
	public static void removeDuplicateWords(String str) {
		String[] words = str.toLowerCase().split(" ");
		int dupCount = 1;
		for(int i =0; i<words.length; i++) {
			for(int j = i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					dupCount++;
					words[j] = "0";
				}
			}
			if(words[i] != "0") {
				System.out.println("The count of words: "+ words[i] + "--" + dupCount);
				dupCount = 1;
			}
		}
		for(int k=0; k<words.length; k++) {
			if(words[k] != "0") {	
			System.out.print(words[k]+" ");	//hello my name is sachin
			}
		}
		
	}

	
	
}
