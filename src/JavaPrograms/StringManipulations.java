package JavaPrograms;

// String - string is sequence of character
// String is a class in java

public class StringManipulations {

	public static void main(String[] args) {

		String s = "The rains have started here selenium"; // using literal
		String s1 = "The rains have started here selenium";
		String s2 = "The rains Have started here selenium";
		
		String s4 = new String("The rains have started here selenium"); // using new keyword
		System.out.println(s4);
		
		//lenght of string (not size, size is For ArrayList,)
		System.out.println(s.length());  //36 index starts from 0
		
		//StartsWith
		//endsWith
		//contains
		
		//charAt -- 
		System.out.println(s.charAt(5)); // a
		
		//indexOf
		System.out.println(s.indexOf('s')); // 8 --> 1st occurrence of s
		
		System.out.println(s.indexOf('s', 9)); // 15 --> 2nd s --check from 9th index
		System.out.println(s.indexOf('s', s.indexOf('s')+1)); // 15 --> 9 = s.indexOf('s') +1
		
		// 3rd s?
		int first_s = s.indexOf('s');
		System.out.println(first_s); // 8
		
		int second_s = s.indexOf('s',first_s + 1);
		System.out.println(second_s); // 15
		
		int third_s = s.indexOf('s', second_s + 1);
		System.out.println(third_s);  // 28
		
		// word index
		System.out.println(s.indexOf("have")); //10
		
		System.out.println(s.indexOf("hello")); // -1
		
		//toLowerCase/toUpperCase
		System.out.println(s.toLowerCase()); // the rains have started here selenium
		System.out.println(s.toUpperCase()); // THE RAINS HAVE STARTED HERE SELENIUM
		System.out.println(s.substring(15, 22).toUpperCase());  // STARTED
		
		// String comparision
		System.out.println(s.equals(s1));  //true --return boolean
		System.out.println(s.equals(s2));  //false  -- java is case sensitive
		System.out.println(s.equalsIgnoreCase(s2));  // true  --> now case ignored
		
		// subString 
		System.out.println(s.substring(15, 22));  // started
		System.out.println(s.substring(0, 9)); // The rains
		
		
		// trim -- > to remove white space --first and last
		String s3 = "	Hello World		";
		System.out.println(s3);  		//		Hello World
		System.out.println(s3.trim()); 	//Hello World 
		
		//replace -- to remove between words space
		System.out.println(s3.replace(" ", "")); //HelloWorld
		String date = "10-24-2019";
		System.out.println(date.replace("-", "/")); //10/24/2019
		
		//Split:
		String test = "Hello_World_test_Selenium";
		String testVal[] = test.split("_");
		
		for(int i=0; i<testVal.length; i++) {
			System.out.println(testVal[i]);
		}
		
		//concatenation
		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x.concat(y)); // HelloWorld
		
		System.out.println(x+y);   	  //HelloWorld
		System.out.println(a+b);      //300
		System.out.println(x+y+a);    //HelloWorld100
		System.out.println(x+y+a+b);  //HelloWorld100200
		System.out.println(a+b+x); 	  //300Hello
		System.out.println(a+b+x+y);  //300HelloWorld
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
