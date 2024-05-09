package WarmUp1;

import java.util.Scanner;

public class stringE {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean containsE=checkE(scan.nextLine());
	}
	public static boolean checkE(String input) {
		int count=0;
		char e []= input.toCharArray();
		for(char a:e) {
			if(Character.toString(a).equals("e")) {
				count=count+1;
			}
		}
		if(1<= count && count  <= 3) {
			return true;
		}else return false;
	}

}
