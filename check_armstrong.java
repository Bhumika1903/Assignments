/*Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.

For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634

Input Format :
Integer n

Output Format :
true or false

Sample Input 1 :
1

Sample Output 1 :
true

Sample Input 2 :
103

Sample Output 2 :
false*/

package test_1;
import java.util.Scanner;

public class check_armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int digits = 0;
		int num = n;
		while (num > 0) {
			digits++;
			num /= 10;
		}
		int newnum = 0;
		num = n;
		while (num > 0) {
			int last = num % 10;
			newnum += (int) Math.pow(last, digits);
			num /= 10;
		}
		if (newnum == n) {
			System.out.println("true");
		}else {
			System.out.println(false);
		}
		

	}

}
