/*Print the following pattern for the given N number of rows.

Pattern for N = 3
 A
 BB
 CCC
 
Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26*/

package lecture3;
import java.util.Scanner;

public class Alpha_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print((char)('A'+ i - 1));
				j++;
			}
			System.out.println(" ");
			i++;
		}
		

	}

}
