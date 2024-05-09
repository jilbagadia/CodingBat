package WarmUp1;

import java.util.Scanner;

public class intMax {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in) ;
		int maxInt=max(scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(maxInt);
			
		
	}
	public static int max(int a,int b, int c) {
		int greater;
		if(a>b) {
			greater=a;
		}else {
			greater=b;
		}if(greater>c) {
			return greater;
		}else {
			return c;
		}
		
	}
}
