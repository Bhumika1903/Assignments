/*Print the following pattern

Pattern for N = 4
1
23
345
4567*/

package pattern;
import java.util.Scanner;

public class Number_pattern4 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while (i <= n) {
			int j = 0;
			while (j < i) {
				System.out.print(j+i);
				j = j+1;
			}
			System.out.println(" ");
			i = i+1;
		}
		
	}

}
