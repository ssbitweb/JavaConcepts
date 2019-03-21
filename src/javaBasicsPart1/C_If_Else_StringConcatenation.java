package javaBasicsPart1;

public class C_If_Else_StringConcatenation {
	
	/*if(condition true) {
		execute this block;
	}else {
		execute this block;
	}*/

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int c = 300;
		int d = 100;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);  // 300
		System.out.println(x+y);  // HelloWorld
		
		//concatenation --> execution from left to right
		
		System.out.println(a+b+x+y);  // 300HelloWorld
		System.out.println(x+y+a+b);  // HelloWorld100200
		System.out.println(a+b+x+y+a+x+b+y);  // 300HelloWorld100Hello200World
		
		//comparison Operator 
		// < > <= >= == !=
		if(a == d) {
			System.out.println("a and d are equal");
		}else {
			System.out.println("a and d not equal");
		}
		
		//Finding greater number
		if(a>b && b>c) {
			System.out.println("a is greater");
		}else if(b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");	// c is greater
		}
	}

}
