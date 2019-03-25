package JavaPrograms;

// use split to print each word of a statement.

public class String_Split_Words {

	public static void main(String[] args) {

		String s = "my name is khan and i am not a terrorist";
		
		String words[] = s.split(" ");
		
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
			
		}
		
		System.out.println(words.length); //10
		
				
		
	}

}
