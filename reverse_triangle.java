/*print the following pattern for given N number of rows.

For N = 4
   *
  **
 ***
*****/

package lecture5;
import java.util.Scanner;

public class reverse_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n-i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
