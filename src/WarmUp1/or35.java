package WarmUp1;

import java.util.Scanner;

public class or35 {

	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		boolean isMultiple=multiple(num);
	}
	public static boolean multiple(int num) {
		if(num%3==0 || num%5==0) {
			return true;
		}else return false;
	}
}
