package WarmUp1;

import java.util.Scanner;

public class lastNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean sameDigit=checkLastDigit(scan.nextInt(), scan.nextInt());
	}
	public static boolean checkLastDigit(int a , int b) {
		if(a%10 == b%10) {
			return true;
		}else return false;
	}

}
