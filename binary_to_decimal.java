/*Given a binary number as an integer N, convert it into decimal and print.

Input format :
An integer N in the Binary Format

Output format :
Corresponding Decimal number (as integer)

Constraints :
0 <= N <= 10^9

Sample Input 1 :
1100

Sample Output 1 :
12

Sample Input 2 :
111

Sample Output 2 :
7*/

package assignment_que;
import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int pv = 1;
		while (n != 0) {
			int digit = n%10;
			ans = (ans + (pv*digit));
			n = n/10;
			pv *= 2;
		}
		System.out.println(ans);

	}

}
