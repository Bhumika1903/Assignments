/*Print the following pattern for the given N number of rows.

Pattern for N = 4
*
**
***
****

Note : There are no spaces between the stars (*).

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50*/

package lecture3;
import java.util.Scanner;

public class triangular_star_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}

}
