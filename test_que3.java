//Given a number N, print sum of all even numbers from 1 to N.

package while_loop;
import java.util.Scanner;

public class test_que3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int sum = 0;
				
		while(i <= n) {
		    if(i % 2 == 0) {
						sum = sum+i;
					}i=i+1;
				}
				System.out.println(sum);

				
			}
		}
		

	


