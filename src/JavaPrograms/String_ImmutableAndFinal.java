package JavaPrograms;

//Q. why string is immutable and final in java?

// Memory Management -- there are two types of JVM memory heap and stack.
// Stack -- is used for execution purpose -- methods are stored -- also can have refrence vars.
// heap -- is used for storage purpose -- storing variables and objects. -- stores objects.
// heap -- further divided into pool --pool stores only literals/variables

// immutable -- means value of reference variable can not changed..
// final -- can not be inherited
//why? -- 1. to provide security.
// 	   -- 2. class loading mechanism.
//	-- 3. optimization and performance.

// Wrapper classes--Integer,Double,Boolean-- also immutable and final.

public class String_ImmutableAndFinal {

	public static void main(String[] args) {


		// 1. using literal -- save in string constant pool
		String s = "java"; 
		
		String s1 = "java"; // both s and s2 reference to same location in pool. i.e "java"
		
//**->	String s = "Python"; -- not possible-- coz if we change s to pyhton s1 will also change to pyhton--thats why--immutable.
		
		s = "python"; // now s will point to python 
		s = "Hadoop"; // now s will point to hadoop --and pyhton will be destroyed.by gc.
		
		// 2 . String objects -- that save in heap memory
		String s2 = new String("python"); 
		
		String s3 = new String("python"); // s2 and s3 objects have different reference location in heap.
		
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		

	}

}
