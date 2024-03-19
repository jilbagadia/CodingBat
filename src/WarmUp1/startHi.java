package WarmUp1;

import java.util.Scanner;

public class startHi {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine();
		boolean startHi=startWithHi(input);
	}
	public static boolean startWithHi(String input) {
		return input.startsWith("hi");
	}

}
