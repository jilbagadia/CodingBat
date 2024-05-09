package WarmUp1;

import java.util.Scanner;

public class delDel {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(containsDel(input));
	}
	public static String containsDel(String input) {
		if( input.length()>3 && input.substring(1, 4).equals("del")) {
			return input.substring(0, 1)+ input.substring(4);
		}else return input;
	}
}
