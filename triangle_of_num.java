/*Print the following pattern for the given number of rows.
Pattern for N = 4
   1 
  231 
 34521 
4567321 

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50*/

package lecture5;
import java.util.Scanner;

public class triangle_of_num {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int space = 1;
			while (space <= n-i) {
				System.out.print(" ");
				space++;
			}
			int j = 1;
			int startnum = i;
			while (j <= i) {
				System.out.print(startnum);
				startnum++;
				j++;
			}
			int p = i-1;
			int start = 2*i-2;
			j = 1;
			while (j <=i-1 ) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}

}
