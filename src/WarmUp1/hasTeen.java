package WarmUp1;

import java.util.Scanner;

public class hasTeen {
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		int num1=scan.nextInt();
		int num2= scan.nextInt();
		int num3= scan.nextInt();
		boolean inTeenrange=In1319(num1, num2, num3);
	}
	public static boolean In1319(int num1,int num2, int num3) {
	   return ((num1 >= 13 && num1 <=19 ) || (num2 >= 13 && num2<=19) || (num3>= 13 && num3 <=19 ));
	}

}
