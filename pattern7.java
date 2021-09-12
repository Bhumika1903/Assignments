/*Print the following pattern for the given N number of rows.

Pattern for N = 4
1 
23 
456 
78910 */


package lecture3;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int startnum = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(startnum);
				startnum++;
				j++;
			}
			System.out.println(" ");
			i++;
		}		
	}

}
