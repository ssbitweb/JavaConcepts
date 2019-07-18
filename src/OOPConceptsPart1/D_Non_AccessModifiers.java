package OOPConceptsPart1;

// Non Access Modifiers: 
//==============================

//-- To provide other functionality there are 9-10 non access modifiers some are
// 1. static
// 2. final
// 3. abstract
// 4. synchronized
// 5. volatile

//NOTE: static and final can be overloaded BUT can't be overridden.(imp)

//==============================
// 1. static  =========== 
// --used for creating class methods, and variables.
// --it is used for 
// 1) variables, 
// 2) methods, 
// 3) block, and 
// 4) nested classes.

// NOTE--it can't be used for classes.(top level class)(imp)
//     -- i.e class can't be static, nested can.

// --static means fixed..its value is fixed throughout the program
// --We can create static variables at class-level only
// --As static methods can NOT be overridden.
// --As static methods can be overloaded.
// --static keyword belong to class rather than instance of class.-- this means
// --we do not need to create instance/object of class-- can access directly or className.varName
// --static method can access only static and local variables and method unless we create object(instance)of class.
// --we cannot refer to this or super in any way.
// --*used for efficient memory management -- static variables are initialized first before instance variables.*
// --memory allocation happened to the static variable is just one time in whole program.
// --all the classes accessing the static variable are referring to the same memory location
//  
//================================= 
// 2. final-- used for finalizing the implementations of classes, methods, and variables.
//  --Once we declare a variable as final.the value of that variable cannot be changed.
//  --used for creating constant.
//  --used with classes, methods, variables.
//  --once final can't be inherited or extended -- can't be subClassed.
//  --prevent method overriding. i.e we can not override final method.
//  --we can overload final method.
//  --value is fixed and can not be changed.
//
//==================================
// 3. abstract
//  --applicable on classes, nested class, and methods BUT not on variable.(imp)
//  --abstract means not implemented.
//  --abstract class can have abstract as well as non-abstract(concrete--without abstract keyword*) method.
//  --abstract method means only method signature and NOT method body.
//  --If a class extends the abstract class, it must also implement at least one of the abstract method.
//  --abstract class can be overloaded and overridden -- thats the purpose.
//  --we can't create Object of abstract class and interface (interface by default abstract)
//  --Some Illegal Combination (NOT ALLOWED)
//  -- final abstract
//  -- abstract static
//  -- abstract private
//  -- abstract synchronized
//
// 4. synchronized-- used in threads
// 5. volatile -- used in threads

public class D_Non_AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
