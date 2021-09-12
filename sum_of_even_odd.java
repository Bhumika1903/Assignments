/*Write a program to input an integer N and print the sum of
all its even digits and sum of all its odd digits separately.

Digits mean numbers, not the places! That is, if the
given integer is "13245", even digits are 2 & 4 and 
odd digits are 1, 3 & 5.

Input format :
 Integer N
 
Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)

Constraints
0 <= N <= 10^8*/

package assignment_que;
import java.util.Scanner;

public class sum_of_even_odd {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int evenSum=0;
	        int oddSum=0;
	        while(n>0){            
	            int num=n%10;
	            if((num)%2==0){
	                evenSum = evenSum+num;
	            } else{
	                oddSum = oddSum+num;
	            }
	            n=n/10;
	            
	        }
	        
	        System.out.println(evenSum+" "+oddSum);

	}

}
