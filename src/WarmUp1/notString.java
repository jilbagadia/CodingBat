package WarmUp1;

import java.util.Scanner;

public class notString {

	public static void main (String [] args) {
		Scanner scan= new Scanner(System.in);
		notStringMethod(scan.next());
	}
	public static String notStringMethod(String inputString) {
		 if(inputString.startsWith("not ")|| inputString.equals("not")) {
			 return inputString;
		 }else {
			 return "not "+inputString;
		 }
	}
}
