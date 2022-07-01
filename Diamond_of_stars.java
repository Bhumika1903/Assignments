/*Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5
  *
 ***
*****
 ***
  *

Input format :
N (Total no. of rows and can only be odd)

Output format :
Pattern in N lines

Constraints :
1 <= N <= 49*/

package lecture5;
import java.util.Scanner;

public class Diamond_of_stars {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n= sc.nextInt();
	        
	        int i=1;
	        int l= (n/2)+1;
	        
	        while(i<=n){
	            if(i<=l){
	                int s=1;
	            while(s<=l-i){
	                 System.out.print(" ");
	                s++;
	            }
	                 int j=1;
	            while(j<=2*i-1){
	                 System.out.print("*");
	                j++;
	               }
	            }
	            else{
	                int s=1;
	            while(s<=i-l){
	                 System.out.print(" ");
	                s++;
	              }
	                int j =1;
	                int k=i-l;
	                while(j<=2*i-1-4*k){
	                    System.out.print("*");
	                    j++;
	                    
	                }
	                k++;
	            }
	             System.out.println();
	            i++;
	            
	            
	           
	        }

	}

}
