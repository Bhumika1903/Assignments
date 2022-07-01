/*You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
		
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.

Output Format :
For each test case, print the sorted array/list elements in a row separated by a single space.

Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec

Sample Input 1:
1
7
0 1 2 0 2 0 1

Sample Output 1:
0 0 0 1 1 2 2 

Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0

Sample Output 2:
0 1 1 2 2 
0 0 0 1 1 2 2
*/

public class Sort_0_1_2 {
	
public static void sort012(int[] arr){
        
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < arr.length; i++) {
              if (arr[i] == 0){
                  zeroCount++;
              }
              if (arr[i] == 1){
                   oneCount++;
              }
        }
        
        for (int i = 0; i < zeroCount; i++) {
            
            arr[i] = 0;
        }
        for (int i = zeroCount; i < (zeroCount + oneCount); i++) {
            
            arr[i] = 1;
        }
        for (int i = (zeroCount + oneCount); i < arr.length; i++) {
            
            arr[i] = 2;
      }
    	
    }

	public static void main(String[] args) {
		int arr[] = {0 ,1 ,2 ,0 ,2 ,0 ,1};
		sort012(arr);
		for (int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
