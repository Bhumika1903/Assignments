/*Print the following pattern for the given N number of rows.

Pattern for N = 4

4444
333
22
1

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50*/

package lecture5;
import java.util.Scanner;

public class inverted_number_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j<= n-i+1) {
				System.out.print(n-i+1);
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
