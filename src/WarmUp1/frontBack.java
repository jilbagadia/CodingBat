package WarmUp1;

import java.util.Scanner;

public class frontBack {
	public static void main (String [] args) {
		Scanner scan= new Scanner(System.in);
		frontBackMethod(scan.next());
		
	}
	public static String frontBackMethod(String inputString) {
		if(inputString.length()==1 || inputString.length()==0) {
			return inputString;
		}else {
			char first=inputString.charAt(0);
			char last=inputString.charAt(inputString.length()-1);
			String newString=inputString.substring(1, inputString.length()-1);
			newString=last+newString+first;
			return newString;
		}
		
	}

}
