//Given two integers as an input you have to print sum of these two numbers usig for loop. 

package for_loop;
import java.util.Scanner;

public class sumtill_n {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		
		for (int i = 1;i <= n; ++i) {
			sum = sum + i;
		}
		System.out.println(sum);
		for(int i = 0; i < 2; i = i + 1) {
		     for(int j = 0; j < 2; j = j + 1) {
		          if (j == 1)
		              break;
		          System.out.print(j +" ");

	  }

   }
   }
}