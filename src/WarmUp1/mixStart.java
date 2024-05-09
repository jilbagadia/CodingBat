package WarmUp1;

import java.util.Scanner;

public class mixStart {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(mix(input));
	}
	public static boolean mix(String input) {
		return input.length()>2 && input.substring(1, 3).equals("ix");
		
	}
}
