/*Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array.
Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
indexes where x is present in the array (separated by space)

Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8

Sample Output :
1 3 4*/

public class allindex_of_num {
public static int[] allIndexes(int input[], int x) {
		return AllIndexesRecursive(input , x , 0);
	}
	
	public static int[] AllIndexesRecursive(int input[],int x, int start)
{

if (start == input.length) {
int[] ans = new int[0]; 
return ans;
}


int[] smallIndex = AllIndexesRecursive(input, x, start + 1);


if (input[start] == x) {
int[] myAns = new int[smallIndex.length + 1];


myAns[0] = start;
for (int i = 0; i < smallIndex.length; i++) {


myAns[i + 1] = smallIndex[i];
}
return myAns;
}
else {


return smallIndex;
}
}
 
	public static void main(String[] args) {
		int input[] = {1,2,8,4,5,6,7,8,9};
		int x = 8;
		int ans[] = allIndexes(input, x);
		for (int i = 0;i < ans.length;i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
