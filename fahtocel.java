// Question :- Write a code to convert fahrenheit value into celsius value take input from user.

package lecture1;

import java.util.Scanner;

public class fahtocel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
		
		int cel = (5*(f-32))/9;
		
		System.out.println(cel);
		System.out.println(9/5);
		System.out.println(9.0/5);
		System.out.println(9%5);
		System.out.println('A'+1);
		System.out.println('a'+'b');
		char c = 'a';
		char i = (char)(c+3);
		System.out.println(i);
	}

}
