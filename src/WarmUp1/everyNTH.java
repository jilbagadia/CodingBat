package WarmUp1;

import java.util.Scanner;

public class everyNTH {
	public class endUp {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			String newString = newStr(scan.nextLine(), scan.nextInt());
		}
		public static String newStr(String str, int a) {
			char [] charArray=str.toCharArray();
			String temp=Character.toString(str.charAt(0));
			for(int i = 1 ;i<charArray.length;i++) {
				if(i%a==0) {
					temp=temp+Character.toString(charArray[i]);
				}
			}
				return temp;
			}
			
		}

}
