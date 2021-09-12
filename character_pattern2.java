/*Print the following pattern for the given number of rows.
Pattern for N = 4

ABCD 
BCDE 
CDEF 
DEFG */

package lecture3;
import java.util.Scanner;

public class character_pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while (i <= n) {
			int j = 1;
			char startchar = (char)('A'+i-1);
			while (j <= n) {
				System.out.print(startchar);
				startchar++;
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}

}
