package JavaPrograms;

//Q. WAP to generate a random string

public class RandomString {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println(getRandomString(i));
		}
	}
	
	public static String getRandomString(int lenght) {
		StringBuilder sb = new StringBuilder();
		String alphNumChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		for(int i=0; i<lenght; i++) {
			int index = (int) (Math.random() * alphNumChar.length());
			sb.append(alphNumChar.charAt(index));
		}
		return sb.toString();
	}

}
