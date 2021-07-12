/*Given three values - Start Fahrenheit Value (S), End 
Fahrenheit value (E) and Step Size (W), you need to
convert all Fahrenheit values from Start to End at the gap
of W, into their corresponding Celsius values and print the table.*/

/*Input Format :
3 integers - S, E and W respectively 

Output Format :
Fahrenheit to Celsius conversion table. One line for
every Fahrenheit and corresponding Celsius value. On
Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")

Constraints :
0 <= S <= 80
S <= E <=  900
0 <= W <= 40 */

package while_loop;
import java.util.Scanner;

public class test_que4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		 while(S<=E) {

	           int C=((5*(S-32))/9);

	         System.out.println(S+" "+C);

	        S=S+W;

	         

	}

}
}