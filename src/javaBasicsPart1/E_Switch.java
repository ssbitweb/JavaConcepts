package javaBasicsPart1;

public class E_Switch {

	public static void main(String[] args) {

		/*int value = 2;
		if(value == 1) {
			System.out.println("valie is 1");
		}else if(value == 2) {
			System.out.println("value is 2");
		}else {
			System.out.println("value not found");
		}*/
		
	//------------------------------------------------------------------------------
		
		int switchValue = 4;
		switch(switchValue) {
		case 1:
			System.out.println("switch value is 1:");
			break;
		case 2:
			System.out.println("switch value is 2:");
			break;
		case 3: case 4: case 5:
			System.out.println("switch value is 3 or 4 or 5:");	
			System.out.println("Acutal value is " + switchValue);
			break;
		default:
			System.out.println("not Swich 1 or 2 or 3 or 4 or 5");
			break;
		}
		
	//--------------------------------------------------------------------------------
		
		char charValue = 'G';
		switch(charValue) {
		case 'A':
			System.out.println("characte A found");
			break;
		case 'B':
			System.out.println("character B found");
			break;
		case 'C':
			System.out.println("character C found");
			break;
		case 'D': case 'E':
			System.out.println("character E or D found");
			System.out.println("actual characte is "+ charValue);
			break;
		default:
			System.out.println("no character is found");
			break;
			
		}
	//------------------------------------------------------------------------------------
		
	}

}
