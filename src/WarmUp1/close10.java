package WarmUp1;

import java.util.Scanner;

public class close10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int close=closest(scan.nextInt(),scan.nextInt());
	}
	public static int closest(int a , int b) {
		if(Math.abs(10-a)>Math.abs(10-b)) {
			return b;
		}else if(Math.abs(10-a)==Math.abs(10-b)) {
			return 0;
		}else {
			return a;
		}
		
	}
}
