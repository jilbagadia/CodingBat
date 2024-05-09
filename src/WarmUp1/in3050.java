package WarmUp1;

import java.util.Scanner;

public class in3050 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean inRange=seeRange(scan.nextInt(),scan.nextInt());
		
	}
	public static boolean seeRange(int a, int b) {
		if(((30 <=a && a <=40) && (30<= b && b <=40)) || ((40<= a && a <=50) && (40<= b && b <=50))) {
			return true;
		}else {
			return false;
		}
	}
}