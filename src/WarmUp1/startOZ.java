package WarmUp1;

import java.util.Scanner;

public class startOZ {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(OZ(input));
	}
	public static String OZ(String input) {
		String subStr=input.substring(0,2);
		if(subStr.equals("oz")) {
			return subStr;
		}else if(subStr.contains("o")) {
			return "o";
		}else if(subStr.contains("o")) {
			return "z";
		}else return null;
		
	}

}
