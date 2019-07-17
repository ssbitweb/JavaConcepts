package OOPConceptsPart2.A_Inheritance;

// Inheritance -- inheritance is the process by which one class can inherit the
// properties of another class -- using extends keywords.
// used for code re-usability.

// child class has IS-A relationship with parent class.
// parent class can not inherits child class.. 
// like one child can not have two parents. --( so multiple inheritance not possible)

// Types of Inheritance
/*
1.Single Inheritance
============================

  class A {
  }

  class B extends Class A {
  }

2.Multilevel Inheritance
=============================

  class A {
  }

  class C extends class B {
  }

  class B extends class A {
  }

3.Hierarchical Inheritance
==============================

  class A {
  }

  class B extends class A {
  }

  class C extends class A {
  }

  class D extends class A {
  }
  

4.Multiple Inheritance( is not Possible through class BUT Possible through Interface ONLY.)
===============================

  interface A {
  }
  
  interface B {
  }

  interface C extends A, B {
  
  class D implements C {
  }
  

5.Hybrid Inheritance ( is not Possible through class BUT Possible through Interface ONLY.)
================================

  -- a mix of above two or more is hybrid inheritance.


*/

public class A_Inheritance_Parent {
	
	public void methodParent() {
		System.out.println("i am parent");
	}
	
	
	public static void main(String[] args) {
		
	}

}
