/*Print the following pattern for given number of rows.

Input format :
Integer N (Total number of rows)

Output Format :
Pattern in N lines

Sample Input :
   5
   
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
*/

package test_1;
import java.util.Scanner;

public class num_star_pattern {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
	        int n = s.nextInt();
	        for(int i=1;i<=n;i++){
			      for(int j=n;j>=1;j--){  
			          if(j!=i)  
			           System.out.print(j);  
			           else  
			            System.out.print("*");  
			   }  
			   System.out.println(" ");  
			   }  
	}

}
