package JavaPrograms;

public class String_UpperCaseLowerCase {

	public static void main(String[] args) {


		String s = "hello world";
		
		System.out.println(s.length()); //11
		
		
		
		//convert last two character to uppercase
		System.out.println(s.substring(0, 10)+ s.substring(9, 11).toUpperCase());//hello worLD
		
		//convert first character to uppercase
		System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1, 11));//Hello world
		
		//change world to your name
		System.out.println(s.replace("world", "sachin")); //hello sachin
		
		//make hello capital
		System.out.println(s.substring(0, 5).toUpperCase()+s.substring(5, 11)); //HELLO world
		
		//make alternate character uppercase starting with uppercase 
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(i%2 == 0) {
				System.out.println(Character.toUpperCase(ch));
			}else {
				System.out.println(Character.toLowerCase(ch));
			}
		}
		System.out.println(); //HeLlO WoRlD

	}

}
