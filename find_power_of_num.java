/*Write a program to find x to the power n (i.e. x^n). Take x 
and n from the user. You need to print the answer.

Note : For this question, you can assume that 0 raised to the power of 0 is 1

Input format :
Two integers x and n (separated by space)

Output Format :
x^n (i.e. x raise to the power n)

Constraints:
0 <= x <= 8 
0 <= n <= 9*/

package assignment_que;
import java.util.Scanner;

public class find_power_of_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		double result = Math.pow(x,n);
		System.out.println(Math.round(result));

	}

}
