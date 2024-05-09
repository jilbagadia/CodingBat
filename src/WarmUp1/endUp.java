package WarmUp1;

import java.util.Scanner;

public class endUp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String newString = upperCase(scan.nextLine());
	}
	public static String upperCase(String input) {
		if(input.length()<=3) {
			return input.toUpperCase();
		}else {
			String upperStr=input.substring(input.length()-3);
			String start=input.substring(0, input.length()-3);
			return start+upperStr.toUpperCase();
		}
	}

}
