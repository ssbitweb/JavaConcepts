package javaBasicsPart1;

public class D_Loops {

	public static void main(String[] args) {
		
		// 2. For Loop (Important)
		
				for(int p=1; p<=10; p++) {		// initialization , condition and increment in same line.
					System.out.println(p);
					if(p == 8) {
						System.out.println("exiting the loop");
						break;					// break statement is used to exit the loop from current execution.
					}
				}
				
		//-----------------------------------------------------------------------------------------
		
		//drawback of while loop -- if increment part not given then it Loops infinite. so use for loop.
				
		// 1. While Loop
		int i = 1;						// initialization
		while(i<=10) {					//condition
			System.out.println(i);		// OP 1 to 10
			i = i+1;  //OR i++ means i= i+1;	// increment logic
		}
		
		//--------------------------------------------------------------------------------------------

		i = 1;
		while(i != 6) {
			System.out.println(i);		// OP 1 to 5
			i++;
		}
		
		//-------------------------------------------------------------------------------------------
		
		i = 1;
		while(true) {
			if(i == 6) {
				break;					// to exit loop from current execution
			}
			System.out.println(i);		// OP 1 to 5
			i++;
		}
		
		//--------------------------------------------------------------------------------------------
		
		// 2. Do While 
		
		i = 1;
		do {
			System.out.println(i);		// OP 1 to 7
			i++;
			if(i==8) {
				break;
			}
		}while(i <=10);
		
		//---------------------------------------------------------------------------------------------
		
		
		
	}

}
