package javaBasicsPart1;

public class G_TwoDimArray {

	public static void main(String[] args) {

		String x[][] = new String[3][5];
		System.out.println(x.length);	// 3 --total no of rows-3
		System.out.println(x[0].length); // 5 --total no of cols-5
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[1][4]); //	E1
		
		//To print all Values use 2 for loop
		for(int rows= 0; rows<x.length; rows++) {
			for(int cols = 0; cols<x[0].length; cols++) {
				System.out.println(x[rows][cols]);	 // A B C D E A1 B1 C1 D1 E1 A2 B2 C2 D2 E2
			}
		}
		

	}

}
