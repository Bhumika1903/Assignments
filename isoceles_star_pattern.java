/*Print the following pattern
Pattern for N = 4
   * 
  *** 
 ***** 
******* 

The dots represent spaces.



Input Format :
N (Total no. of rows)

Output Format :
Pattern in N lines

Constraints :
0 <= N <= 50*/

package lecture5;
import java.util.Scanner;

public class isoceles_star_pattern {

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
			int p = 1;
			while (j <= i) {
				System.out.print("*");
				p++;
				j++;
			}
			p = i-1;
			j = 1;
			while (j <= i-1) {
				System.out.print("*");
				p--;
				j++;
			}
			System.out.println(" ");
			i++;
			
		}




	
		
		   int a=10 ; 
		   do { 
		       System.out.println("hii"); 
		     } while(a<5);
	

}
}
