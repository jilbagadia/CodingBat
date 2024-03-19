package WarmUp1;

import java.util.Scanner;

public class icyHot {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		boolean greaterLesserCheck=greaterLesser(num1, num2);
		}
	public static boolean greaterLesser(int num1,int num2) {
		return (num1<0 && num2>100) || (num1 >100 && num2 <0);
	}

}
