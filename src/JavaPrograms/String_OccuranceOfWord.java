package JavaPrograms;

public class String_OccuranceOfWord {

	public static void main(String[] args) {

		String s = "my name is sachin sachin sachin";
		occuranceOfWord(s); //my--1,name--1, is--1, sachin--3
	}
	
	public static int occuranceOfWord(String str) {
		String[] words = str.split(" ");
		int count = 1;
		for(int i =0; i<words.length; i++) {
			for(int j = i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if(words[i] != "0") {
			System.out.println(words[i]+ "--" +count);
			}
			
		}
		return count;
		
		
	}

}
