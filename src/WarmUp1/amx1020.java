package WarmUp1;

import java.util.Scanner;

public class amx1020 {
	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			int inRange=seeRange(scan.nextInt(),scan.nextInt());
			System.out.println(inRange);
			
		}
		public static int seeRange(int a, int b) {
			boolean first= 10<= a && a <= 20, second=10 <= b && b<=20 ;
			if( first || second ) {
				if (first==true && second==false) {
					return a;
				}else if(first== false && second == true) {
					return b;
				}else {
					if (a>b) {
						return a;
					}else return b;
				}
			}
			else return 0;
			
	}
}
