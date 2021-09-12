/*Print the following pattern for the given number of rows.

Pattern for N = 5
E
DE
CDE
BCDE
ABCDE

Input format :
N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26*/

package lecture3;
import java.util.Scanner;

public class interesting_alphabet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			char ch = (char)('A'+n-i);
			while (j <= i) {
				System.out.print(ch);
				ch++;
				j++;
			}
			
			System.out.println(" ");
			i++;
		}

	}

}
