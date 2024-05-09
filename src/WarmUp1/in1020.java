package WarmUp1;

import java.util.Scanner;

public class in1020 {
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		int num1=scan.nextInt();
		int num2= scan.nextInt();
		boolean isInrange=In1020(num1, num2);
	}
	public static boolean In1020(int num1,int num2) {
	   return ((num1 >= 10 && num1 <=20 ) || (num2 >= 10 && num2<=20));
	}
}
