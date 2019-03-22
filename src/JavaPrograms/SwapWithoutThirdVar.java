package JavaPrograms;

// WAP to swap two numbers without using third variables

public class SwapWithoutThirdVar {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		
		//1. with using third variable swap--i.e x=10 and y = 5		
//		int t ;  	// third variable
//		t= x;  //5
//		x= y;  //10
//		y= t;  //5
		
		//2. without using third variable -- using + operator
//		x = x+y; //15
//		y = x-y; //10
//		x = x-y; //5
		
		//3. without using third var -- * operator
//		x = x*y; //50
//		y = x/y; //5
//		x = x/y; //10
		
		//4. using XOR: ^
		x = x^y; //15
		y = x^y; //5
		x = x^y; //10
		
		System.out.println(x); //10
		System.out.println(y); //5
		
	}

}
