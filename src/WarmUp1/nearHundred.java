package WarmUp1;

import java.util.Scanner;

public class nearHundred {

	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		
		boolean range=nearHundredMethod(scan.nextInt());
		System.out.println(range);
	}
	public static boolean nearHundredMethod(int n) {
		return Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10; 
	}
}
