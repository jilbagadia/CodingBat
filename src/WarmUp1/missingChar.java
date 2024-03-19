package WarmUp1;

import java.util.Scanner;

public class missingChar {

	public static void main (String [] args) {
		Scanner scanInt= new Scanner(System.in);
		Scanner scanString= new Scanner(System.in);
		missingCharMethod(scanString.next(), scanInt.nextInt());
	}
	public static String missingCharMethod(String inputString, int n) {
		return inputString.substring(0, n) + inputString.substring(n+1);
	}
}
