package javaBasicsPart1;

public class F_ArrayConcept {

	public static void main(String[] args) {

		// Array -- array is collection of similar data type - store similar data type value in array variable
		// Lowest bound/index is 0
		// Highest index is n-1 , where n is size of array.
		
		// Disadvantage of array
		// size is fixed --static array --> to overcome this problem we use Collections -- ArrayList, HashTable --Dynamic array
		// store only similar data type --> to overcome this problem we use Object array.
		
		// 1. int array
		
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);		//	30
		System.out.println(i[3]);	 	// 	40
//		System.out.println(i[4]);	 	// Gives Error/Exception --> ArrayIndexOutOfBoundsException coz index 4 is not exist.
		
		System.out.println(i.length); 	// 	4
		
		// Print all the values of array use for loop
		
		for(int j =0; j<i.length; j++) {
			System.out.println(i[j]);	// 10 20 30 40
		}
		
		//----------------------------------------------------------------------------------------------------------------
		
		// 2. String array
		String s[] = new String [3];
		s[0] = "sachin";
		s[1] = "bhagat";
		s[2] = "pune";
		
		System.out.println(s[2]);		// pune
		System.out.println(s.length); 	// 3
		
		//----------------------------------------------------------------------------------------------------------------------
		
		// 2. double array
		double d[] = new double [3];
		d[0] = 10.12;
		d[1] = 20.13;
		d[2] = 30.15;
		
		System.out.println(d[2]); 		// 30.15
		
		//--------------------------------------------------------------------------------------------------------------------
		
		// char array
		char c[] = new char [3];
		c[0] = 'A';
		c[1] = '1';
		c[2] = 'G';
		
		System.out.println(c[2]);		// G
		System.out.println(c[1]);		// 1
		System.out.println(c.length);	// 3
		
		//------------------------------------------------------------------------------------------------------------------------
		
		// Object Array (Object is class - Superclass) -- is used to store different data type
		Object ob[] = new Object [6];
		ob[0] = "sachin";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "25/0/2014";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[5]);  	// London
	}

}
