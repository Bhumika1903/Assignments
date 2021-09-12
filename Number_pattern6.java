/*Print the following pattern
Pattern for N = 4
   *
  ***
 *****
********/

/*Input Format :
N (Total no. of rows)

Output Format :
Pattern in N lines

Constraints :
0 <= N <= 50*/


package pattern;
import java.util.*;

public class Number_pattern6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i<=n) {
			int space = 1;
			while (space <= n-i) {
				System.out.print(" ");
				space = space + 1;
			}
			int j = 1;
			while (j<=i) {
				System.out.print("*");
				j = j+1;
			}
			int k = i-1;
			while (k>=1) {
				System.out.print("*");
				k = k-1;
			}
			System.out.println();
			i = i+1;
		}
	}
}
