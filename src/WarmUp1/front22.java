package WarmUp1;

import java.util.Scanner;

public class front22 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine();
		String frontBackString=frontback(input);
		System.out.println(frontBackString);
	}
	public static String frontback(String input) {
		if(input.length()<2) {
			return input+input+input;
		}else {
			return input.substring(0, 2).concat(input).concat(input.substring(0, 2));
		}
	}
}
