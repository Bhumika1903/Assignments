/*Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
'true' or 'false'

Constraints :
1 <= N <= 10^3

Sample Input 1 :
3
9 8 10
8

Sample Output 1 :
true

Sample Input 2 :
3
9 8 10
2

Sample Output 2 :
false
*/
public class check_num_in_array {
	public static boolean checkNumber(int input[], int x) {
		return check(input, x, 0);

	}

	public static boolean check(int input[], int x, int size) {
		if (size == input.length)
			return false;
		else {
			if (input[size] == x) {
				return true;
			}

		}
		boolean ans = check(input, x, size + 1);
		return ans;
	}

	public static void main(String[] args) {
		int input[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int x = 8;
		boolean ans = checkNumber(input, x);
		System.out.println(ans);

	}

}
