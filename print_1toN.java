//Question :- Given a number n .Wite a program to print all the natural numbers till n.

package while_loop;
import java.util.Scanner;

public class print_1toN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i <= n) {
			System.out.println(i);
			i = i+1;
		}
		

	}

}
