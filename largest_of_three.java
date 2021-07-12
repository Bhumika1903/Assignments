//Given 3 numbers i , j , k . Print the number which is greatest among all.  

package if_else;
import java.util.Scanner;

public class largest_of_three 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		 int i = s.nextInt();
		 int j = s.nextInt();
		 int k = s.nextInt();
		 
		 if (i >= j && i >= k)
		 {
			 System.out.println(i);
		 }
		 else
		 {
			 if (j >= k &&j >= i)
			 {
				 System.out.println(j);
			 }
			 else
			 {
				 System.out.println(k);
			 }
		 }
	}
}
