package WarmUp1;

import java.util.Scanner;

public class backAround {

	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		String input=scan.nextLine();
		String backAroundString=backAround(input);
		System.out.println(backAroundString);
	}
	public static String backAround(String str) {
		 return str.substring(str.length()-1)+str+str.substring(str.length()-1);
	}
}
