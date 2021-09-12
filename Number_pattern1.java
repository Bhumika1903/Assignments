/*Question :- Print the following pattern.


Pattern for N = 4 
1
12
123
1234*/


package pattern;
import java.util.Scanner;

public class Number_pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while (i <= n) {
			int j = 1;
			while(j <= i){
				System.out.print(j);
				j = j+1;
			}
			System.out.println();
			i = i+1;
		}
	}
}
