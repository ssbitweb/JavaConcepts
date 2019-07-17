package OOPConceptsPart2.F_ExceptionHandling;

//finalize -- finalize is method , related to garbage collection
//--that clean up the memory..how? -- can call manually-- System.gc();
//-- when finalize method is called the garbage collector is called and 
// gc destroyed all the objects that don't have any reference or null reference..

public class D_FinalizeConcept {
	
	public void finalize() {
		System.out.println("This is finalize method");
	}

	public static void main(String[] args) {
		
		D_FinalizeConcept m1 = new D_FinalizeConcept();
		D_FinalizeConcept m2 = new D_FinalizeConcept();
	
		m1 = null;
		m2 = null;
		
		System.gc(); // called garbage collector to clean memory i.e to destroy null objects.
	}

}
