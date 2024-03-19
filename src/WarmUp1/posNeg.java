package WarmUp1;

import java.util.Scanner;

public class posNeg {

	public static void main(String [] args) {
		Scanner scanInt1= new Scanner(System.in);
		Scanner scanInt2= new Scanner(System.in);
		Scanner scanBoolean= new Scanner(System.in);
		
		boolean number=posNegMethod(scanInt1.nextInt(),scanInt2.nextInt(),scanBoolean.nextBoolean());
		System.out.println(number);
	}
	public static boolean posNegMethod(int a, int b, boolean negative) {
		
		if(negative ) {
			return (Integer.signum(a) == -1 && Integer.signum(b) == -1); 
		}else{
			return (Integer.signum(a) == 1 && Integer.signum(b) == -1) || (Integer.signum(a) == -1 && Integer.signum(b) == 1); 		
		}
			
	}
	
}
