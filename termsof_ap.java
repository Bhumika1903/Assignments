/*Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

Input format :
Integer x

Output format :
Terms of series (separated by space)

Constraints :
1 <= x <= 1,000

Sample Input 1 :
10

Sample Output 1 :
5 11 14 17 23 26 29 35 38 41

Sample Input 2 :
4

Sample Output 2 :
5 11 14 17
*/
package assignment_que;
import java.util.Scanner;

public class termsof_ap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = 1;
		int counter = 1;
		while (counter <= x) {
			int term = 3*n+2;
			if (term % 4 != 0) {
				System.out.print(term);
				System.out.print(" ");
				counter = counter+1;
		}
		n++;
	}
  }
}
