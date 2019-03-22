package JavaPrograms;

// WAP to find greatest of 3 numbers

public class GreatestNumber {

	public static void main(String[] args) {
		
		greatestNumber(10, 20, 30);
		
		System.out.println(greatestNumber(1, 2, 3));
	}
	
	public static int greatestNumber(int a, int b, int c) {
		if(a>b && b>c) {
			System.out.println(a + " is greater");
		}else if(b>c) {
			System.out.println(b + " is greater");
		}else {
			System.out.println(c + " is greater");
		}
		return c;
	}
}
