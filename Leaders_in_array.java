import java.util.Scanner;

/*Given an integer array A of size n. Find and print all the leaders present in the input array.
An array element A[i] is called Leader, if all the elements following it (i.e. present at its
right) are less than or equal to A[i].

Print all the leader elements separated by space and in the same order they are present in the input array.

Input Format :
Line 1 : Integer n, size of array
Line 2 : Array A elements (separated by space)

Output Format :
 leaders of array (separated by space)
 
Constraints :
1 <= n <= 10^6

Sample Input 1 :
6
3 12 34 2 0 -1

Sample Output 1 :
34 2 0 -1

Sample Input 2 :
5
13 17 5 4 6

Sample Output 2 :
17 6*/


public class Leaders_in_array {
	
	public static void leaders(int[] input) {
		int j = 0;
		int size = input.length;
		int save[] = new int[size];
		int largest = Integer.MIN_VALUE;
		for (int i = size-1;i>=0;i--) {
			if (input[i] >= largest) {
				save[j] = input[i];
				j++;
				largest = input[i];
			}
		}
		for (int i = j-1;i>=0;i--) {
			System.out.print(save[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		leaders(input);	

	}

}
