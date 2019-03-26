package OOPConceptsPart1;
// JVM - java memory are of two type - heap memory and stack memory.
// Heap memory -- for storage purpose --stores objects immutable objects
// Heap memory -- further divided-- 1.young gen--> 1.1-survior s0 1.2- s1,  and 2-old gen..and 3-memory pool
// Pool memort -- stores immutable objects..all string classes andstring pool --run time
// heap memory -- stores all JRE classes--gc runs on heap memory.

// Stack memory -- for execution purpose.. store methods..--can also stores ref of objects 

// garbage collection -- is called in heap memory when objects has no references or null. that destroy the object

// NOTE: skeep if not getting.

public class i_MemoryMngmt_GarbageCollection {
	
	class Account {
		int p = 0;		// created in heap
		int q = 0;		// after gc called -- p and q destroyed by gc..
	}

	public static void main(String[] args) {
		i_MemoryMngmt_GarbageCollection obj = new i_MemoryMngmt_GarbageCollection();
		obj.m1();

	}
	
	public  void m1() { 	 // creates frames m1 in stack memory
		int x= 20;		 // ref var x in m1 frame in stack memory
		System.out.println(x);
		m2(10);		// calling m2 -- execution flow goes to m3
	} 
	
	public  void m2(int b) { // creates frames m2 above m1 in stack memory-- also ref b and c;
		boolean c = true;
		System.out.println(c);
		m3(); 		// calling m3 -- m3 called 
	}
	
	public  void m3() { // creates frame above m2 in stack. -- m3 once executed(its removes from stack frame m3)
						//p and q in Account..has no ref..then gc called
		
		Account a = new Account(); // ref var a created in stack.
		
		a.p = 1;	// p and q created in heap..
		a.q = 2;
		
		
	}

}
 