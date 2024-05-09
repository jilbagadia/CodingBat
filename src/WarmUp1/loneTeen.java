package WarmUp1;

import java.util.Scanner;

public class loneTeen {
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		int num1=scan.nextInt();
		int num2= scan.nextInt();
		
		boolean inTeenrange=Teen(num1, num2);
	}
	public static boolean Teen(int num1,int num2) {
	   return (((num1 >= 13 && num1 <=19 ) && !(num2 >= 13 && num2<=19)) || (!(num1 >= 13 && num1 <=19 ) && (num2 >= 13 && num2<=19)));
	}

}
