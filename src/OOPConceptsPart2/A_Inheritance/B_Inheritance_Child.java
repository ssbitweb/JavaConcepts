package OOPConceptsPart2.A_Inheritance;

public class B_Inheritance_Child extends A_Inheritance_Parent {
	
	public void methodChild() {
		System.out.println("i am child");
	}

	public static void main(String[] args) {


		B_Inheritance_Child obj = new B_Inheritance_Child();
		
		obj.methodParent(); // i am parent
		obj.methodChild();  // i am child

	}

}
