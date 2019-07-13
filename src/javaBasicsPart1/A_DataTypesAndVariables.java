package javaBasicsPart1;

public class A_DataTypesAndVariables {

	//This is main method -- execution starts from here -> single line comment
	public static void main(String[] args) {
		
		/*DataType or Return type.
		--Means Type of data. -> Block comment */  
		
		//--------------------------------------------------------------------------------------------------
		
		// Primitive data type	Size		byte(1byte = 8bit)
		int i = 10;				//	32			4
		byte b = 127;			//	8			1
		short s = 32767;		//	16			2
		long l = 9_223_372_036_854_775_807L;//	64			8
		
		int j = 5/3;
		float f= 5f/3f;		//  32			4
		double d = 5d/3d;	//	64			8
		
		char c = 'A';		//	16			2
		boolean boo = true;	// 	1			(true or false i.e 0 or 1)
		
		//Non -primitive data type i.e called by reference i.e reference data type
		String str = "sachin"; // String is Class in java so its reference data type.		
		//Class
		//Interface
		//Array				// String is collection of character so its Array
		
		//-----------------------------------------------------------------------------------------------------------
		
		//Variables and Statement
		int a = 5; 	// integer value 5 is assigned to variable a -- complete statement
//		int a = 10;	// gives Error - Duplicate variable is not allowed.
		a = 10;		// its valid no Error -  a variable replace by 10, initially it was 5. now its 10.
		// OR
		int p;		// integer variable p is initialized i.e. initialization
		p = 20;		// integer value 20 is assigned/stored in p variable 
		
		
		//OUTPUT
		System.out.println("O/P of int i = " + i );	  //O/P of int i = 10
		System.out.println("O/P of byte b = " + b );  //O/P of byte b = 127
		System.out.println("O/P of short s = " + s ); //O/P of short s = 32767	
		System.out.println("O/P of long l = " + l );  //O/P of long l = 9223372036854775807
		System.out.println("O/P of int j = " + j );	  //O/P of int j = 1
		System.out.println("O/P of float f = " + f ); //O/P of float f = 1.6666666
		System.out.println("O/P of double d = " + d ); //O/P of double d = 1.6666666666666667
		System.out.println("O/P of char c = " + c );	//O/P of char c = A
		System.out.println("O/P of boolean boo = " + boo );	//O/P of boolean boo = true
		System.out.println("O/P of String str = " + str );	//O/P of String str = sachin
		
		System.out.println(a+p);							//OP 30
		

	}

}
