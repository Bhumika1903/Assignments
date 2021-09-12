/*Print the following pattern for the given N number of rows.

Pattern for N = 4
4321 
4321 
4321 
4321*/

package lecture3;
import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println(" ");
			i++;
		}
				
	}

}
