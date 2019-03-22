package JavaPrograms;

// Q. Write a code to generate random numbers from 1 to 10

public class RandomNumbers {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println("The Random nums are: " + randomNumbers(i));
		}
	}
	
	public static int randomNumbers(int n) {
	n = (int)(Math.random()*5+2);
	return n;
	}
	

}
