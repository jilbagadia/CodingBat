package WarmUp1;

import java.util.Scanner;

public class front3 {

	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		String input=scan.nextLine();
		String front3=front(input);
		System.out.println(front3);
	}
	public static String front(String input) {
		if(input.length()<3) {
			return input.concat(input.substring(0, input.length()).concat(input.substring(0, input.length())));
		}else return input.substring(0, 3).concat(input.substring(0, 3).concat(input.substring(0, 3)));
	}
	
}
